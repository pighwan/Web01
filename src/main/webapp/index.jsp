<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** My First Web Project **</title>
</head>
<body>
<h2>** My First Web Project **</h2>
<!-- login 확인 후 인삿말 추가  
	=> session 의 Attribute 중, idno 존재 유무 로 -->
<c:if test="${! empty sessionScope.idno}">
	=> ${sessionScope.name} 님 안녕하세요 ~~<br> 
</c:if>
<hr>
<img src="./image/snow.jpg" width="400" height="300">
<hr>
<a href="/Web01/helloS">StartServlet</a>&nbsp;&nbsp;
<a href="/Web01/99">GuGu_Servlet</a>&nbsp;&nbsp;
<a href="/Web01/servletTestForm/mvc1_idnoCheck.html">sDetail_01_02</a>&nbsp;&nbsp;
<a href="/Web01/02slist">MVC2_sList</a><br>
<!-- login 여부에 따라 Login 또는 Logout 표시하기 -->
<c:if test="${! empty sessionScope.idno}">
	<a href="/Web01/logout">sLogout</a><br>
</c:if>
<c:if test="${empty sessionScope.idno}">
	<a href="/Web01/servletTestForm/form05_Login.jsp">sLogin</a><br>
</c:if>
</body>
</html>