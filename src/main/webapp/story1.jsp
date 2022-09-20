<%@ page import="dev.PavelEA.tomcat01.servlet.AnswerConstructor" %>
<%@ page import="dev.PavelEA.tomcat01.servlet.PageConstructor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shop</title>
    <link href="css/button.css" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h1>Событие: <% out.print(PageConstructor.getPage(2));%></h1>

<button class="btnGreen" onclick="window.location='villageStory/village.jsp'"><%out.print(AnswerConstructor.getAnswer(1)); %></button>
<button class="btnGreen" onclick="window.location='forestStory/forest.jsp'"><%out.print(AnswerConstructor.getAnswer(2)); %></button>
<button class="btnGreen" onclick="window.location='sawmillStory/sawmill.jsp'"><%out.print(AnswerConstructor.getAnswer(3)); %></button>
</body>
</html>
