<%-- 
    Document   : formularioTres
    Created on : 27-mar-2019, 15:57:26
    Author     : Prophet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo app conexión a BBDD</h1>

        <div class="container">
            <div class="row">

                <p>
                    <a href="" class="btn btn-primary"> Nuevo registro</a> 
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Id Turno</th>
                            <th>Paciente</th>
                            <th>Estado</th>
                            <th>Dni</th>
                            <th>Hora Id</th>
                            <th>Fecha</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listadoTurnos}" var="t" >
                            <tr>
                                <td><c:out value="${t.turnoID}"/></td>
                                <td><c:out value="${t.nombrePaciente}"/></td>
                                <td><c:out value="${t.estado}"/></td>
                                <td><c:out value="${t.dni}"/></td>
                                <td><c:out value="${t.horaID}"/></td>
                                <td><c:out value="${t.fecha}"/></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
