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
<h2>c:set 태그2</h2>
<p>보관소에 값을 저장하는 태그이다.<br>

<jsp:useBean id="member" class="domain.Member" scope="request"/>
이름: ${requestScope.member.name }<br>
나이 :${requestScope.member.age }<br>
재직여부: ${requestScope.member.working }<br>
<hr>
<c:set target="${member }" property="name" value="홍길동"/>
<c:set target="${member }" property="age" value="20"/>
<c:set target="${member }" property="working" value="true"/>

이름: ${requestScope.member.name }<br>
나이 :${requestScope.member.age }<br>
재직여부: ${requestScope.member.working }<br>
<hr>
</body>
</html>






