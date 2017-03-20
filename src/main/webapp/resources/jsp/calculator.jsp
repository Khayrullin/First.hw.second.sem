<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Calculator</title>
</head>


<body>


<sf:form action="/calculator/operate" method="post" modelAttribute="mathOperation">

    <sf:label path="digit">Number: </sf:label> <sf:input path="digit"/> <sf:errors path="digit"/> <br>
<br>
    <sf:button value="add" name="action">+</sf:button>
    <sf:button value="minus" name="action">-</sf:button>
    <sf:button value="devide" name="action">/</sf:button>
    <sf:button value="mult" name="action">*</sf:button>
    <sf:button value="equal" name="action">=</sf:button>


</sf:form>


<p> Результат: </p> ${result} <p> Действие: </p> ${mathaction}


</body>
</html>

