<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dar de Alta un Producto</title>
</head>
<body>
	<h1>Dar de alta un Producto</h1>
	<form:form modelAttribute="producto" action="agregarSubmit" method="POST">
		FORMULARIO A DESARROLLAR
		<input type="submit" value="Actualizar Stock"/>
	</form:form>
	<br></br>
	<div><a href="irIndex"> Volver al Inicio </a></div>
</body>
</html>