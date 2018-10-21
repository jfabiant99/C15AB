<%-- 
    Document   : tres
    Created on : 01/10/2018, 10:59:52 PM
    Author     : ORLANDO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="a" value="${33+42}"/>
        <c:set var="b" value="${33*42}"/>
        a : <c:out value="${a}" /> 
        <br>
        b : <c:out value="${b}" />
        <br>
        <c:choose>
            <c:when test="${a>b}">
                El valor de a es mayor que b
            </c:when> 
            <c:otherwise>
                El valor de a es menor o igual que b
            </c:otherwise>
        </c:choose>	 
        <br>
        <c:set var="nro" value="uno" />

        nro : <c:out value="${nro}" /> 
        <br>		
        <c:choose>
            <c:when test="${nro == 'uno'}">
                El valor de nro es 1
            </c:when> 
            <c:when test="${nro == 'dos'}">
                El valor de nro es 2
            </c:when> 
            <c:otherwise>
                El valor de a no esta definido
            </c:otherwise>
        </c:choose>

    </body>
</html>
