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
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>	
	<script type="text/javascript" src="/js/jquery-1.4.3.min.js"></script> 
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
									<li>	
										<a href="irIndex">
											<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver a inicio
										</a>
									</li>
									<li>
										<a href="altaProducto">
											<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Dar de Alta un Producto
										</a>
									</li>
									<li>
										<a href="agregarStock">
											<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Agregar Stock
										</a>
									</li>
									<li>
										<a href="eliminarStock">
											<span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span> Eliminar Stock
										</a>
									</li>
								</ul>
							</div>
					</div>
				</nav>
			</div>
				<div class="col-md-2"></div>
				<h1 style="text-align: center">
					<small>CARRITO</small>
				</h1>
				<h1 style="text-align: center">
					<small><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></small>
				</h1>
		</div>
		<div class="col-md-12" style="height: 100px">
			<form:form id="myForm" modelAttribute="producto" method="POST" class="form-horizontal" action="agregarProductoAlCarrito" data-toggle="validator" role="form"> 
				 <div class="form-group"> 
	 				<label name="nombre" for="nombre" class="col-sm-4 control-label">Producto</label>  
				 			<div class="col-sm-4">  
				 				<select class="form-control" name="nombre" id="nombre">  
				 					<option>- Seleccione Producto -</option>  
				 						<c:forEach items="${productList}" var="productL"> 
				 							<option value="${productL.nombre}">${productL.nombre}</option>  
			  							</c:forEach>  
				  				</select>  
							</div>  
					</div>  
				<div class="form-group " align="center">  
			 		<div class="col-sm-offset-1 col-sm-10">  
						<button type="submit" class="btn btn-info" value="Agregar Producto">Agregar Producto</button>  
					</div>  
				</div> 			
			</form:form>  
		 </div> 
		<div class="col-md-12" style="height:150px">
			<form:form id="myForm" action="agregarDescuentoAlCarrito" method="POST" class="form-horizontal" data-toggle="validator" role="form">
				<div class="form-group">
					<label name="nombre" for="nombre" class="col-sm-4 control-label">Tipo Descuento</label>
						<div class="col-sm-4">
							<select class="form-control" name="tipo" id="tipo">
								<option>- Seleccione tipo -</option>
								<option value="Monto">Monto</option>
								<option value="Porcentaje">Porcentaje</option>
							</select> 
							   <div class="col-md-12">
							   	<label name="valor" for="valor" class="col-sm-4 control-label">Valor</label>
									<input type="text" name="valor" id="valor" class="col-sm-4" required/>
								</div>
						</div>
				</div>
						<div class="form-group " align="center">
							<div class="col-sm-offset-1 col-sm-10">
								<button type="submit" class="btn btn-info" value="Agregar Descuento">Agregar Descuento</button>
							</div>
						</div>
			</form:form>
		</div>
		<div class="col-md-12" style="height:400px">
			<div class="table table-condensed">
				<table class="table">
					<tr>
						<td align=center class="success" width="20%"><strong> Producto </strong></td>
						<td align=center class="success" width="20%"><strong> Precio </strong></td>
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
					<a href="compraSubmit" class="link"><input type="button" class="btn btn-success" value="Confirmar Compra" id="boton1"></a></div>
						<div class="col-sm-2"><a href="vaciarCarrito" class="link"><input type="button" class="btn btn-danger" value="Cancelar" id="boton2"></a>
				</div>
			</div>
			
			<div class="col-md-12" style="height: 300px">
				<div class="text-info" align="center">Universidad Nacional de La Matanza</div>
				<div class="text-info" align="center">Tecnicatura en Desarrollo Web</div>
				<div class="text-info" align="center">Taller Web I - Trabajo Práctico Final</div>
				<div class="text-info" align="center">RABUÑAL, JULIANA LAURA - TULA ACOSTA, MARIA LAURA</div>
			</div>
		</div>	
	</div>

</body>
</html>
	
