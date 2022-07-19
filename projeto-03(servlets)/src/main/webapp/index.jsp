<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Servlets</h1>
<!-- 
	<h3>
		Formulario usando GET<br> Aqui os parametros são exibidos na URL
	</h3>
	<form action="main.jsp" method="GET">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> <input
			type="submit" value="Submit" />
	</form>

	<hr>

	<h3>
		Formulario usando o POST <br> Aqui os parametros não são exibidos
		na URL
	</h3>

	<form action="main.jsp" method="POST">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> <input
			type="submit" value="Submit" />
	</form>

	HR  Apenas uma linha para separar os formularios  
	<hr>

	<h3>Aqui estamos evoluindo a aplicação Agora temos a chamada do
		Hello - indicando o metodo http (GET)</h3>

	<form action="Hello" method="GET">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> 
		 Aqui trabalhamos com list de parametros 
		<input	type="checkbox" name="subject" value="maths" checked="checked" />
		Maths <input type="checkbox" name="subject" value="physics" />
		Physics <input type="checkbox" name="subject" value="chemistry"
			checked="checked" /> Chemistry
			<br /> <input
			type="submit" value="Submit" />
	</form>

	<h3>Aqui estamos evoluindo a aplicação Agora temos a chamada do
		Hello - indicando o metodo http (POST)</h3>

	<form action="Hello" method="POST">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> <input
			type="submit" value="Submit" />
	</form>
	 -->
	
	<h3>Organizando... Evoluindo!!!</h3>

	<form action="HelloNotations" method="GET">
		First Name: <input type="text" name="first_name"> <br /> Last
		Name: <input type="text" name="last_name" /> <br /> 
		<!-- Aqui trabalhamos com list de parametros -->
		<input	type="checkbox" name="subject" value="maths" checked="checked" />
		Maths <input type="checkbox" name="subject" value="physics" />
		Physics <input type="checkbox" name="subject" value="chemistry"
			checked="checked" /> Chemistry
			<br /> <input
			type="submit" value="Submit" />
	</form>



</body>
</html>