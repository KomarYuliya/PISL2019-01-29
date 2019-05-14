<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>List</title>

</head>
<body>
<style>
    table{
        border: 2px solid black;
        border-collapse: collapse;
        width: 100%;
    }
    th{
        background-color: aqua;
        border: 2px solid black;
    }
    td{
        border: 2px solid black;
        border-collapse: collapse;
    }
</style>
<a href="addPerson">Add Person</a>
<br><br>
<div>

    <table>
        <tr>
            <th>Номер</th>
            <th>Название</th>
            <th>Запланированное время (часы)</th>
            <th>Запланированные ресурсы (человек)</th>
            <th>Дата начала</th>
            <th>Текущее время (часы)</th>
            <th>Изменить</th>
            <th>Удалить</th>
        </tr>
        <form>
        <#list persons as person>
        <tr>
            <td>${person.taskId}</td>
            <td>${person.taskName}</td>
            <td>${person.planTime}</td>
            <td>${person.planPeople}</td>
            <td>${person.startDate}</td>
            <td>${person.currentTime}</td>
            <td><input type="radio" name="updateLines" value="${person.taskId}" th:field="*{toDelete}"></td>
            <td><input type="checkbox" name="updateLines" value="${person.taskId}"></td>
        </tr>
        </form>
    </#list>
    </table>
</div>
</body>
</html>