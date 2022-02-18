package servlet03_flowScope;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/slogin")
public class Ex05_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Ex05_Login() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) Request 처리
		String idno = request.getParameter("idno");
		String name = request.getParameter("name");
		String uri = null ;
		
		// 2) Service 처리 & 결과에 따른 View
		// => DB 처리 (추후)
		// => 성공조건 : 030213-3039444 , 홍길동
		// => 성공 : 로그인 정보를 session 에 보관, form05_LoginSuccess.jsp 로
		// => 실패 : 재로그인 유도, form05_Login.jsp
		
		if (idno.equals("030213-3039444") && name.equals("홍길동")) {
				// 성공
			request.getSession().setAttribute("idno",idno);
			request.getSession().setAttribute("name",name);
			//System.out.println("** Login Success idno , name => "+idno+name);
			System.out.println("** Login Success idno , name => "
					+request.getSession().getAttribute("idno")
					+request.getSession().getAttribute("name"));
			
			uri="servletTestForm/form05_LoginSuccess.jsp";
		}else { // 실패
			System.out.println("** Login Fail idno , name => "+idno+name);
			uri="servletTestForm/form05_Login.jsp";
		}
		// 3) Forward
		request.getRequestDispatcher(uri).forward(request, response); 
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
