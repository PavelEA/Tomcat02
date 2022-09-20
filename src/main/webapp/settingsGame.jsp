<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Game of Survivor</title>
    <link rel="stylesheet" href="css/button.css">
</head>
<body>
<form action="prologue" method="get">
        <div class="input-group">
            <input type="text" class="form-control" name="username" placeholder="Введите ваше имя" maxlength="20" aria-label=""
                   value="" required>
            <button class="btn btn-success" type="submit" name="startBtn" value="start">Принять</button>
            <button class="btn btn-danger" type="submit" name="removeBtn" value="remove">Удалить</button>
        </div>
</form>
<img src="images/mainImage.jpg">
</body>
</html>