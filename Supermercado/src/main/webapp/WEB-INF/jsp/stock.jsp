<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Inicio</title>
</head>
<body>
	<h2>Listado Stock de Ingredientes </h2>
	
	<table border=1 width=400>
		<tr>
		  <td width=400><strong> Nombre </strong></td>
		  <td width=400><strong> Precio </strong></td>
		  <td width=400><strong> Cantidad </strong></td>
		</tr>
		<c:forEach items="${stockSuper}" var="stock">
		<tr>
			<td> ${stock.key.nombre} </td>
			<td> ${stock.key.precio} </td>
			<td> ${stock.value} </td>
		</tr>
		</c:forEach>
	</table>
	</br></br>
	<a href="irIndex"> Volver al Inicio </a>
</body>
</html>