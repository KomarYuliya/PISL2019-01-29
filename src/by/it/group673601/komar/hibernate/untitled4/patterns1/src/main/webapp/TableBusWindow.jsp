<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 28.04.2019
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Таблица</title>
</head>
<body>
    <table>
        <tr>
            <th>Номер маршрута</th>
            <th>Дата отправления</th>
            <th>Время отправления</th>
            <th>Пункт назначения</th>
            <th>Вокзал отправления</th>
            <th>Платформа отправления</th>
            <th>Вокзал прибытия</th>
            <th>Стоимость билета</th>
            <th>Марка автобуса</th>
            <th>Время в пути</th>
        </tr>
        ${requestScope.info}
    </table>
</body>
</html>
