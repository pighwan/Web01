<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Format(fmt) Test **</title>
</head>
<body>
<h3><pre>
** Format(fmt) Test **
=> 현재 날짜 시간 가져오기
   Java : Date now = new Date();
   <c:set var="now" value="<%=new Date()%>" />
1. DateTime Test
* now   : ${now}
* date  : <fmt:formatDate value="${now}" type="date"/> 
* time  : <fmt:formatDate value="${now}" type="time"/>
----------------------------------------------------
* both  : <fmt:formatDate value="${now}" type="both"
					dateStyle="default" timeStyle="default"/>
* short : <fmt:formatDate value="${now}" type="both"
					dateStyle="short" timeStyle="short"	/>
* medium: <fmt:formatDate value="${now}" type="both"
					dateStyle="medium" timeStyle="medium" />
* long  : <fmt:formatDate value="${now}" type="both"
					dateStyle="long" timeStyle="long" />
* full  : <fmt:formatDate value="${now}" type="both"
					dateStyle="full" timeStyle="full" />
----------------------------------------------------
* Pattern (yyyy년 MM월 dd일 hh시 mm분 ss초) 적용
=> <fmt:formatDate value="${now}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>

* 각 나라별 시간을 적용하려면 
=> fmt:setTimeZone, fmt:timeZone 태그 활용
-----------------------------------------------------	
2. Number Format
=> 숫자 정의
<c:set var="myMoney" value="1234567890" />
=> fmt 적용
   myMoney1 : <fmt:formatNumber value="${myMoney}" pattern="000,000,000,000"/> 원
   myMoney2 : <fmt:formatNumber value="${myMoney}" pattern="###,###,###,###"/> $
</pre></h3>

</body>
</html>