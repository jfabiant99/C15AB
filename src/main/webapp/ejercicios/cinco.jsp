<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><head><title>Insert title here</title></head>
    <body>
        <h3>Javabean Example</h3>
        <jsp:useBean id="myUser3" class="com.mycompany.mvn9.Employee"  />

        <jsp:setProperty name="myUser3" property="apellido" value="manito" />
        <jsp:setProperty name="myUser3" property="name" value="Ursula" />

        Employee Information :<br/><br/>
        <b>ID:</b> <c:out value="${myUser3.apellido}" /><br/>
        <b>Name:</b> <c:out value="${myUser3.name}" /><br/>
    </body>
</html>
