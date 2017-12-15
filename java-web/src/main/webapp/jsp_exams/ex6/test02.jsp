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
	<h2>JSP include</h2>
    RequestDispatcher의 include와 같은 기능을 수행한다.<br>
	
<jsp:include page="test02_p1.jsp"/>
<hr> 
<jsp:include page="test02_p2.jsp"/>
</body>
</html>