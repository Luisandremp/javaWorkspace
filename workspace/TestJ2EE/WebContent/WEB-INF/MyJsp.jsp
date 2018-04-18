<%@page import="Data.EleveBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>My JSP</h2>
	<%
	EleveBean bob = (EleveBean)request.getAttribute("eleve");
	out.print("Eleve Nom: "+bob.prenom+", note: "+bob.note);
	%>
	
</body>
</html>