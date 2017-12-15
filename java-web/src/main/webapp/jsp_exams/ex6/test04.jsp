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
<h1>jsp:setProperty, jsp:getProperty</h1>
객체에 대해 셋터/겟터 메서드를 호출할 때 사용한다.<br>
단 객체는 로컬 변수가 아닌 보관소에 저장되어 있어야 한다.<br>

<h2>JSP 코드</h2>
<pre class="jsp">
<jsp:setProperty name="member" property="name" value="홍길동"/>
property이름은 set/get 메서드 에서 set뺴고 대문자를 소문자로 바꿔서 주는 
set 메서드 가 업승면 setProperty 가 없는거고
 get 메서도ㅡ가 업승면 getProperty 가 없는거다.
</pre>

</body>
</html>