<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
<jsp:useBean id="msg" class="bean.Msg"/>
<jsp:setProperty property="dest" name="msg" value="Luciano Ramos"/>
<jsp:getProperty property="dest" name="msg"/><br>
<jsp:setProperty property="ass" name="msg" value="Vai te tratar !"/>
<jsp:getProperty property="ass" name="msg"/><br>
<jsp:setProperty property="msg" name="msg" value="Cavalo de troia do boomerang do papagaio atômico !"/>
<jsp:getProperty property="msg" name="msg"/><br>
</body>
</html>