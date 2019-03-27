<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso nuevo afiliado</h1>
        <div class="container">
            <div class="row">
                
                <form:form method="post" commandName="afiliado">
                    
                    <form:errors path="*" element="div" cssClass="alert alert-danger"/>
                    
                    
                    <p>
                        <form:label path="dni">DNI</form:label>
                        <form:input path="dni" cssClass="form-control" />
                    </p>
                    <p>
                        <form:label path="codAfiliado">CODIGO</form:label>
                        <form:input path="codAfiliado" cssClass="form-control"/>
                    </p>
                    <p>
                        <form:label path="area">PUESTO</form:label>
                        <form:select path="area" cssClass="form-control">
                            <form:option value="0">Seleccione...</form:option>
                            <form:options items="${listadoAreas}"/>
                        </form:select>
                    </p>
                    <p>
                        <form:label path="sueldo">SUELDO BASICO</form:label>
                        <form:input path="sueldo" cssClass="form-control"/>
                    </p>
                    <hr>
                    <button class="form-control">Registrar</button>
                </form:form>
            </div>
        </div>

    </body>
</html>
