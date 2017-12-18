
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
<meta http-equiv='Refresh' content='1; url=list'>
</head>
<body>
	<div class='container'>
		<jsp:include page="/header.jsp"/>
		<h1>회원 변경</h1>
		<jsp:useBean id="count" type="java.lang.Integer" scope="request"></jsp:useBean>
		<%
		    try {
		        if (count > 0) {
		%>
		<p>변경했습니다</p>
		<%
		    } else {
		%>
		<p>'${member.no}'의 회원 정보가 없습니다.
		</p>
		<%
		    }
		    } catch (Exception e) {
		        e.printStackTrace();
		%>
		<%=e.getMessage()%>
		<%
		    }
		%>
		<p>
			<a href='list' class='btn btn-info btn-sm'>목록</a>
		</p>

		<jsp:include page="/footer.jsp"/>
	</div>


	<%@ include file="../jslib.txt" %>
</body>
</html>