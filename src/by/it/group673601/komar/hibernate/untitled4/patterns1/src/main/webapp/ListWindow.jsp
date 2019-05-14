<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 01.05.2019
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Закладки</title>
</head>
<body>
<style>
    body{
        background-color: RosyBrown;
    }
    table{
        margin-top: 20px;
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
<form method="post" action="/list">
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
        <th>Цена</th>
        <th>Марка автобуса</th>
        <th>Время в пути</th>
        <th>Удалить из списка</th>
    </tr>
    </thead>
    <tbody>${requestScope.timetableBuses}</tbody>
</table>
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
        <th>Тип билета</th>
        <th>Цена</th>
        <th>Дата прибытия</th>
        <th>Время прибытия</th>
        <th>Удалить из списка</th>
    </tr>
    </thead>
    <tbody>${requestScope.timetableTrains}</tbody>
</table>
    <div class="butt">
    <input type="submit" value="Удалить">
    </div>
</form>
</body>
</html>
