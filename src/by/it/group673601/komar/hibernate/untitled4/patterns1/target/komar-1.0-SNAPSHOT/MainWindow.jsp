<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 21.03.2019
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
<h1 align="center">Выберите расписание</h1>

<form method="post" action="/timetable">
    <table>
        <thead>
        <tr>
            <th><p>Тип транспорта</p></th>
            <th><p>Выбор по:</p></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <p><input type="radio" name="type" value="bus" checked="checked">Автобус</p>
                <p><input type="radio" name="type" value="train">Поезд</p>
            </td>
            <td>
                <p><input type="radio" name="select" value="1" checked="checked">Все</p>
                <p><input type="radio" name="select" value="2">Пункту назначения</p>
                <p><input type="radio" name="select" value="3">Пункту отбытия</p>
                <input type="text" name="place" placeholder="Город или вокзал">
                <p><input type="radio" name="select" value="4">Дата</p>
                <input type="text" name="begin" placeholder="От">
                <input type="text" name="end" placeholder="До">
            </td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Поиск">
</form>
<form method="get" action="/list">
    <input type="submit" value="Закладки">
</form>

</body>
</html>
