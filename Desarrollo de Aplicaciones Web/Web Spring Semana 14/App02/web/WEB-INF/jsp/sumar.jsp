<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 <title>JSP Page</title>
  </head>
  <body>
	 <h1>SUMAR</h1>
	 <form method="post" action="procesarSuma2.htm">
		<p>Número 1: <input type="text" name="num1" /></p>
		<p>Número 2: <input type="text" name="num2" /></p>
		<p><input type="submit" value="Sumar" /></p>
	 </form>

	 <c:if test="${suma != null}">
		<h2>RESULTADO</h2>
		<p>Número 1: ${num1}</p>
		<p>Número 2: ${num2}</p>
		<p>Suma: ${suma}</p>
	 </c:if>

  </body>
</html>
