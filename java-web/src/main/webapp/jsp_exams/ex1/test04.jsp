<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>템플릿 데이터</h1>
<p>JSP 파일에 그냥 작성하는 모든 텍스트는 자바의 출력 코드로 만들어진다.</p>
<!-- 이건 HTML의 주석처리(웹브라우저가 무시하는 주석임), 자바 소스코드에 추가된다-->
<%-- 자바 소스 코드로 바뀌지 않는 주석처리 --%>

<h2>JSP 템플릿 데이터</h2>
<pre class = "jsp">
안녕하세요!
JSP에 오신 걸 환영합니다.
</pre>

<h2>생성된 자바 코드</h2>
<pre class = "java">
out.write("안녕하세요!\n");
out.write("JSP에 오신 걸 환영합니다.\n");
</pre>
</body>
</html>