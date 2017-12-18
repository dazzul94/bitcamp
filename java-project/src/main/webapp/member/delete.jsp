<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<meta http-equiv='Refresh' content='1; url=list'>
</head>
<body>
	<div class='container'>
		<jsp:include page="/header.jsp" />
		<h1>회원 삭제</h1>
		<c:if test="${count > 0}">
			<p>삭제했습니다</p>
		</c:if>
		<c:if test="${count == 0 }">
			<p>'${param.no}'의 회원 정보가 없습니다.</p>
		</c:if>
		<p>
			<a href='list' class='btn btn-info btn-sm'>목록</a>
		</p>

		<jsp:include page="/footer.jsp" />

	</div>

	<%@ include file="../jslib.txt"%>
</body>
</html>