<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Список пользователей</h1>

<core:forEach var="mathOperation" items="${users}">
    ${mathOperation.name} ${mathOperation.surname} ${mathOperation.login} ${mathOperation.age} <br>
</core:forEach>


</body>
</html>
