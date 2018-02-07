<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html">
<style>
td {

width: 200px;}
</style>
<meta charset="utf-8">
<title>Insert title here</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<div align="center">
<h2>Espectaculos</h2>
</div>

<div align="center">

<a href="Servlet">Muestrame las obras</a> <br>
</div>

<div class="container-fluid" align="center">


<table>
<tbody>


<tr class="table-primary"><th>ID</th><th>Descripcion</th><th>Precio</th><th>Fecha</th><th>Web</th></tr>

<c:forEach items="${listadobras}" var="obra">

<tr><td><c:out value="${obra.id}"></c:out></td>
<td><c:out value="${obra.descripcion}"></c:out></td>

<td><c:choose>
         
         <c:when test= "${obra.precio < 15}">
            El precio minimo es de 5€.
         </c:when>
         
         <c:otherwise> <c:out value="${obra.precio}"></c:out>
           
         </c:otherwise >
      </c:choose>

</td>





<td><c:out value="${obra.fecha}"></c:out></td>
<td><a href="<c:url value="${obra.web}"></c:url>">Web</a></td>




</tr>

</c:forEach>


</tbody>
</table>

</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</body>
</html>