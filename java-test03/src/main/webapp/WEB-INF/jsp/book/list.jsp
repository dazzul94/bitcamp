<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>    
<!DOCTYPE html>
<html>
<head>
<title>도서 관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>도서 목록</h1>

<jsp:include page="../listToolbar.jsp"/>

<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>도서명</th><th>가격</th><th>출판사</th><th>사진</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="book">
    <c:set var="title" value="${fn:length(book.title) == 0 ? 
    '(제목이 없습니다.)' : book.title}"/>
    <c:set var="photoname" value="${book.photo.filename}"/>
        <tr>
        <td>${book.no}</td>
        <td><a href='${book.no}'><span class="d-inline-block text-truncate" 
            style="max-width: 300px;">${title}</span></a></td>
        <td>${book.price}</td>
        <td>${book.press}</td>
        
        <td><img src="${contextPath}/download/${photoname}" width="35" height="40" border="0"></td>
        </tr>
</c:forEach>

</tbody>
</table>

<jsp:include page="../paging.jsp"/>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    