<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Create yor task</h1>
<br>
<br>
<form:form action="saveTask" modelAttribute="newTask">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    details <form:input path="details"/>
    <form:errors path="details"/>
    <br><br>
    Deadline <form:input path="deadline" type="date"/>
    <br><br>
    <input type="submit" value="create">
    <input type="button" value="Back to tasks" onclick="window.location.href='show-view'" />
</form:form>
</body>
</html>
