<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>jsp:setProperty, jsp:getProperty</h1>

<% 
domain.Member m = new domain.Member();
pageContext.setAttribute("m", m);
%>
<jsp:setProperty name="m" property="name" value="홍길동"/>
<h2>Member 객체 내용</h2>
<%=m.toString()%>


(보관소에 저장된거만 가능 set get메소드 호출가능!!!)
property이름은 set/get 메서드 에서 set뺴고 대문자를 소문자로 바꿔서 주는 
set 메서드 가 업승면 setProperty 가 없는거고
 get 메서도ㅡ가 업승면 getProperty 가 없는거다.

</body>
</html>