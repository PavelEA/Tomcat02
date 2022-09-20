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
<h1>Событие: <% out.print(PageConstructor.getPage(5));%></h1>

<button class="btnGreen" onclick="window.location='forestSob11.jsp'"><%out.print(AnswerConstructor.getAnswer(10)); %></button>
<button class="btnGreen" onclick="window.location='forestSob12.jsp'"><%out.print(AnswerConstructor.getAnswer(11)); %></button>

</body>
</html>
