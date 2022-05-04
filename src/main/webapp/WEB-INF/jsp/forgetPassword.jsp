<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="<c:url value="/resources/styles/style.css"/>">
</head>
<body>
<div id="forgetPassword-comes-here"></div>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
<script src="https://cdn.jsdelivr.net/npm/handlebars@latest/dist/handlebars.js"></script>
<script src="<c:url value="/resources/templates/forgetPassword.js" />"></script>
<script>
window.onload=function()
{
	let forgetPassword=Handlebars.templates['forgetPassword'];
	$('#forgetPassword-comes-here').html(forgetPassword);
	
}
</script>
</body>
</html>