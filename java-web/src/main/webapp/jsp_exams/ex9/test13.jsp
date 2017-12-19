<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSTL(JSP Standard Tag Library)</h1>
<h3>Core 라이브러리</h3>
<h2>c:redirect 태그2</h2>
<p>특정 페이지로 다시 요청하라고 클라이언트에게 응답하는 태그이다.</p>

<c:if test="${empty param.name }">
<jsp:forward page="error.jsp"/>
</c:if>

${param.name } 님 환영합니다.
</body>
</html>






