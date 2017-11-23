<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Index Page</title>
</head>

<body>
	<spring:form method="post" modelAttribute="listJSP" action="addString">
		String: <spring:input path="string"/> <br/>
		<spring:button>Go</spring:button>
	</spring:form>

<div >
	<c:forEach var="String" items="${listJSP.list}" >
		<c:out value="${String}"/><br />
	</c:forEach>
</div>
</body>

</html>