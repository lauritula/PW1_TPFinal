<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Inicio</title>
</head>
<body>
	<form:form action="agregarSubmit" method="POST">
	<h2> Agregar Stock: </h2>
		</br>		
		<label name="nombre">Ingrediente: </label>
		<select name="nombre" id="nombre">
		    <option>- Seleccione Producto -</option>
		    <c:forEach items="${productList}" var="productL">
				<option value="${productL.nombre}">${productL.nombre}</option>
			</c:forEach>
		</select>
		</br></br>		
		<label name="cantidad">Cantidad: </label>
		<input type="text" name="cantidad" id="cantidad" size="5">
		</br></br>

		<input type="submit" value="Actualizar Stock"/>
	</form:form>
	</br></br>
	<a href="irIndex"> Volver al Menu Principal </a>
</body>
</html>