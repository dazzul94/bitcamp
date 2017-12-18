<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%
    BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>
<!DOCTYPE html>
<html>
<head>
<title>게시물관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<meta http-equiv='Refresh' content='1; url=list'>
</head>
<body>
	<div class='container'>

		<jsp:include page="/header.jsp"/>
		<h1>게시물 변경</h1>
		<jsp:useBean id="count" type="java.lang.Integer" scope="request"></jsp:useBean>
		<%
		    try {
		        if (count > 0) {
		%>
		<p>변경했습니다</p>
		<%
		    } else {
		%>
		<p>'${board.no}의 게시물 정보가 없습니다.
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