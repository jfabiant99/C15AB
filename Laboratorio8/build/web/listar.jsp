<%@page import="dao.ProductoEntity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/main.css"/>
    </head>
    <body>
        
        <jsp:useBean class="java.util.ArrayList" id="a_productos" scope="request"/>
        
        <center>
        <h1>Listado de productos</h1>
        
        <table style="border-collapse: collapse; border: black 1px solid; padding: 6px">
            <tr>
              <td><strong>Codigo</strong></td>
              <td><strong>Nombre</strong></td>
              <td><strong>Precio</strong></td>
              <td><strong>Stock</strong></td>
            </tr>
            <%
            ProductoEntity producto = new ProductoEntity();
            
            for (int i=0; i<a_productos.size(); i++) {
                
                producto = (ProductoEntity)a_productos.get(i);
                
            %>
            <tr>
              <td> <%= producto.getCodigo() %> </td>
              <td> <%= producto.getNombre() %> </td>
              <td> <%= producto.getPrecio() %> </td>
              <td> <%= producto.getStock() %> </td>
              
              
            </tr>
            
            <% } %>
        </table>
        <br>
        <a href="index.jsp"><button>Menu</button></a>
        </center>
    </body>
</html>
