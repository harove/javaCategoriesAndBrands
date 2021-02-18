<%-- 
    Document   : marcaForm
    Created on : 18-02-2021, 1:59:34
    Author     : edgar.haro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Form</h1>
        <form action="UpdateMarcaControlador">
            <label>Codigo de Marca</label>
            <input type="text" name="codigoMarca" value="${marca.getCodigoMarca()}"/>
            <label>Nombre de Marca</label>
            <input type="text" name="nombreMarca" value="${marca.getNombreMarca()}"/>
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
