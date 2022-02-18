<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Student Detail_MVC2 JspJSTL **</title>
</head>
<body>
<h2>** Student Detail_MVC2 JspJSTL **</h2>
=> 검색 결과에 따라 검색된 자료 출력 또는 "없습니다" 메시지 출력하기<br>
<hr><br> 
<c:if test="${empty apple}">
	<h3>${param.idno} 님 의 자료는 없습니다 ~~</h3>
</c:if>
<c:if test="${not empty apple}">
	<table>
	<tr><td bgcolor="Lavender">IdNo</td><td>${apple.idno}</td></tr>
	<tr><td bgcolor="Lavender">Name</td><td>${apple.name}</td></tr>
	<tr><td bgcolor="Lavender">성별</td><td>${apple.gender}</td></tr>
	<tr><td bgcolor="Lavender">나이</td><td>${apple.age}</td></tr>
	<tr><td bgcolor="Lavender">Java</td><td>${apple.java}</td></tr>
	<tr><td bgcolor="Lavender">Html</td><td>${apple.html}</td></tr>
	<tr><td bgcolor="Lavender">합계</td><td>${apple.java+apple.html}</td></tr>
	<tr><td bgcolor="Lavender">평균</td><td>${(apple.java+apple.html)/2}</td></tr>
	</table>
</c:if>

</body>
</html>