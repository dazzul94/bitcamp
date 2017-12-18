<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Member"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
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
		<h1>회원 목록</h1>
		<p>
			<a href='form.jsp' class='btn btn-primary btn-sm'>추가</a>
		</p>
		<table class='table table-sm'>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>이메일</th>
					<th>날짜</th>
				</tr>
			</thead>
			<tbody>
			<jsp:useBean id="list" type="java.util.List<Member>" scope="request"></jsp:useBean>
				<%
				    try {
				        for (Member member : list) {
				            pageContext.setAttribute("member", member);
				%>
				<tr>
					<td>${member.no}</td>
					<td><a href='view?no=${member.no}'>${member.name}</a></td>
					<td>${member.email}</td>
					<td>${member.createDate}</td>
				</tr>
				<%
				    }
				    } catch (Exception e) {
				        e.printStackTrace();
				%>
				<%=e.getMessage()%>
				<%
				    }
				%>

			</tbody>
		</table>
		<jsp:include page="/footer.jsp"/>
	</div>


	<%@ include file="../jslib.txt" %>
</body>
</html>
