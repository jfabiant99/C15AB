<!DOCTYPE html>
<html lang="en">
    <head>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Manito</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <link rel="stylesheet" href="https://mdbootstrap.com/previews/docs/latest/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://mdbootstrap.com/previews/docs/latest/css/mdb.min.css">
    </head>

    <body class="fixed-sn black-skin">

        <main>
            <div class="container text-center">
                <div class="card">
                    <h5 class="card-header info-color white-text text-center py-4">
                        <strong>LISTA DE USUARIOS</strong>
                    </h5>
                    <div class="card-body px-lg-5 pt-0">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Usuario</th>
                                    <th>Clave</th>

                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <c:forEach var="lista" items="${sessionScope.listar}">
                                        <th>${lista.id}</th>
                                        <th>${lista.nombre}</th>
                                        <th>${lista.apellido}</th>
                                        <th>${lista.usuario}</th>
                                        <th>${lista.clave}</th>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <a href="index.jsp" class="btn btn-outline-danger btn-rounded">ATRAS</a>
                    </div>
                </div>
            </div>
        </main>
        <script src="https://mdbootstrap.com/previews/docs/latest/js/jquery-3.3.1.min.js"></script>
        <script src="https://mdbootstrap.com/previews/docs/latest/js/popper.min.js"></script>
        <script src="https://mdbootstrap.com/previews/docs/latest/js/bootstrap.min.js"></script>
        <script src="https://mdbootstrap.com/previews/docs/latest/js/mdb.min.js"></script>
    </body>

</html>