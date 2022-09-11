<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<h1>This is Customer Form for User Input</h1>

<%-- 
 	 <div class="input-group" >
	<form action="formInput" modelAttribute="user" method="Get">
	  <span class="input-group-text">First and last name</span>
	  <input type="text" aria-label="First name" class="form-control">
	  <input type="text" aria-label="Last name" class="form-control">
	 <input type="submit" value="Submit">
	 </form>
	 </div>
  --%>

	 <div>
		<form:form action="formInput" modelAttribute="user" method="Post" >
		
			<table>
				<tbody>
					<tr>
						<td><label>User Name</label></td>
						<td> <form:input path="userName"/> </td>
					</tr>
					
					<tr>
						<td><label>Age</label></td>
						<td> <form:input path="userAge"/></td>
					</tr>
					
					<tr>
						<td><label>City</label></td>
						<td> <form:input path="userCity"/> </td>
					</tr>
					
					<tr>
						<td><label>Postal Pin code</label></td>
						<td> <form:input path="userPincode"/> </td>
					</tr>
					
					<tr>
						<td><label>Mobile No.</label></td>
						<td> <form:input path="userPhone"/> </td>
					</tr>
					
					<tr>
						<td><label>Email </label></td>
						<td> <form:input path="userEmail"/> </td>
					</tr>
					
					<tr>
						<td><label>Gender</label></td>
						<td> <form:input path="userGender"/> </td>
					</tr>
					
					<tr>
						<td><label>Plan Type</label></td>
						<td> <form:input path="userPlantype"/> </td>
					</tr>
					
					<tr>
						<td><label>Total Income</label></td>
						<td> <form:input path="userTotalIncome"/> </td>
					</tr>
					
					<tr>
						<td><label>Portfolio Size</label></td>
						<td> <form:input path="userPortfolioSize"/> </td>
					</tr>
					
					<tr>
						<td><label>Any Note</label></td>
						<td> <form:input path="userNotes"/> </td>
					</tr>
					
					
					
					
					<tr>
						<td><input type="Submit" value="submit"></td>
					</tr>
					
				</tbody>
			</table>
					</form:form>
	

</div>
 

</body>
</html>