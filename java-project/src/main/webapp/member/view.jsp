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
		<%
		    out.flush();
		    RequestDispatcher rd = request.getRequestDispatcher("/header");
		    rd.include(request, response);
		%>
		<h1>회원 상세정보</h1>
		<%
		    try {

		        int no = Integer.parseInt(request.getParameter("no"));
		        Member member = memberDao.selectOne(no);
		        PrintWriter out2 = new PrintWriter(out);
		        if (member != null) {
		            out.println("<form action='update.jsp' method='POST'>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='no' class='col-sm-2 col-form-label'>번호</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n",
		                    member.getNo());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='name' class='col-sm-2 col-form-label'>이름</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n",
		                    member.getName());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='email' class='col-sm-2 col-form-label'>이메일</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf("<input class='form-control' id='email' type='text' name='email' value='%s'>\n",
		                    member.getEmail());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<div class='form-group row'>");
		            out.println("<label for='regdt' class='col-sm-2 col-form-label'>등록일</label>");
		            out.println("<div class='col-sm-10'>");
		            out2.printf(
		                    "<input class='form-control' readonly id='regdt' type='text' name='regdt' value='%s'>\n",
		                    member.getCreateDate());
		            out.println("</div>");
		            out.println("</div>");
		            out.println("<button class='btn btn-warning btn-sm'>변경</button>");
		            out2.printf("<a href='delete.jsp?no=%d' class='btn btn-danger btn-sm'>삭제</a>", member.getNo());
		            out.println("</form>");
		        } else {
		            out2.printf("<p>'%d'번의 회원 정보가 없습니다.</p>\n", no);
		        }

		    } catch (Exception e) {
		        e.printStackTrace(); // for developer
		        out.println(e.getMessage()); // for user
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