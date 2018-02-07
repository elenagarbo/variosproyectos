<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<div align="center">
<h2>JSTL Core</h2>
</div>

<div align="center">
<a href="Prueba" >Peticion GET</a> <br>
</div>

<div align="center">

<table>
<tbody>

<tr><th>Codigo</th><th>Nombre</th><th>Precio</th><th>Unidades</th></tr>

<c:forEach items="${carritocompra}" var="articulo">

<tr><td><c:out value="${articulo.codigo}"></c:out></td>
<td><c:out value="${articulo.nombre}"></c:out></td>
<td><c:out value="${articulo.precio}"></c:out></td>
<td><c:out value="${articulo.unidades}"></c:out></tr>

</c:forEach>

<a href="<c:url value="http://www.bne.es"></c:url>">Biblioteca Nacional</a>






</tbody>
</table>

</div>

</body>
</html>