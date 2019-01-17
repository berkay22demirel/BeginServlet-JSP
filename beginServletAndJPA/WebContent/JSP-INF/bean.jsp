<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List,java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="person1" class="jspBeanExample.PersonModel">
		<jsp:setProperty name="person1" property="name" param="name" />
		<jsp:setProperty name="person1" property="surname" param="surname" />
		<jsp:setProperty name="person1" property="age" param="age" />
		<%-- or for set all property --%>
		<%-- <jsp:setProperty name="person1" property="*" param="age" /> --%>
	</jsp:useBean>
	
	<jsp:getProperty name="person1" property="name" />
	<jsp:getProperty name="person1" property="surname" />
	<jsp:getProperty name="person1" property="age" />
	
	<% List<String> languages = (List<String>) request.getAttribute("languages");
		if(languages != null){
			
			for(String language : languages){
				
				out.print(language);
			}
		}
	%>

</body>
</html>