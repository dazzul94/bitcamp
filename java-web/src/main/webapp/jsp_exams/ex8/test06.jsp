<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>EL(Expression Language) 사용법</h1>
OGNL 표기법을 이용하여 자바 객체의 프로퍼티 값을 꺼내는 문법이다.<br>
OGNL(Object Graph Navigation Language)이란?<br>
점(.)이나 대괄호([]) 등을 이용하여 객체의 변수 값을 쉽게 꺼내게 해주는 문법이다 .

<% 
application.setAttribute("name2", "서브릿컨텍스트");
session.setAttribute("name2", "세션");
request.setAttribute("name2", "리퀘스트");
pageContext.setAttribute("name2", "JSP 페이지");
%>


<h2>가장 가까운 보관소에서부터 찾는다</h2>
${name2}<br>

</body>
</html>






