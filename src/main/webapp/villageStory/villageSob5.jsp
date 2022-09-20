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
<h1>Событие: <% out.print(PageConstructor.getPage(6));%></h1>

<button class="btnGreen" onclick="window.location='villageStory/villageSob23.jsp'"><%out.print(AnswerConstructor.getAnswer(12)); %></button>
<button class="btnGreen" onclick="window.location=''"><%out.print(AnswerConstructor.getAnswer(13)); %></button>
</body>
</html>
