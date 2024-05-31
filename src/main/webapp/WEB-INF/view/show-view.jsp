<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Your Tasks</h1>
<br>
<br>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Deadline</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="task" items="${allTasks}">
        <c:url var="moreInfo" value="/moreInfo">
            <c:param name="taskId" value="${task.id}" />
        </c:url>
        <c:url var="delete" value="/deleteTask">
            <c:param name="taskId" value="${task.id}" />
        </c:url>

        <tr>
            <td>${task.name}</td>
            <td>${task.deadline}</td>
            <td>
                <input type="button" value="Info" onclick="window.location.href='${moreInfo}'" />
                <input type="button" value="delete" onclick="window.location.href='${delete}'" />
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Create Task" onclick="window.location.href='createNewTask-view'" />
</body>
</html>
