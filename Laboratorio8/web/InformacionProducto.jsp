<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/main.css"/>
    </head>
    <body>
              
        <center>
        <h1>Producto encontrado</h1>
        
        <table style="border-collapse: collapse; border: black 1px solid; padding: 6px">
            <tr>
              <td><strong>Codigo</strong></td>
              <td><strong>Nombre</strong></td>
              <td><strong>Precio</strong></td>
              <td><strong>Stock</strong></td>
            </tr>
            <jsp:useBean id="infoProducto" type="modelo.ProductoBean" scope="request"/>
            <tr>
              <td> <jsp:getProperty name="infoProducto" property="codigo"/> </td>
              <td> <jsp:getProperty name="infoProducto" property="nombre"/> </td>
              <td> <jsp:getProperty name="infoProducto" property="precio"/> </td>
              <td> <jsp:getProperty name="infoProducto" property="stock"/> </td>
            </tr>
            
        </table>
        <br>
        <a href="buscar.jsp"><button>Volver</button></a>
        </center>
    </body>
</html>
