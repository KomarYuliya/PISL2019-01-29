<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 28.04.2019
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Расписание</title>
</head>
<body>
<style>
    body{
        background-color: RosyBrown;
    }
    table{
        border: 2px solid black;
        border-collapse: collapse;
        width: 100%;
    }
    td, th{
        border: 2px solid black;
    }
    th{
        background-color: aqua;
    }
    td{
        background-color: white;
    }
    .butt{
        margin-top: 10px;
        align-content: end;
        width: 100%;
        text-align: right;
    }
</style>
<h1 align="center">Расписание ${requestScope.name}</h1>
<form method="post" action="/">
    <table>
        <thead>
        <tr>
            <th>Номер</th>
            <th>Дата отправления</th>
            <th>Время отправления</th>
            <th>Куда</th>
            <th>Вокзал отправления</th>
            <th>Платформа</th>
            <th>Вокзал прибытия</th>
            ${requestScope.partOfTable}

            <th>Добавить в список</th>
        </tr>
        </thead>
        <tbody>${requestScope.timetable}</tbody>
    </table>
    <div class="butt">
    <input type="submit" value="Добавить в закладки">
    </div>
</form>

</body>
</html>
