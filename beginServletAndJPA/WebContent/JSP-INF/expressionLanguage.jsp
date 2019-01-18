<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jspExpressionLanguageExample.PersonModel"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Expression Language</title>
</head>
<body>
	<h1>Person Informations</h1>
	<table><tr><td>Name : </td><td>${person1.name}</td></tr>
			<tr><td>Surname : </td><td>${person1.surname}</td></tr>
			<tr><td>Gender : </td><td>${person1.gender}</td></tr>
			<tr><td>Age : </td><td>${person1.age}</td></tr>
			
	<% String[] languages = ((PersonModel) request.getAttribute("person1")).getLanguages();
		for(String language : languages){
		
			out.print("<tr><td>Language : </td><td>" + language + "</td></tr>");
		}
	%>
			
	</table>
</body>
</html>