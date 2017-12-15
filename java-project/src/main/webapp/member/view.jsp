<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%
    MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
%>
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
		<jsp:include page="/header.jsp"/>
		<h1>회원 상세정보</h1>
		<%
		    try {

		        int no = Integer.parseInt(request.getParameter("no"));
		        Member member = memberDao.selectOne(no);
		        if (member != null) {
		%>
		<form action='update.jsp' method='POST'>
			<div class='form-group row'>
				<label for='no' class='col-sm-2 col-form-label'>번호</label>
				<div class='col-sm-10'>
					<input class='form-control' readonly id='no' type='number'
						name='no' value='<%=member.getNo()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='name' class='col-sm-2 col-form-label'>이름</label>
				<div class='col-sm-10'>
					<input class='form-control' id='name' type='text' name='name'
						value='<%=member.getName()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='email' class='col-sm-2 col-form-label'>이메일</label>
				<div class='col-sm-10'>
					<input class='form-control' id='email' type='text' name='email'
						value='<%=member.getEmail()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='regdt' class='col-sm-2 col-form-label'>등록일</label>
				<div class='col-sm-10'>
					<input class='form-control' readonly id='regdt' type='text'
						name='regdt' value='<%=member.getCreateDate()%>'>
				</div>
			</div>
			<button class='btn btn-warning btn-sm'>변경</button>
			<a href='delete.jsp?no=<%=member.getNo()%>'
				class='btn btn-danger btn-sm'>삭제</a>
		</form>
		<%
		} else { 
		%>
		<p><%=no%>의 회원 정보가 없습니다.
		</p>
		<%
		    }

		    } catch (Exception e) {
		        e.printStackTrace(); // for developer
		%>
		<%=e.getMessage()%>
		<%
		    }
		%>
		  <jsp:include page="/footer.jsp"/>
	</div>

	<%@ include file="../jslib.txt" %>
</body>
</html>