<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Chamada de formulario Usando GET</h1>
	<form action="main.jsp" method="GET">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> <input
			type="submit" value="Submit" />
	</form>

	<!-- POST -->
	<h1>Chamada de formulario Usando POST</h1>
	<form action="main.jsp" method="POST">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> 
		<input	type="submit" value="Submit" /> 
		
		<input type="checkbox" name="maths" checked="checked" /> Maths 
		<input type="checkbox" name="physics" checked="checked"/> Physics 
		<input type="checkbox" name="chemistry" checked="checked" /> Chemistry
	</form>
</body>
</html>

