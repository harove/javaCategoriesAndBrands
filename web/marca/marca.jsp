<%-- 
    Document   : marca
    Created on : 15-02-2021, 10:03:14
    Author     : edgar.haro
--%>

<%@page import="Modelo.Marca"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Marca</title>
    </head>
    <body>
        
        <form action="InsertarMarcaControlador">
            <label>Código de la Marca</label>
            <input name="codigoMarca" placeholder="codigo"/>
            <label>Nombre de la Marca</label>
            <input name="nombreMarca" placeholder="nombre"/>
            <input type="submit" value="send" />
        </form>

        <h1>List of Brands</h1>
        <table>
            <c:forEach var="marca" items="${marcas}">
                <tr>
                    <td>${marca.getCodigoMarca()}</td>
                    <td>${marca.getNombreMarca()}</td>
                    <td><a href="DeleteMarcaControlador?id=<c:out value='${marca.getCodigoMarca()}'/>">Delete </a></td>
                    <td><a href="GetMarcaControlador?codigoMarca=<c:out value='${marca.getCodigoMarca()}'/>">Edit </a></td>
                    
                </tr>
            </c:forEach>
        </table>
        
        
        
        
    </body>
</html>
