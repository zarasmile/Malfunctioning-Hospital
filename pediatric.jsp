<%--
  Created by IntelliJ IDEA.
  User: Meridian
  Date: 18.12.2016
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br>
<table align="center">
    <caption>
        Select a Doctor
    </caption>
    <tr>
        <th>Speciality</th>
        <th>Doctor</th>
    </tr>


    <tr>
        <c:forEach items="${Specialty}" var="Specialty">
            <td>${Specialty}</td>
        </c:forEach>
        <c:forEach items="${Doctor}" var="Doctor">
            <td><p>${Doctor}</p>
                <p><button>Appointment</button>
                    <button>Schedule</button></p></td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
