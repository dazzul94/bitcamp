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
<h2>c:remove 태그</h2>
<p>보관소에 값을 제거하는 태그이다.<br>

<c:set var="name" value="홍길동" scope="page"/>
<c:set var="name" value="임꺽정" scope="request"/>
<c:set var="name" value="유관순" scope="session"/>
<c:set var="name" value="김구" scope="application"/>

${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
<hr>
<c:remove var="name" scope="session"/>
${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
<hr>
<c:remove var="name" scope="request"/>
${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
<hr>
<c:remove var="name" scope="application"/>
${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
<hr>
<c:remove var="name" scope="page"/>
${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
<hr>
</body>
</html>






