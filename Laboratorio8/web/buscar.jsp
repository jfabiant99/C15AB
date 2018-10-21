<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Buscar producto:</h1></center>
        <form action="SMuestraProducto" method="post">
            <table>
                <tr>
                    <td>Buscar por codigo: </td>
                    <td><input type="text" name="codigo" placeholder="ingrese el codigo a buscar"></td>
                    <td><input type="submit" value="Buscar"></td>
                </tr>
            </table>
        </form>
        <br>
        <a href="index.jsp"><button>Menu</button></a>
        
    </body>
</html>
