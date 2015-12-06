<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Game Details</h1>
<div>
   <p>Name: ${game.name}</p>
   <p>Type: ${game.type}</p>
   <p>Console: ${game.console}</p>
   <p>Year: ${game.year}</p>
   <p>Price: ${game.price}</p>
   <p>Picture: <img src="${game.picture}"/></p>
   <p>Description: ${game.description}</p>
 </div>
 <a href="index">Back</a>
</body>
</html>