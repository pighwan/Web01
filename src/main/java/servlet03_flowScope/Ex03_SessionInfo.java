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
 
@WebServlet("/Ex03_SessionInfo")
public class Ex03_SessionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Ex03_SessionInfo() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Session 생성
		// => 클라이언트가 접속함과 동시에 서버에서 자동생성됨
		// => 이 값을 코드내에서 사용하기 위해 전달받음
		HttpSession session = request.getSession();
		
		// 2. Session info 출력
		// => 확인 : 새로고침 버튼 누르면, session_id 변경없고, now 와 Last... 만 변경됨
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<pre><h3>");
		out.println("** Session Info **");
		out.println("** Session ID => "+session.getId());
		// => 클라이언트 접속시 서버가 자동으로 생성하는 session_id
		//    Session ID: ED93A95D29E7D5F03E94E50B44F6968A
		
		out.println("** 현재시간 => "+formatter.format(now));
		// 생성시간
		now.setTime(session.getCreationTime());
		out.println("** CreationTime => "+formatter.format(now));
		// 마지막 접근시간
		now.setTime(session.getLastAccessedTime());
		out.println("** LastAccessedTime => "+formatter.format(now));
		out.print("</h3></pre>");
		
		// 3. Session 활용
		// => 세션 유효시간 설정 ( 초단위, 1시간 60*60 )
		// => 확인: 10초 후 새로고침 버튼 누르면, session_id 와 모두 변경됨
		// => 설정화일 (web.xml) 에서도 설정 가능
		//    Tag session-config 의 subTag session-timeout 
		//session.setMaxInactiveInterval(10); // 단위 초  
		
		// 4. Session 강제종료
		// => 확인: 새로고침 버튼 누르면 무조건 session_id 와 모두 변경됨 		
		session.invalidate();
		if (session==null) System.out.println("** session.invalidate() => Session is null **");
		else System.out.println("** session.invalidate() => Session is Not null **");
	
	} //doGet 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
