<?xml version="1.0" encoding="UTF-8"?>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel=stylesheet href="<c:url value="/resources/styles/style.css"/>">
</head>
<body>
	<div id="Rendercommentspage"></div>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/handlebars@latest/dist/handlebars.js"></script>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
<script src="<c:url value="/resources/templates/comments.js"/>"> </script>
<script>
window.onload=function()
{
	let commentspage=Handlebars.templates['comments'];
	$('#Rendercommentspage').html(commentspage);
	getComments();
}
</script>
</body>
</html>