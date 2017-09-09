<%@ page import="com.iqmsoft.payara.docker.service.PersonService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    PersonService pessoaService = PersonService.getInstance();

    pageContext.setAttribute("pessoas", pessoaService.getAll());

%>

<body>
<h2>Person Management</h2>
<form action="add" id="form" method="post">
    <label for="nome">name</label>
    <input type="text" id="nome" name="nome">
    <input type="submit" form="form" value="Save">
</form>

<c:forEach var="pessoa" items="${pessoas}">
    <p>${pessoa.name}</p>
</c:forEach>

</body>
</html>



