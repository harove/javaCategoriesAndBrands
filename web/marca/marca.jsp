<%-- 
    Document   : marca
    Created on : 15-02-2021, 10:03:14
    Author     : edgar.haro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Marca</title>
    </head>
    <body>
        <form action="../InsertarMarcaControlador">
            <label>Codigo de la marca</label>
            <input type ="text" placeholder="escriba codigo de la marca" name ="codigoMarca" />
            <label>Nombre de la marca</label>
            <input type ="text" placeholder="escriba nombre de la marca" name ="nombreMarca" />
            <input type ="submit" value ="enviar" />  
        </form>
    </body>
</html>
