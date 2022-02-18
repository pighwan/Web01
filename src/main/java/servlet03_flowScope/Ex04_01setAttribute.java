package servlet03_flowScope;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/01seta")
public class Ex04_01setAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex04_01setAttribute() {
        super();
    }
    
 // ** Attribute 생성
 // => setAttribute("Attribute Name", Value_ObjectType)    
 // => 웹 환경에서 제공되는 기본객체들 (request, response, out, session ....) 중
 //    page, request, session, application 에 만 생성가능  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) request 처리
		// => form 없이 쿼리스트링 으로 Test
		//    ~~/01seta?num=1234&name=홍길동 
		request.setCharacterEncoding("utf-8");
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		System.out.println("** setAttribute **");
		System.out.println("** Parameter num, name => "+num+name);
		
		// 2) attribute 에 보관
		// => request, session 비교
		request.setAttribute("reqNum", num);
		request.setAttribute("reqName", name);
		// => session 인스턴스 생성
		HttpSession session = request.getSession();
		session.setAttribute("sesNum", num);
		session.setAttribute("sesName", name);
		// => session 인스턴스를 많이 사용하지 않는다면 아래처럼 set
		//    request.getSession().setAttribute("sesName", name);
		
		// 3) response 처리 & 확인
		// 3.1) Forward => 서블릿 02geta
		String uri = "02geta";
		//request.getRequestDispatcher(uri).forward(request, response);
		
		// 3.2) Redirect
		response.sendRedirect(uri);
	
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
