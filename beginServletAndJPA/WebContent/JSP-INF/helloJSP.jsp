<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.List,java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP</title>
</head>
<body>

	<h1>Hello JSP</h1>
	
	<% List<String> languages = new ArrayList<String>();
		languages.add("JAVA");
		languages.add("C#");
		languages.add("C");
	
		for(String language : languages){
			
			out.println(language);
		}
		
		String name = "Berkay Demirel";
			
	%>
	
	<%=name %>
	
	<%!
		public int getAge() {
		
			return 24;
	}
	%>
	
	<%=getAge() %>
	
	<%-- Yorum Satırı --%>

</body>
</html>