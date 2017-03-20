<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Добавление нового пользователя: </h1>

<sf:form action="/users/add_user" method="post" modelAttribute="mathOperation">

    <sf:label path="name">Имя: </sf:label> <sf:input path="name"/> <sf:errors path="name"/> <br>
    <sf:label path="surname">Фамилия: </sf:label> <sf:input path="surname"/> <sf:errors path="surname"/><br>
    <sf:label path="login">Логин: </sf:label> <sf:input path="login"/> <sf:errors path="login"/><br>
    <sf:label path="age">Возвраст: </sf:label> <sf:input path="age"/> <sf:errors path="age"/><br>
    <sf:label path="password">Пароль: </sf:label> <sf:password path="password"/> <sf:errors path="password"/><br>

    <button type="submit">Сохранить</button>
</sf:form>



<sf:form action="/calculator/operate" method="post">


    <div class="form-group">
        <label for="number" class="sr-only">Number</label>
        <input type="text"
            <sf:errors path="age"/> name="number" id="number" size="25" class="form-control"
               placeholder="Введите число">
    </div>


    <div class="btn-group">
        <button type="submit" id="add" class="btn btn-default" name="mathaction">+</button>
        <button type="submit" id="minus" class="btn btn-default" name="mathaction">-</button>
        <button type="submit" id="mult" class="btn btn-default" name="mathaction">*</button>
        <button type="submit" id="division" class="btn btn-default" name="mathaction">/</button>
        <button type="submit" id="equal" class="btn btn-default" name="mathaction">=</button>
    </div>


</sf:form>
</body>
</html>
