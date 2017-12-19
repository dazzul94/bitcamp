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
<h2>c:if 태그</h2>
<p>조건에 따라 실행의 여부를 결정하는 태그이다.<br>


<c:set var="name" value="홍길동" scope="page"/>

<c:if test="${name == '홍길동'}" var="result">
    오호라, 당신이 홍길동<br>
</c:if>
result : ${result }<br>
</body>
</html>






