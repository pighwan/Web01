<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Student Detail_MVC2 JspEL **</title>
</head>
<body>
<h2>** Student Detail_MVC2 JspEL **</h2>
* Request Student_IdNo : ${param.idno}<br>
* Student Found : ${ not empty apple}<br> <%--동일 ${ ! empty apple} --%>

<hr>
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
</body>
</html>