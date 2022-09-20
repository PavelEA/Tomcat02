<%@ page import="dev.PavelEA.tomcat01.servlet.PageConstructor" %>
<%@ page import="dev.PavelEA.tomcat01.servlet.AnswerConstructor" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Shop</title>
    <link href="../css/button.css" rel="stylesheet">
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
<h1>Событие: <% out.print(PageConstructor.getPage(4));%></h1>

<button class="btnGreen" onclick="window.location='sawmillSob8.jsp'"><%out.print(AnswerConstructor.getAnswer(7)); %></button>
<button class="btnGreen" onclick="window.location='sawmillSob9.jsp'"><%out.print(AnswerConstructor.getAnswer(8)); %></button>
<button class="btnGreen" onclick="window.location='sawmillSob10.jsp'"><%out.print(AnswerConstructor.getAnswer(9)); %></button>
</body>
</html>