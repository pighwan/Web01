package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/radio")
public class Ex02_RadioText extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Ex02_RadioText() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request 처리
		// => 한글처리, parameter 처리
		//    (단, Get  방식에서는 한글처리 생략가능)
		request.setCharacterEncoding("utf-8");
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mailcheck");
		String content = request.getParameter("content");
		
		if (mail.equals("Yes")) mail = "수신동의";
		else mail = "수신거절";
		
		// response 처리
		// => 한글처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<h2>** Radio Test **</h2>");
		out.print("<h2>** 성별 : "+gender+"</h2>");
		out.print("<h2>** 메일 : "+mail+"</h2>");
		out.print("<h2>** 인사 : "+content+"<br>");
		out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2><br>");
	
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} // doPost
} //class
