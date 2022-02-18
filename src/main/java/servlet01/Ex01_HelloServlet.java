package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//** 톰켓10 사용시 주의사항
//=> Java 8 까지 지원
//=> 문제가 많아 실무에서 잘 안쓰임
//=> javax.servlet을 지원안함.
//   그러므로 javax -> jakarta 로 변경

//** HttpServlet 계층도
// Object -> GenericServlet (A) -> HttpServlet (A)

//** Servlet 의 실행방식
// => 클라이언트의 요청에 자동반응하는 이벤트 드리븐 방식으로 작동
// => 요청방식 이 Get -> doGet , Post -> doPost

@WebServlet("/helloS")
public class Ex01_HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    // 생성자   
    public Ex01_HelloServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 한글처리
		response.setContentType("text/html; charset=UTF-8");
		// 출력문
		// => 출력객체 생성 -> 출력코드
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1 style='color:blue;'>** Hello Servlet !!! **</h1>");
		out.print("<h1 style='color:red;'>** 안녕 Servlet 하하하 !!! **</h1>");
		out.print("<h1>** Servlet은 Java Coding 매우편리 ~~~~</h1>");
		out.print("<h1>** 그러나 view 작성 (Html Coding) 매우불편 ~~~</h1>");
		out.print("</body></html>");
	} //doGet 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
