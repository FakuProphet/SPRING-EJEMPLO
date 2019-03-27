
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario afiliado</h1>
        <form:form>
            <p>
                <form:label path="dni">DNI</form:label>
                <form:input path="dni"/>
            </p>
            <p>
                <form:label path="codAfiliado">CODIGO</form:label>
                <form:input path="codAfiliado"/>
            </p>
            <p>
                <form:label path="area">PUESTO</form:label>
                <form:input path="area"/>
            </p>
            <p>
                <form:label path="sueldo">SUELDO BASICO</form:label>
                <form:input path="sueldo"/>
            </p>
            <hr>
            <form:button>Guardar</form:button>
        </form:form>
    </body>
</html>
