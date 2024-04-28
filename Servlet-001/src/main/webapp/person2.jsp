<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>PERSON DETAILS</h1>
<form method="post" action="fetch1">
<fieldset>
<legend>Personal Information</legend>
<div>
<label for="name">PName:</label>
<input type="text" name="name" id="name" class="txt" />
</div>
<div>
<label for="age">PrAge:</label>
<input type="text" name="age" id="age" class="txt" />
</div>
<div>
<label for="gender">Gender:</label>
<input type="gender" name="gender" id="gender" class="txt" />
</div>
<div>
<label for="email">PEmail:</label>
<input type="email" name="email" id="email" class="txt" />
</div>
</fieldset>
<div>
<input type="submit" class="btn" />
</div>
</form>
</body>
</html>