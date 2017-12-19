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
<h2>c:choose 태그</h2>
<p>조건에 따라 여러개로 분기할때 사용하는 태그이다.<br>

<c:set var="level" value="2"/>

<c:choose>
<c:when test="${level == 0 }">손님입니다.</c:when>
<c:when test="${level == 1 }">회원입니다.</c:when>
<c:when test="${level == 2 }">관리자입니다.</c:when>
<c:otherwise>권한이 없습니다</c:otherwise> 
</c:choose>
</body>
</html>





