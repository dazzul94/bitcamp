<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
	<h1>지시부</h1>
서블릿 클래스에 특별한 작업을 지시할 때 사용한다.

	<h2>JSP 지시부 - taglib</h2>
    JSP에서 제공하는 태그 외에 외부에서 확장 태그를 가져올 때 사용한다.<br>
    확장 태그의 예로 JSTL(JSP Standard Tag Library) 태그 라이브러리가 있다.<br>
    또한 개발자가 추가로 정의한 태그를 가져올 때도 사용한다.<br>
	<pre class="jsp">
&lt;%@ taglib url="URL" prefix="네임스페이스명"
 %&gt;
</pre>
<p>
라이브러리를 가져와야한다.
</body>
</html>