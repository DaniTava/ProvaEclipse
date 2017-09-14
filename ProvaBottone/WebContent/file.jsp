<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- I COMMENTI DI SCRIVONO COSI' -->
	<!-- form action permette di "aprire" un file e method indica il metodo da eseguire -->
	The request attribute: ${var}${va}
	<form action="MyServlet" method="Post">
	<input type="submit" name="button" value="Post"/>
    </form> 
    
    <form action="MyServlet" method="get">
	<input type="submit" name="button" value="Get"/>
    </form> 
	 
</body>
</html>