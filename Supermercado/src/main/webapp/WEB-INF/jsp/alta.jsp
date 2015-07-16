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
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<title>Alta de Producto</title>
</head>
<body>
	<div class="container" style="background-color: lavender">
		<div class="jumbotron" style="background-color: lavender">
			<div class="col-md-1"></div>
				<div class="col-md-10">
					<nav class="navbar navbar-default navbar-static-top">
						<div class="container-fluid">
							<div>
								<ul class="nav navbar-nav">
									<li><a href="irIndex">
											<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver a inicio</a>
											
									</li>
									<li class="active"><a href="altaProducto">
										<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Dar de Alta un Producto</a>
									</li>
									<li><a href="agregarStock">
										<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Agregar Stock</a>
									</li>
									<li><a href="eliminarStock">
										<span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span> Eliminar Stock</a>
									</li>
									<li><a href="verCarrito">
										<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Ver Carrito</a>
									</li>
								</ul>
							</div>
					</div>
				</nav>
			</div>
			<div class="col-md-1"></div>
			<h1 style="text-align: center">
				<small>SUPERMERCADO</small>
			</h1>
			<h4 style="text-align: center">
				<small>Dar de Alta un Producto</small>
			</h4>
			<h1 style="text-align: center">
				<small>
					<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
				</small>
			</h1>
		</div>
		<div class="col-md-12" style="height: 150px">
			<form:form modelAttribute="producto" action="altaSubmit" method="POST" class="form-horizontal" data-toggle="validator" role="form">
				<div class="form-group">
					<label path="nombre" for="nombre" class="col-sm-4 control-label">Nombre</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingrese producto" required />
						</div>
				</div>
				<div class="form-group">
					<label name="precio" for="precio" class="col-sm-4 control-label">Precio</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="precio" id="precio" placeholder="Ingrese precio" required />
						</div>
				</div>
				<div class="form-group " align="center">
					<div class="col-sm-offset-1 col-sm-10">
						<button type="submit" class="btn btn-success" value="Alta">Alta Producto</button>
					</div>
				</div>
			</form:form>
		</div>
		<div class="col-md-12" style="height: 150px">
			<div class="text-info" align="center">Universidad Nacional de
				La Matanza</div>
			<div class="text-info" align="center">Tecnicatura en Desarrollo
				Web</div>
			<div class="text-info" align="center">Taller Web I - Trabajo
				Práctico Final</div>
			<div class="text-info" align="center">RABUÑAL, JULIANA LAURA -
				TULA ACOSTA, MARIA LAURA</div>
		</div>
	</div>
</body>
</html>