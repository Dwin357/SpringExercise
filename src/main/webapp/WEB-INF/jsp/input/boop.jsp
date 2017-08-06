<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spri" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>The form</h3>
	
	<p>language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a></p>
	
	<form:form commandName="daffy">
		<table>
			<tr>
				<td><spri:message code="goal.text" /></td>
				<td><form:input path="theNumber"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="go" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>