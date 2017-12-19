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
<h3>COre 라이브러리</h3>
<h2>c:set 태그</h2>
<p>보관소에 값을 저장하는 태그이다.<br>

<%-- scope을 지정하지 않으면 기본이 PageContext이다 --%>
<c:set var="name" value="홍길동"/>
<c:set var="name2">임꺽정</c:set>
<c:set var="name3" value="유관순" scope="request"/>
<c:set var="name4" value="안중근" scope="session"/>
<c:set var="name5" value="윤봉길" scope="application"/>

${pageScope.name }<br>
${pageScope.name2 }<br>
${requestScope.name3 }<br>
${sessionScope.name4}<br>
${applicationScope.name5 }<br>
</body>
</html>






