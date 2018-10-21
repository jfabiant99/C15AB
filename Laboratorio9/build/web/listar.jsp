<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/main.css"/>
    </head>
<body>

<center>
    <h1>Lista de empleados</h1>
    <table>
        <tr>
            <td>Id</td>
            <td>First name</td>
            <td>Last name</td>
            <td>Age</td>
            <td>Rol</td>
        </tr>
        <c:forEach var="empleado" items="${sessionScope.a_empleados}">
            <tr>
                <td>${empleado.codigo}</td>
                <td>${empleado.first_name}</td>
                <td>${empleado.last_name}</td>
                <td>${empleado.age}</td>
                <td>${empleado.rol}</td>
            </tr>
        </c:forEach>
</table>
</center>
  
</body>
</html>
