<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<title>Producto Eliminado</title>
</head>
<body>
	<div class="container" style="background-color: lavender">
		<div class="jumbotron" style="background-color: lavender">
			<h1 style="text-align: center">
				<small> Producto eliminado de Stock</small>
			</h1>
			<h1 style="text-align: center">
				<small><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></small>
			</h1>
		</div>
		<div class="col-md-12" style="height: 350px">
			<div class="col-md-2"></div>
				<div class="col-md-8">
					<p>
						<a href="verStock" class="btn btn-primary btn-lg btn-block">
							 <span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> Ver Stock
						</a> 
						<a href="agregarStock" class="btn btn-primary btn-lg btn-block">
							<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Agregar Stock
						</a>
						<a href="eliminarStock" class="btn btn-primary btn-lg btn-block">
							<span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span> Eliminar Stock
						</a>
						<a href="altaProducto" class="btn btn-primary btn-lg btn-block">
							<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Dar deAlta un Producto
						</a> 
						<a href="irIndex" class="btn btn-primary btn-lg btn-block">
							<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver a inicio
						</a>
						<a href="verCarrito" class="btn btn-primary btn-lg btn-block">
							<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Ver Carrito
						</a>
					</p>
				</div>
					<div class="col-md-2"></div>
			</div>
			<div class="col-md-12" style="height: 300px">
				<div class="text-info" align="center">Universidad Nacional de La Matanza</div>
				<div class="text-info" align="center">Tecnicatura en Desarrollo Web</div>
				<div class="text-info" align="center">Taller Web I - Trabajo Práctico Final</div>
				<div class="text-info" align="center">RABUÑAL, JULIANA LAURA - TULA ACOSTA, MARIA LAURA</div>
			</div>
	</div>
</body>
</html>