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

        <a href="../listMarcaControlador">Listar Marcas</a>

  

        <table>
            <c:forEach var="marca" items="${marcas}">
                <tr>
                    <td>${marca.getCodigoMarca()}</td>
                    <td>${marca.getNombreMarca()}</td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
