<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dia da semana !</title>
</head>
<body>
	<%!
		String semana;
		public void jspInit(){
			Date data = new Date();
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(data);
			semana = new SimpleDateFormat("EEEE").format(data);
		}
	%>
	<% out.println(semana); %>
</body>
</html>