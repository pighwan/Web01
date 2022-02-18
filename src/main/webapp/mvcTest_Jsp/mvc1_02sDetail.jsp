<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Student Detail_MVC1 Jsp **</title>
<%
	String idno = request.getParameter("idno");
	StudentVO vo = new StudentVO();
	StudentService service = new StudentService();
	vo.setIdno(idno);
	vo=service.selectOne(vo);
%>
</head>
<body>
<h2>** Student Detail_MVC1 Jsp **</h2>
<% if (vo==null) {%>
	=> <%=idno%> 에 해당하는 자료가 없습니다.
<% } else { %>
<table>
	<tr><td bgcolor="aqua">IdNo</td><td><%=vo.getIdno()%></td></tr>
	<tr><td bgcolor="aqua">Name</td><td><%=vo.getName()%></td></tr>
	<tr><td bgcolor="aqua">성별</td><td><%=vo.getGender()%></td></tr>
	<tr><td bgcolor="aqua">나이</td><td><%=vo.getAge()%></td></tr>
	<tr><td bgcolor="aqua">Java</td><td><%=vo.getJava()%></td></tr>
	<tr><td bgcolor="aqua">Html</td><td><%=vo.getHtml()%></td></tr>
</table>
<% } %>
</body>
</html>