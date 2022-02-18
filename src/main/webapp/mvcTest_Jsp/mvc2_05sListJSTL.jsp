<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** StudentList_MVC2 JspJSTL **</title>
</head>
<body>
<h2>** StudentList_MVC2 JspJSTL **</h2>
<table width=100% >
	<tr bgcolor="pink" height="50">
		<th>IdNo</th><th>Name</th><th>성별</th><th>나이</th>
		<th>Java</th><th>Html</th><th>합계</th><th>평균</th>
	</tr>
<c:if test="${empty banana}">
	<tr height="50"><td colspan="6">** 출력할 자료가 없습니다 **</td></tr>
</c:if>	
<c:if test="${not empty banana}">	
	<c:forEach var="list" items="${banana}">
	<tr height="50"> 
		<td><a href="/Web01/02sdetail?idno=${list.idno}">${list.idno}</a></td>
		<td>${list.name}</td>	
		<td>${list.gender}</td><td>${list.age}</td>
		<td>${list.java}</td><td>${list.html}</td>
		<td>${list.java+list.html}</td><td>${(list.java+list.html)/2}</td>
	</tr>
	</c:forEach>
</c:if>	
</table>
<hr>
</body>
</html>