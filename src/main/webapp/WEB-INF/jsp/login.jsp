<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="<c:url value="/resources/styles/style.css"/>">
</head>
<body id="loginPage">
<div id="login-comes-here"></div>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
<script src="https://cdn.jsdelivr.net/npm/handlebars@latest/dist/handlebars.js"></script>
<script src="<c:url value="/resources/templates/login.js" />"></script>
<script>
window.onload=function()
{
	let login=Handlebars.templates['login'];
	$('#login-comes-here').html(login);
}
</script>
</body>
</html>