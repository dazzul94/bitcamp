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
</head>
<body>
	<div class='container'>
		<jsp:include page="/header.jsp" />
		<h1>회원 상세정보</h1>
		<c:if test="${not empty member }">
			<form action='update' method='POST'>
				<div class='form-group row'>
					<label for='no' class='col-sm-2 col-form-label'>번호</label>
					<div class='col-sm-10'>
						<input class='form-control' readonly id='no' type='number'
							name='no' value='${member.no}'>
					</div>
				</div>
				<div class='form-group row'>
					<label for='name' class='col-sm-2 col-form-label'>이름</label>
					<div class='col-sm-10'>
						<input class='form-control' id='name' type='text' name='name'
							value='${member.name}'>
					</div>
				</div>
				<div class='form-group row'>
					<label for='email' class='col-sm-2 col-form-label'>이메일</label>
					<div class='col-sm-10'>
						<input class='form-control' id='email' type='text' name='email'
							value='${member.email}'>
					</div>
				</div>
				<div class='form-group row'>
					<label for='regdt' class='col-sm-2 col-form-label'>등록일</label>
					<div class='col-sm-10'>
						<input class='form-control' readonly id='regdt' type='text'
							name='regdt' value='${member.createDate}'>
					</div>
				</div>
				<button class='btn btn-warning btn-sm'>변경</button>
				<a href='delete?no=${member.no}' class='btn btn-danger btn-sm'>삭제</a>
			</form>
		</c:if>
		<c:if test="${empty member }">
			<p>'${param.no}'의 회원 정보가 없습니다.</p>
		</c:if>
		<jsp:include page="/footer.jsp" />
	</div>

	<%@ include file="../jslib.txt"%>
</body>
</html>