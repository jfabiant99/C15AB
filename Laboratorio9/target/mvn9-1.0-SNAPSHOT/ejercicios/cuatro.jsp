
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html><head><title>Insert title here</title></head>
    <body>
        <h3>Ejemplo</h3>

        <c:forEach var="i" begin="0" end="10">
            El valor de i =  <c:out value="${i}" />
            <br />
        </c:forEach>
    </body>
</html>