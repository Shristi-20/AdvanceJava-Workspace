<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Scripting Element: Scriptlet: -->
<% int x; //Local variable in service method 
x=0;%>

<!-- Scripting Element: Expression: -->
<%=x%>
<br> Current Date: 
<%= new java.util.Date() %>
<!-- Scripting Element: Declaration: -->
<%! int count=0; // instance variable%>
<h2>You are Number <%=++count%> visitor, x=<%=++x%></h2>
<%!  void fn(){
System.out.println("Console Prints")
}%>

<%fn(); %>

</body>
</html>