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
<h1>jsp:useBean 테스트</h1>

<jsp:useBean id="list1" class="java.util.ArrayList"/>
<%-- 
//먼저 PageContext 보관소에서 객체를 찾는다.
java.util.ArrayList list = pageContext.getAttribute("list");

//없으면 생성한다.
if (list == null)
list = new java.util.ArryList();
//생성한 객체는 PageContext 보관소에 저장한다.
pageContext.setAttribute("list", list);
}
 --%>

<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"/>
<%-- 
//먼저 PageContext 보관소에서 객체를 찾는다.
java.util.ArrayList list = request.getAttribute("list");

//없으면 생성한다.
if (list == null)
list = new java.util.ArryList();
//생성한 객체는 PageContext 보관소에 저장한다.
request.setAttribute("list", list);
}
 --%>
 
 <h2>pageContext 보관소</h2>
list1 : <%=pageContext.getAttrubute("list1")%><br>
list2 : <%=pageContext.getAttrubute("list2")%><br>

 <h2>ServletRequest 보관소</h2>
list1 : <%=request.getAttribute("list1")%><br>
list2 : <%=request.getAttribute("list2")%><br>

</body>
</html>