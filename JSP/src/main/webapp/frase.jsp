<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cacetinho</title>
</head>
<body>
	<%!
		String frase;
		public void jspInit(){
			frase = "Inicializa��o !!!";
		}
	%>
	<% out.println(frase); %>
</body>
</html>