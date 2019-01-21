<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.Map , java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSTL</title>
</head>
<body>
	<c:out value="Hello JSTL !" />
	
	<%
		Map map = new HashMap();
		request.setAttribute("mapAttribute", map);
	%>
	
	<c:set var="sessionAttribute" scope="session" value="session value" />
	<c:set var="requestAttribute" scope="request">request value </c:set>
	<c:set target="${mapAttribute}" property="key1" value="map value1" />
	<c:set target="${mapAttribute}" property="key2">map value2</c:set>
	
	<br>
	<c:out value="${sessionAttribute}" />
	<br>
	<c:out value="${requestAttribute}" />
	<br>
	<c:out value="${mapAttribute.key1}" />
	<br>
	<c:out value="${mapAttribute.key2}" />
	<br>
	<c:set var="name" scope="request" value="Berkay"/>
	<c:if test="${name == 'Berkay'}">
   		<p>${name}<p>
	</c:if>
	<br>
	<c:forEach var="x" begin="1" end="10">
       <c:out value="${x}"/> 
    </c:forEach>

</body>
</html>