
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
        <h1>Datos Afiliado</h1>
        <ul>
            <li>dni: <c:out value="${dni}"/></li>
            <li>codigo: <c:out value="${codAfiliado}"/></li>
            <li>puesto: <c:out value="${area}"/></li>
            <li>sueldo: <c:out value="${sueldo}"/></li>
        </ul>
    </body>
</html>
