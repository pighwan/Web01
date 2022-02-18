package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class Ex03_Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Ex03_Check() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ** request 처리
		// => 한글처리 (Get: default utf-8 , Post:반드시 처리해야함)
		request.setCharacterEncoding("utf-8");
		
		// ** checkbox : 하나의 name에 복수개의 Value 를 가짐
		// => getParameterValues("..") 이용하여 배열로 처리함.
		String[] gift = request.getParameterValues("gift");
		 
		// ** response 처리
		// => 한글처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<h2>** CheckBox Test **</h2>");
		// 선택을 했는지 안했는지 확인
		if (gift != null) {
			out.print("<h2>** 선택항목 => </h2>");
			for (String s:gift) {
				out.print(s+"<br>");
			}
		}else {
			out.print("<h2>** 선택항목이 없습니다 ~~ **</h2>");
		}
		out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2><br>");
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} // doPost
} //class
