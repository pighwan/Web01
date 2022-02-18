<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JavaCode : Scriptlet, Expression, Declaration **</title>
</head>
<body>
	<h3>** JavaCode **</h3>
	<pre>
	1) Scriptlet  : 자바코드
	2) Expression : 표현식 (출력문)
	3) Declaration: 선언부 (메서드 등)
	</pre>
	<hr>
	<%! // Declaration: 선언부  
		public int multiply(int a, int b) {
			return a*b;
		}
	%>
	=> multiply(a, b) Test <br>
	multiply(12, 34) = <%=multiply(12, 34)%><br>
	
	<% // Scriptlet: 자바코드 
		int result = multiply(12, 34) + 1000;
	%>
	=> Scriptlet Test<br>
	result = <%=result%>	

</body>
</html>