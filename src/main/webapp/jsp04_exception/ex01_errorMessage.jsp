<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Error Message Page **</title>
</head>
<body>
<h2><pre>
** Error Message Page **

=> 서비스 처리 과정에서 <%=exception.getClass().getSimpleName()%> 오류가 발생했습니다 ~~
   잠시만 기다려 주세요 ~~
   
=> Exception Type : <%=exception.getClass().getName()%>   
=> toString   : <%=exception.toString()%> 
=> getMessage : <%=exception.getMessage()%>
</pre></h2>
<hr>
<pre>
** 참고사항
만약 에러 페이지의 길이가 513 바이트보다 작다면,
인터넷 익스플로러는 이 페이지가 출력하는 에러 페이지를 출력하지 않고
자체적으로 제공하는 'HTTP 오류 메시지' 화면을 출력합니다.
만약 에러 페이지의 길이가 513 바이트보다 작은데
에러 페이지의 내용이 인터넷 익스플로러에서도 올바르게 출력되길 원한다면,
응답 결과에 이 와 같은 내용 등을 포함시켜서
에러 페이지의 길이가 513 바이트 이상이 되도록 해 주어야 합니다.
참고로 이 문장은 456바이트 입니다.
단, Edge 는 사이즈와 무관하게 출력됨~~
</pre>
</body>
</html>