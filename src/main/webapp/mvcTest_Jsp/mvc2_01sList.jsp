<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.* , mvcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** StudentList_MVC2 Jsp **</title>
<%
	List<StudentVO> list = new ArrayList<StudentVO>();		
	list = (List<StudentVO>)request.getAttribute("banana");
%>
</head>
<body>
<h2>** StudentList_MVC2 Jsp **</h2>
<table width=400 >
	<tr bgcolor="pink">
		<th>IdNo</th><th>Name</th><th>성별</th><th>나이</th><th>Java</th><th>Html</th>
	</tr>
<%  
if (list != null) {
	for (StudentVO s:list) { %>
	<tr> 
		<td><%=s.getIdno()%></td><td><%=s.getName()%></td>	
		<td><%=s.getGender()%></td><td><%=s.getAge()%></td>
		<td><%=s.getJava()%></td><td><%=s.getHtml()%></td>
	</tr>
<% 	} //for
}else { %>
	<tr><td colspan="6">** 출력할 자료가 없습니다 **</td></tr>	  
<%  
} //else
%>	
</table>

</body>
</html>