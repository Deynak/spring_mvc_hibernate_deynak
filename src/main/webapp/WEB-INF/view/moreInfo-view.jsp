<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Task Details</title>
</head>
<body>
<h1>Task Details</h1>
<br><br>
<table>
    <tr>
        <th>Name</th>
        <td>${task.name}</td>
    </tr>
    <tr>
        <th>Details</th>
        <td>${task.details}</td>
    </tr>
    <tr>
        <th>Deadline</th>
        <td>${task.deadline}</td>
    </tr>
</table>
<br><br>
<input type="button" value="Back to tasks" onclick="window.location.href='show-view'" />
</body>
</html>
