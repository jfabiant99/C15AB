<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Registrar un producto</h1></center>
        <form action="SRegistrarProducto" method="post">
            <table>
                <tr>
                    <td>Codigo: </td>
                    <td><input type="text" name="codigo" placeholder="ingrese el codigo del producto"></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input type="text" name="nombre" placeholder="ingrese el nombre del producto"></td>
                </tr>
                <tr>
                    <td>Precio: </td>
                    <td><input type="text" name="precio" placeholder="ingrese el precio del producto"></td>
                </tr>
                <tr>
                    <td>Stock: </td>
                    <td><input type="text" name="stock" placeholder="ingrese el stock del producto"></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Limpiar"></td>
                    <td><input type="submit" value="Registrar"></td>
                    
                </tr>
            </table>
        </form>
        <br>
        <td><a href="index.jsp"><button>Menu</button></a></td>
    </body>
</html>
