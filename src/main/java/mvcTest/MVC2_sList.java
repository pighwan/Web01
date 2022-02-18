package mvcTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/02slist")
public class MVC2_sList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MVC2_sList() {
        super();
    }
	// ** sList 요청
	// => MVC 패턴2 : View , Controller 가 분리됨.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) 요청분석 & Service 처리 => Controller 역할
		StudentService service = new StudentService();
		List<StudentVO> list = new ArrayList<StudentVO>();		
		list = service.selectList();
		
		// 2) 결과 처리
		// => View 가 결과를 출력할 수 있도록 메모리에 보관 -> setAttribute 
		// => View 를 담당하는 JSP 에게 맡김
		request.setAttribute("banana", list);
		request.getRequestDispatcher("mvcTest_Jsp/mvc2_05sListJSTL.jsp").forward(request, response);
		
		// => mvcTest_Jsp/mvc2_01sList.jsp : JavaCode Test
		// => mvcTest_Jsp/mvc2_05sListJSTL.jsp : JSTL Test
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} //doPost 
} //class
