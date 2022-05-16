<%--
  Created by IntelliJ IDEA.
  User: gaziz
  Date: 13.05.2022
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My First JSP</title>
</head>
<body>
    <h1>TESTING JSP!</h1>

    <%@ page import="java.util.Date" %>

    <%
        int a = 75;
        String s = "Robert's weight: " + a + " kg...";
    %>
    <p>
        <%= s %>
    </p>
    <p>
        <%= new Date()%>
    </p>

    <% for (int i = 0; i < 3; i++) {
        out.println("<br>*");
    } %>

    <p>
        <%= "URL parameter: name = " + request.getParameter("name") %>
    </p>

</body>
</html>
