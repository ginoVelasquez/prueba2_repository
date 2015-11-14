<%-- 
    Document   : detalleVista
    Created on : 06/11/2015, 02:51:49 PM
    Author     : Mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <tr>
            <td>
                <c:out value ="${producto.getNombre()}"></c:out>
                <c:out value ="${producto.getPrecio()}"></c:out>
                <c:out value ="${producto.getDescripcion()}"></c:out>
                </br>
            </td>
        </tr>            

        
        
    </body>
</html>
