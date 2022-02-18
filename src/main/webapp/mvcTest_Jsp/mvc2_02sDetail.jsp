<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Student Detail_MVC2 Jsp **</title>
<%
	StudentVO vo = new StudentVO();
	vo = (StudentVO)request.getAttribute("apple");
%>
</head>
<body>
<h2>** Student Detail_MVC2 Jsp **</h2>
<% if (vo==null) {%>
	=> <%=request.getParameter("idno")%> 에 해당하는 자료가 없습니다.
<% } else { %>
<table>
	<tr><td bgcolor="Lavender">IdNo</td><td><%=vo.getIdno()%></td></tr>
	<tr><td bgcolor="Lavender">Name</td><td><%=vo.getName()%></td></tr>
	<tr><td bgcolor="Lavender">성별</td><td><%=vo.getGender()%></td></tr>
	<tr><td bgcolor="Lavender">나이</td><td><%=vo.getAge()%></td></tr>
	<tr><td bgcolor="Lavender">Java</td><td><%=vo.getJava()%></td></tr>
	<tr><td bgcolor="Lavender">Html</td><td><%=vo.getHtml()%></td></tr>
</table>
<% } %>
</body>
</html>