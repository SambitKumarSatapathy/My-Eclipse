<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
static{
	System.out.println("static");
}
{
	System.out.println("nonstatic");
}
%>
<%
System.out.println("service");
int i=100;
%>
<%= i %>
</body>
</html>