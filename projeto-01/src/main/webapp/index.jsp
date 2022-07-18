<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Import de class -->
<%@ page import="mandacaru.dev.Person" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Insert title here</title>

<!-- Import CSS -->
<link rel="stylesheet" href="./css/styles.css"/>

<!-- Import Script -->
<script src="js/scripts.js"></script>

</head>
<body>
	<!-- 
	<h1>Hello JSP!!!</h1>
	<img alt="carr" src="img/jeep-compass-longitude.jpg" height="400">
	 -->
	
	<!-- Scriptlet java aqui escrevemos java dentro do HTML-->

		<%
		
	Person p = new Person("Mogly", "24");
	int a = 2;
	int b = 3;
	
	%> 
	<h1>Test...Aglutinação!</h1>
	<%
	
	if(a != b){
		out.println("Pessoa --> "+p);
		//out.println("O valor de A é maior que B");
	}else{
		out.println("O valor de B é maior que A");
	}
	%>
	<br>
	<%
	int fontSize;
	for(fontSize = 1; fontSize <= 3; fontSize++){
		%>
		<font color="blue" size="<%=fontSize%>">JSP Tutorial</font> <br>
		<%} %>

</body>
</html>