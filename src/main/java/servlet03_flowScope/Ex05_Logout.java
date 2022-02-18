package servlet03_flowScope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Ex05_Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Ex05_Logout() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>** Logout **</h3><br>");
		
		HttpSession session = request.getSession(false);
		
		if ( session != null && session.getAttribute("name") != null ) {
			out.print("<h3> => "+session.getAttribute("name")+" 님 안녕히 가세요 ~~</h3>");
			out.print("<h3> => Logout 성공 </h3>");
			session.invalidate();  
			
			// ** invalidate : 무효화 
			// => 세션객체 자체를 소멸시키는것이 아니라, 세션을 초기화하고 무효화 시킴.
			//    - getId() 메서드 외에는 호출 불가능
			//    - getSession(false) 로 참조 불가능 -> null return
			//    - 메모리 삭제는 조건 충족시 가비지 콜렉터가 처리하는듯 (?)
			// ** invalidate 후 session 값 확인
			// => session 이 null 은 아니지만 session 은 무효화되어 메서드 접근 불가함. 
			if (session==null) 
				// System.out.println("** Session is null, name => "+session.getAttribute("name"));
			 	// => IllegalStateException: getAttribute: 세션이 이미 무효화(invalidate) 되었습니다.
				System.out.println("** Session is null 확인하기 **");
			else System.out.println("** Session is Not null **");  // 실행됨
			
		}else out.print("<h3> => 로그인 되어있지 않습니다 ~~</h3>");
		
		out.print("<br><br><a href='/Web01/servletTestForm/form05_Login.jsp'>Login</a>");
		out.print("&nbsp;&nbsp;<a href='/Web01/index.jsp'>[HOME]</a>");
		
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
