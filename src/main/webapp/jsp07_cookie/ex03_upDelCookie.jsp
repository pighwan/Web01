<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Cookie 수정, 삭제, 유효시간 **</title>
</head>
<body>
<h3><pre>
** Cookie 수정, 삭제, 유효시간 **

=> request 의 쿠키목록을 확인해서
   수정.삭제 하려는 쿠키를 찾아,
   인스턴스를 만들고 수정.삭제 후 재전송함.
   
=> 쿠키의 유효시간 설정
	-> setMaxAge(10) -> 초단위 (1시간: 60*60)
	-> 유효시간 0 을 주면 삭제됨.	     

=> 실습
	-> MyCookie1 value 수정후, MaxAge 10초 : 수정 & 자동삭제
	-> MyCookie2 MaxAge 0 으로 삭제
<%
	Cookie[] ck = request.getCookies();
	if ( ck!=null && ck.length>0 ) {
		for (Cookie c:ck) {
			if (c.getName().equals("MyCookie1")) {
				// 수정
				Cookie newck = new Cookie(c.getName(),"NewColor");
				// 10초 후 삭제 추가하기
				newck.setMaxAge(10);
				response.addCookie(newck);
			}else if (c.getName().equals("MyCookie2")) {
				// 삭제
				Cookie delck = new Cookie(c.getName(),"delete");
				delck.setMaxAge(0);  // 음수(-1) -> 오류는 없지만 삭제안됨
				response.addCookie(delck);
			} //if
		} //for
	}else {
		out.print("** Cookie Not Found **");
	}
%>
<hr>
=> <a href="ex01_viewCookie.jsp" >ViewCookies</a>
=> <a href="ex02_makeCookie.jsp" >MakeCookies</a>
</pre></h3>
</body>
</html>