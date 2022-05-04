<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="<c:url value="/resources/styles/style.css"/>">
</head>
<body id="indexPage">
<div id="index-comes-here"></div>
<script src="https://cdn.jsdelivr.net/npm/handlebars@latest/dist/handlebars.js"></script>
<script src="<c:url value="/resources/templates/index.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
<script>
window.onload=function()
{
	let index=Handlebars.templates['index'];
	$('#index-comes-here').html(index());
}
</script>
</body>
</html>