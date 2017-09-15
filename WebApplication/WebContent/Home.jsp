<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
</head>
<body>
<form action="Servlet1" method="get" id="cel">
	<input type="submit" >
</form>
	<select name="popo" form="cel">
	<%@page import=java.util.ArrayList %>
	<%
	int i;
	int n=(int)request.getAttribute("num");
	ArrayList<String> elenco=(ArrayList)request.getAttribute("ele");
	for(i=1;i<n;i++)
	{
		out.println("<option value=");
		out.println(elenco.get(i));
		out.println(">\"");
		out.println(elenco.get(i));
		out.println("</option>");
	}
	%>
	
  </select>
</body>
</html>