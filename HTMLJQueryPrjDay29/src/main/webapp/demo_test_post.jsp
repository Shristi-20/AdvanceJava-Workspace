<%
String fname,city;
fname=request.getParameter("name");
city=request.getParameter("city");
out.println("Dear " + fname + ". ");
out.println("Hope you live well in " + city + "."); %>
