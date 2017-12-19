<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
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
<h2>c:url 태그</h2>
<p>url을 생성하는 태그이다.</p><br>

<c:url var="url" value="https://search.daum.net/search">
<c:param name="w" value="tot"/>
<c:param name="DA" value="YZR"/>
<c:param name="t__nil_searchbox" value="btn"/>
<c:param name="sug" value=""/>
<c:param name="sugo" value=""/>
<c:param name="q" value="자바"/>
</c:url>

<p>
url : ${url }
</p>


</body>
</html>






