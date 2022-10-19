<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home WhiteOrange</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Style.css" />
 
 <script src="<c:url value="/resources/javascript/restapi.js" />"></script>

</head>

<body>
	 <security:authentication property="principal.username"/> 
	<br><br>
	 <security:authentication property="principal.authorities"/> 
	</p>
	<security:authorize access="hasRole('EMPLOYEE')">
	<a href="${pageContext.request.contextPath}/"></a>
	</security:authorize>
	<br><br>
	<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.request.contextPath}/admin"></a>
	</security:authorize>
	<br><br>
	


<<<<<<< HEAD




=======
<a href="/RightInvesting/blogs/Written">what is written</a>
<h1>this is testing for updation   </h1>
>>>>>>> branch 'staging' of https://github.com/amnkashp/RightInvest.git
</body>
</html>