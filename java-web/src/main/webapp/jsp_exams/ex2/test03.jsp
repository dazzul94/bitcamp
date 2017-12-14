<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<% int a = 10;%>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<% int b = 20; %>
<body>
	<h1>스크립트릿(scriptlet element) 테스트</h1>
<%
out.println(a + b);
%>
<p>스크립트릿이 선언된 그 위치 , 그 순서 그대로 자바 소스 파일에 복사된다
</body>
</html>
<%
class MyInner {}
%>

<%-- 템플릿은 출력, 스크립트릿은 복사 --%>