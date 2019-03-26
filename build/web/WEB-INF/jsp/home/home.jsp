<%-- 
    Document   : home
    Created on : 24-mar-2019, 17:06:58
    Author     : Prophet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista Home</title>
        <link href="<c:url value="/public/css/estilos.css"/>" rel="stylesheet"/>
        <script src="<c:url value="/public/js/functions.js"/>" type="text/javascript"></script>
    </head>
    <body>
        <h1 class="clase">Hello World! desde Home....</h1>
        
        <h1>recuperando el dato id, igual a: <c:out value="${id}"/></h1>
        <h1>recuperando el dato id2, igual a: <c:out value="${id2}"/></h1>
        <h1>resultado de la suma: <c:out value="${suma}"/></h1>
        <h1></h1>
        <a href="javascript:void(0);" onclick="saludo();"> click</a>
        <img src="<c:url value="/public/img"/>"/>
        <a href="<c:url value="index.htm" />">ir a index</a>
    </body>
</html>
