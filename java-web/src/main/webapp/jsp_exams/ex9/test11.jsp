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
<h2>c:import 태그</h2>
<p>http 요청을 수행하는 태그이다</p><br>

<c:url var="url" value="https://www.zdnet.co.kr/news/news_view.asp">
<c:param name="article_id" value="20171217164316"></c:param>
<c:param name="io" value="z35"></c:param>
</c:url>

<c:import url="${url }" var="result"/>
<textarea rows="15" cols="80">${result }</textarea>


</body>
</html>






