<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Style.css" />
 
 <script src="<c:url value="/resources/javascript/restapi.js" />"></script>
</head>

<body>


	<h2>technical99 - Spring Security Custom Login with JDBC</h2>
	<hr>
	<p>
	UserName: <security:authentication property="principal.username"/> 
	<br><br>
	UserRoles: <security:authentication property="principal.authorities"/> 
	</p>
	<security:authorize access="hasRole('EMPLOYEE')">
	<a href="${pageContext.request.contextPath}/">Employee Section (Only for EMPLOYEE)</a>
	</security:authorize>
	<br><br>
	<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.request.contextPath}/admin">IT Systems Meeting(Only for Admin)</a>
	</security:authorize>
	<br><br>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout">
	</form:form>






<h1>This is home page for investment</h1>
<h2>This is for testing purpose</h2>
<h2>this is testing for staging branch</h2>
<h1>testing from amn side</h1>


<a href="/RightInvesting/blogs/Written">what is written</a>
</body>
</html>