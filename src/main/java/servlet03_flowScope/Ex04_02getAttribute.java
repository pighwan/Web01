package servlet03_flowScope;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/02geta")
public class Ex04_02getAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Ex04_02getAttribute() {
        super();
    }
 // ** Attribute 사용
 // => getAttribute , 출력   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. getAttribute
		// => request
		String rNum = (String)request.getAttribute("reqNum");
		String rName = (String)request.getAttribute("reqName");
		
		// => session
		String sNum = (String)request.getSession().getAttribute("sesNum");
		String sName = (String)request.getSession().getAttribute("sesName");
		
		// 2. View 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<pre><h3>");
		out.println("** getParameter 결과 **");
		// request 의 값들이 유지되고있는지 확인
		out.println("	num : "+request.getParameter("num"));
		out.println("	name: "+request.getParameter("name"));
		out.println("<hr>");
		out.println("** getAttribute 결과 **");
		out.println("=> request");
		out.println("	reqNum : "+rNum);
		out.println("	reqName : "+rName);
		out.println("=> session");
		out.println("	sesNum : "+sNum);
		out.println("	sesName : "+sName);		
		out.print("</h3></pre>");
	} //doGet 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
