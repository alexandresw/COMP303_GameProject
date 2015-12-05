<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Game Form</h1>
	<form action="addGame" method="post">
		Name: <input name="name" /><br /> 
		Type: <input name="type" /><br /> 
		Console: <input name="console" /><br /> 
		Year: <input name="year" /><br /> 
		price: <input name="price" /><br /> 
		picture: <input name="picture" /><br /> 
		Description:
		<textarea name="description" rows="5" cols="30"></textarea><br /> 
		<input type="submit" value="Add">
	</form>
</body>
</html>