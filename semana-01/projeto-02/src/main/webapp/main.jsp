<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- ?first_name=Mogleson&last_name=Lima -->
	<h1>Formulario</h1>
	<b>First Name: </b>
	<%
	out.println("" + request.getParameter("first_name"));
	%>
	</br>
	<b>Last Name: </b>
	<%
	out.println("" + request.getParameter("last_name"));
	%>
	
	<h1>Listando param passados pela URL</h1>
	<%
    Enumeration paramNames = request.getParameterNames();
    while (paramNames.hasMoreElements()) {
        String paramName = (String) paramNames.nextElement();
        out.print("<p>" + paramName + ": ");
        String paramValue = request.getParameter(paramName);
        out.println(paramValue);
    }
    %>
</body>
</html>