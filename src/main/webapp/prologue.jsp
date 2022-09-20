<%@ page import="dev.PavelEA.tomcat01.servlet.PageConstructor" %>
<%@ page import="dev.PavelEA.tomcat01.servlet.UserRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game of Survivor</title>
    <link rel="stylesheet" href="css/button.css">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h1>Пролог</h1>
<h2><%out.print(request.getSession().getAttribute("username"));%></h2>
<h2><%out.print(request.getServletContext().getInitParameter("username"));%></h2>

<h5><%out.print(PageConstructor.getPage(1));%></h5>

<form action="storyOne" method="get">
        <button type="submit" name="button">Начать</button>
</form>

</body>
</html>









