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
</head>
<body>
	<div class='container'>

		<%
		    out.flush();
		    RequestDispatcher rd = request.getRequestDispatcher("/header");
		    rd.include(request, response);
		%>
		<h1>게시물 변경</h1>
		<%
		    try {
		        Board board = new Board();
		        board.setTitle(request.getParameter("title"));
		        board.setContent(request.getParameter("conts"));
		        board.setNo(Integer.parseInt(request.getParameter("no")));

		        if (boardDao.update(board) > 0) {
		            out.println("<p>변경하였습니다.</p>");
		        } else {
		            PrintWriter out2 = new PrintWriter(out);
		            out2.printf("<p>%s 의 게시물 정보가 없습니다</p>\n", request.getParameter("no"));
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		        out.println(e.getMessage());
		    }
		%>
		<p>
			<a href='list.jsp' class='btn btn-info btn-sm'>목록</a>
		</p>
		<%
		    out.flush();
		    rd = request.getRequestDispatcher("/footer");
		    rd.include(request, response);
		%>
	</div>

	<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
	<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
	<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>