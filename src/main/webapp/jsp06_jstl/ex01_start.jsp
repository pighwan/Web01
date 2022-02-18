<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSTL Start **</title>
<%-- <% pageContext.setAttribute("name", "pageContext_Value"); %>  --%>
</head>
<body>
<pre><h3>
** JSTL Start **
=> Jstl Library 를 정의 
   디렉티브 taglib 에 uri=".." prefix=".."

1. 출력 : out Tag
=> Java 의 out 객체 역할, EL을 대신할 수 있음
<c:out value="~~ Hello JSTL !!! ~~~" />

2. 변수 정의
=> set, remove
=> 정의
<c:set var="name" value="홍길동" />
<c:set var="age" value="123" />
=> Java 의 스크립트 Tag 와 비교 
<% String name = "김자바"; %>
<%=name%>

3. 변수 출력
=> Jstl 의 out Tag
* name : <c:out value="${name}" />
* age : <c:out value="${age}" /> 
=> 출력 우선순위 : value, default, 컨텐츠
* 1순위 Test
<c:out value="Value_1순위" default="Default_2순위" />
* 2순위 Test : outTag _default
<c:out value="${name2}" default="Default_2순위" />
* 2순위 Test : setTag_컨텐츠
<c:set var="test">컨텐츠_2순위</c:set>
<c:out value="${test}" /> 

=> EL
* \${name} = ${name}
* \${age} = ${age}
* \${age+100} = ${age+100}
* \${test} = ${test}

4. 연산 적용
<c:set var="add" value="${age*5}" />
\${add} = ${add}
<c:set var="bool" value="${name==age}" />
\${bool} = ${bool}

5. 변수 삭제
=> age remove
<c:remove var="age"/>
\${empty name} = ${empty name}
\${empty age} = ${empty age}
\${age} = ${age}

=> error Test : 정의되지 않은 변수 Test 
<c:remove var="age123"/>

6. 우선순위
=> jstl 변수 와 Attribute 
=> 동일하게 Page에 정의된 경우에는 나중에 정의된 값이 우선 적용됨
   page(set변수, attribute 중 나중에 정의된 값 우선) -> request -> session -> application
<%-- <% pageContext.setAttribute("name", "pageContext_Value"); %>  
	--%>
<% request.setAttribute("name", "request_Value"); %>	
\${name} = ${name}
</h3></pre>

</body>
</html>