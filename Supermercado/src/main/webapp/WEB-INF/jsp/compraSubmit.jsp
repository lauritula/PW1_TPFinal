<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<title>Carrito</title>
</head>
<body>
	<div class="container" style="background-color: lavender">
		<div class="jumbotron" style="background-color: lavender">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<nav class="navbar navbar-default navbar-static-top">
				<div class="container-fluid">
					<div>
						<ul class="nav navbar-nav">
							<li><a href="irIndex"><span
									class="glyphicon glyphicon-home" aria-hidden="true"></span>
									Volver a inicio</a></li>
							<li><a href="altaProducto"><span
									class="glyphicon glyphicon-edit" aria-hidden="true"></span> Dar
									de Alta un Producto</a></li>
							<li><a href="agregarStock"><span
									class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									Agregar Stock</a></li>
							<li><a href="eliminarStock"><span
									class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span>
									Eliminar Stock</a></li>
						</ul>
					</div>
				</div>
				</nav>
			</div>
			<div class="col-md-2"></div>
			<h1 style="text-align: center">
				<small>COMPRA REALIZADA! :D</small>
			</h1>
			<h1 style="text-align: center">
				<small><span class="glyphicon glyphicon-shopping-cart"
					aria-hidden="true"></span></small>
			</h1>
		</div>
		<div class="col-md-12" style="height:200px">
			<div class="col-md-12">
				<div class="table table-condensed">
				<table class="table">
					<tr>
						<td align=center class="success" width="20%"><strong>
								Producto </strong></td>
						<td align=center class="success" width="20%"><strong>
								Precio </strong></td>
					</tr>
					<c:forEach items="${carritoTicket}" var="ticket">
						<tr>
							<td align=center class="active">${ticket.nombre}</td>
							<td align=center class="active">${ticket.precio}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="col-md-12" style="height:200px">
			<div class="col-sm-2">
			Subtotal: ${subtotal}
			</div>
			<div class="col-sm-2">
			Ahorro: ${ahorro}
			</div>
			<div class="col-sm-2">
			Total: ${total}
			</div>
			
			 <div class="col-sm-2">
				<a href="irIndex" class="link"><input type="button" value="Volver al Inicio" id="boton1"></a>
			</div>
			</div>
			</div>
		</div>
		<div class="col-md-12" style="height: 150px">
			<div class="text-info" align="center">Universidad Nacional de
				La Matanza</div>
			<div class="text-info" align="center">Tecnicatura en Desarrollo
				Web</div>
			<div class="text-info" align="center">Taller Web 1 - Trabajo
				Práctico Final</div>
			<div class="text-info" align="center">RABUÑAL, JULIANA LAURA -
				TULA ACOSTA, MARIA LAURA</div>
		</div>

	</div>