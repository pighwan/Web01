package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestinfo")
public class Ex05_RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Ex05_RequestInfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ** 기본 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>** Request 주요 메서드 **</h2>");
		out.print("<h2>=> Console 창에서 확인 하세요 ~~</h2>");
		out.print("<h2>=> 1) HeaderNames & Value</h2>");
		out.print("<h2>=> 2) ContextPath</h2>");
		out.print("<h3>......JAVA 웹애플리케이션 현재 프로젝트의 최상위 경로</h3>");
		out.print("<h2>=> 3) RealPath</h2>");
		out.print("<h2>=> 4) 기타등등</h2>");
		
		System.out.println("** 1) HeaderNames & Value **");
	    Enumeration<String> hNames = request.getHeaderNames();
	    while (hNames.hasMoreElements()) {
	    	String hName = hNames.nextElement();
	    	String hValue = request.getHeader(hName);
	    	System.out.println(hName+" => "+hValue);
	    } //while
	    
	    System.out.println("\n** 2) ContextPath => "+ request.getContextPath());
	    System.out.println("** 3) RealPath => "+ request.getRealPath("/"));
	    System.out.println("** 4) 기타등등 **");
	    System.out.println("**    RemoteAddr => "+ request.getRemoteAddr());
	    System.out.println("**    Method => "+ request.getMethod());
	    System.out.println("**    RequestURL => "+ request.getRequestURL());
	    System.out.println("**    RequestURI => "+ request.getRequestURI());
	    System.out.println("**    ServerName => "+ request.getServerName());
	    System.out.println("**    ServerPort => "+ request.getServerPort());
	    System.out.println("**    ServletPath => "+ request.getServletPath());
		
		out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2>");
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} // doPost
} //class
