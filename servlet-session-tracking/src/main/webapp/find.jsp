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
    public String evenorodd(int n){
    	if(n%2==0){
    		return "EVEN NUMBER";
    	}
    	else{
    		return "ODD NUMBER";
    	}
    }
    %>
    <%
    int n=Integer.parseInt(request.getParameter("n"));
    %>
    <%=
    evenorodd(n)
    %>

</body>
</html>