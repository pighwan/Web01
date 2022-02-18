<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %> <!-- true : EL 무시됨  --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Request Parameter 활용 **</title>
</head>
<body>
<pre><h3>
** Request Parameter 활용 **
=> 동질성 비교, null 확인, 연산(ex02~~~.jsp)
1. 동질성 비교
=> parameter value 출력
* I     D : ${param.id}
* Password: ${param.pw} <br>
\${param.id=='banana'} => ${param.id=='banana'}
\${param.pw=='12345!'} => ${param.pw=='12345!'}

2. null 확인 : empty, ==
=> empty : 해당되는 parameter가 존재하지않을때 또는 존재하지만 값이 없을때 모두 true 
\${empty param.id} => ${empty param.id}
\${empty param.pw} => ${empty param.pw}

=> == : 해당되는 parameter가 존재하지않을때는 true ,  존재하지만 값이 없을때는 false  
\${param.id==null} => ${param.id==null}
\${param.pw==null} => ${param.pw==null}

3. pageContext
=> JSP 페이지에 대한 정보를 저장한다.
=> 기본 객체를 return 하는 메서드를 제공.
* 요 청 URL : ${pageContext.request.requestURL}
* 요 청 URI : ${pageContext.request.requestURI}

</h3></pre>


</body>
</html>