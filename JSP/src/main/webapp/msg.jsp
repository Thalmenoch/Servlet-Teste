<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Mensagem</title>
</head>
<body>
<jsp:useBean id="msg" class="bean.Mensagem"/>
<jsp:setProperty property="texto" name="msg" value="Mensagem pra o usuário !"/>
<jsp:getProperty property="texto" name="msg"/>
</body>
</html>