<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- obviously this should be in a css file -->

<style>
	.error {
		color: #ff0000;
	}
	
	.errorBlock {
		color: #000;
		background-color: #ffeeee;
		boarder: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}
</style>


</head>
<body>
	<p>Good to have goals</p>
	
	<form:form commandName="goal" >
		<form:errors path="*" element="div" cssClass="errorBlock" />
		<table>
			<tr>
				<td>Enter Your Goal</td>
				<td><form:input path="lifeGoal"/></td>
				<td><form:errors path="lifeGoal" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Your Age</td>
				<td><form:input path="age" cssErrorClass="error" />
				<td></td>
			</tr>
			<tr colspan="3">
				<td>
					<input type="submit" value="yes" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>