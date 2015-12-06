<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Games</title>
</head>
<body>
<h1>Games Page</h1>

<a href="newGame">New Game</a>

<hr/>

<span>Filters: </span> <a href="index?type=Action">Action</a> - <a href="index?type=Racing">Racing</a> - <a href="index?type=Shooters">Shooters</a>

<hr/>

<c:forEach items="${games}" var="game">
 <div>
   <p>${game.name}</p>
   <p>${game.type}</p>
   <p>${game.console}</p>
   <p>${game.year}</p>
   <a href="viewGame?id=${game.id}">Details</a>
 </div>
 <hr/>
</c:forEach>



</body>
</html>