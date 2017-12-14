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
		<h1>게시물 상세정보</h1>
		<%
		    try {
		        int no = Integer.parseInt(request.getParameter("no"));

		        Board board = boardDao.selectOne(no);
		        PrintWriter out2 = new PrintWriter(out);
		        if (board != null) {
		            out.println("<form action='update.jsp' method='POST'>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='no' class='col-sm-2 col-form-label'>번호</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n",
		                    board.getNo());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='title' class='col-sm-2 col-form-label'>제목</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' id='title' type='text' name='title' value='%s'>\n",
		                    board.getTitle());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='conts' class='col-sm-2 col-form-label'>내용</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' id='conts' type='text' name='conts' value='%s'>\n",
		                    board.getContent());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='regdt' class='col-sm-2 col-form-label'>날짜</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf(
		                    "<input class='form-control' readonly id='regdt' type='text' name='regdt' value='%s'>\n",
		                    board.getRegDate());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='vwcnt' class='col-sm-2 col-form-label'>조회수</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf(
		                    "<input class='form-control' readonly id='vwcnt' type='number' name='vwcnt' value='%d'>\n",
		                    board.getViewCount());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<button class='btn btn-warning btn-sm'>변경</button>");
		            out2.printf("<a href='delete.jsp?no=%d' class='btn btn-danger btn-sm'>삭제</a>", board.getNo());
		            out.println("</form>");
		        } else {
		            out2.printf("<p>%s의 게시물 정보가 없습니다.</p>", no);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		        out.println(e.getMessage());
		    }
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