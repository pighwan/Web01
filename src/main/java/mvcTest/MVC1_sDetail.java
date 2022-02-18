package mvcTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sdetail")
public class MVC1_sDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC1_sDetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) 요청분석
		// => 한글처리 (Get방식, utf-8 생략가능)
		// => parameter 처리
		String idno = request.getParameter("idno");
		// 2) 서비스처리
		StudentVO vo = new StudentVO();
		StudentService service = new StudentService();
		vo.setIdno(idno);
		vo=service.selectOne(vo);
		// 있으면 vo 에 담겨있고 없으면 vo 는 null
		
		// 3) 결과출력 (View) 
		// => 한글처리, out 객체생성
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>** Student Detail 조회 **</h2>");
		
		if (vo!=null) {
			out.print("<pre><h3>");
			out.println("* Idno : "+ vo.getIdno());
			out.println("* Name : "+ vo.getName());
			out.println("* 성별  : "+ vo.getGender());
			out.println("* 나이  : "+ vo.getAge());
			out.println("* Java : "+ vo.getJava());
			out.println("* Html : "+ vo.getHtml());
			out.println("* 합계  : "+ (vo.getJava()+vo.getHtml()));
			out.print("</h3></pre>");
		}else {
			out.println("=> "+idno+" 에 해당하는 자료가 없습니다.");
		}
		
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} //doPost
} //class
