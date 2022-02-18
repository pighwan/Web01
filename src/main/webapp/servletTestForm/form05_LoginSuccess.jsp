<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Login Success **</title>
</head>
<body>
<h2>** Login Success **</h2>
<h2> ~~~ 안녕하세요 ~~~  </h2>
=> EL 적용 <br>
=> ${sessionScope.name} 님 반갑습니다 ~~ <br>
<br><br><hr>
<a href="/Web01/loginCheck">Login상태 확인</a>&nbsp;&nbsp;
<a href="/Web01/logout">Logout</a>
<a href="/Web01/index.jsp">[Home]</a>
</body>
</html>