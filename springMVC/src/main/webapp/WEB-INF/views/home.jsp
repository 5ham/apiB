<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%
	String serverTime = (String)request.getAttribute("serverTime");
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link href="<%=request.getContextPath() %>/css/sample.css" type="text/css" rel="stylesheet">
</head>
<body>
<h2>
	Hello world! home.jsp!!!! 
</h2>

<P>  The time on the server is <%=serverTime %>. </P>

<a href="board/list.do">board/list.do로 이동</a>
<br>

<img src="<%=request.getContextPath()%>/image/4.jpg">

</body>
</html>












