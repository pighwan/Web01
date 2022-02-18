<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Hello JSP **</title>
</head>
<body>
<h3>** Hello JSP !!! **</h3>
<h3>** 안녕 하세요 ~~~ **</h3>
<h3>** Hi Java !!! **</h3>
<% 	int i = 1234;
	String name="홍길동"; 
%>
<h3> i * 2 = <%=i*2%></h3>
<h3> name = <%=name%></h3>
<hr>
<h3>** Java Code 작성 : 매우 불편 **</h3>
<h3>** View 작성 : 매우 편리 **</h3>
</body>
</html>