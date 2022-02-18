package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getpost")
public class Ex03_GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex03_GetPost() {
        super();
    }
    
// ** HttpServletRequest 계층도
// => ServletRequest (I) -> HttpServletRequest (I)     
    
// ** Get : request 의 header 영역의 url에 쿼리스트링으로 전달,
//          일반적으로 256 byte 이내로 크기제한이 있는 것으로 알려져 있으나,
//          이 용량은 브라우져 또는 장비에 따라 다를수 있음
//          결론은 이미지 등 무거운 자료의 전송은 대부분 불가능 하므로 이때는 post로 해야함.  
// ** Post: request 의 body 영역에 담겨져 전달 (크기제한 없음, 보안성) 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		// 한글처리
		// => Get 방식 : request Parameter 는 안해도 됨 
		//    Get 방식에서는 서버가 default "UTF-8" 로 처리 하기 때문 
		//   ( html 문서에서 "UTF-8" 작성되었고 , get 방식으로 전송되면 생략가능
		//     단, post 방식에서는 처리해야함 ) 
		response.setContentType("text/html; charset=UTF-8");
		// ** response 타입 지정 
		// => 웹브라우져에게 처리할 데이터의 MIME 타입을 알려줌
		// => MIME : Multipurpose Internet Mail Extensions
		// => 데이터 송.수신시 자료의 형식에 대한 정보 
		// => Jsp 의 page 디렉티브의 contentType 속성값과 동일
		
		// 요청분석
		// => parameter(전송된 입력값) 처리
		String id = request.getParameter("id");  
		String name = request.getParameter("name");		

		// 출력문
		// => 출력객체생성, view 작성
		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>");
		out.print("** Get Test **<br>");
		out.print("=> action 정상적으로 전달됨 ~~<br>");
		out.print("=> id  : "+id+"<br>");
		out.print("=> name: "+name+"<br>");
		out.print("</h2></body></html>");
		
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리
		// => Post 요청시에는 반드시 한글처리 필요함.
		//    Parameter 처리 전에 해야함.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");  
		String name = request.getParameter("name");		
		
		// 출력문
		// => 출력객체생성, view 작성
		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>");
		out.print("** Post Test **<br>");
		out.print("=> action 정상적으로 전달됨 ~~<br>");
		out.print("=> id  : "+id+"<br>");
		out.print("=> name: "+name+"<br>");
		out.print("</h2></body></html>");
	} //doPost
} //class
