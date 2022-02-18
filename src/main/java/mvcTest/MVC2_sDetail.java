package mvcTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/02sdetail")
public class MVC2_sDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_sDetail() {
        super();
    }
// ** MVC2 Test
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) 요청분석
		String idno = request.getParameter("idno");
		
		// 2) 서비스처리
		StudentVO vo = new StudentVO();
		StudentService service = new StudentService();
		vo.setIdno(idno);
		vo=service.selectOne(vo);
		
		// 3) 결과출력 (View) -> JSP 에게로 
		// => View 가 결과를 출력할 수 있도록 메모리에 보관 -> setAttribute 
		// => View 를 담당하는 JSP 에게 맡김
		request.setAttribute("apple", vo);
		
		request.getRequestDispatcher("mvcTest_Jsp/mvc2_04sDetailJSTL.jsp").forward(request, response); 
		// => mvcTest_Jsp/mvc2_02sDetail.jsp -> Java 스크립트 적용
		// => mvcTest_Jsp/mvc2_03sDetailEL.jsp -> EL 적용 
		// => mvcTest_Jsp/mvc2_04sDetailJSTL.jsp -> JSTL 적용 
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} //doPost
} //class
