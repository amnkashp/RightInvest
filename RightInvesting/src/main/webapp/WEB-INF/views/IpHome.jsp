<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Style.css" />
 
 <script src="<c:url value="/resources/javascript/restapi.js" />"></script>
</head>
<body>
<header class="header">
<nav class="navbar">
<a href="#home">home</a>
<a href="#features">features</a>
<a href="#testimonials">Testimonials</a>
<a href="#blogs">blogs</a>
<a href="#service">service</a>
<a href="#contact">contact us</a>

</nav>

<button type ="button"> Log In</button>
</header>

<section class="home" id="home">
<div class="content">
<h3> Invest the money for your and your family. </h3> 
</div>
</section>

<section class="features" id="features">
<h1 class="heading"> our <span> features </span> </h1>
</section>


<section class="testimonials" id="testimonials">
<h1 class="heading"> our <span> Testimonials</span> </h1>
</section>

<section class="blogs" id="blogs">
<h1 class="heading"> our <span> Blogs </span> </h1>
</section>

<section class="service" id="service">
<h1 class="heading"> our <span> Service </span> </h1>
</section>

<section class="contact" id="contact">
<h1 class="heading"> our <span> Contact us </span> </h1>
<div class="dcon"> back to top </div>
<div class="con"> </div>

</section>

</body>
</html>