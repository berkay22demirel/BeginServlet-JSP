<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Lifecycle</title>
</head>
<body>

	<%!
  
  		public void jspInit() {
    		ServletConfig config = getServletConfig();

    		String name = config.getInitParameter("name");
    		String site = config.getInitParameter("web site");
    		System.out.println("Name : " + name);
    		System.out.println("Site : " + site);
    
  		}

  		public void jspDestroy() {
    		System.out.println("Destroy");
  		}
  		
   %>

</body>
</html>