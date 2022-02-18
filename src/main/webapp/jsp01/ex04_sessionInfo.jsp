<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat, java.util.Date" %> 
<%-- 일반적으로 위 의 방법을 많이 사용함 
<%@ page import="java.text.SimpleDateFormat" %>   
<%@ page import="java.util.Date" %>  
--%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Session Info **</title>
</head>
<body>
<%  // java.util.Date now = new java.util.Date();
	// => java 와 동일하게 import 가능함
	Date now = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<pre><h3>
** Session Info **
=> Jsp 장점 : session 객체 생성 필요없음, View 작성 간편함.

** Session ID => <%=session.getId()%> 
** 현재시간 => <%=formatter.format(now)%> 
<% now.setTime(session.getCreationTime()); %>
** CreationTime => <%=formatter.format(now)%> 
<% now.setTime(session.getLastAccessedTime()); %>
** LastAccessedTime => <%=formatter.format(now)%>
</h3></pre>

</body>
</html>