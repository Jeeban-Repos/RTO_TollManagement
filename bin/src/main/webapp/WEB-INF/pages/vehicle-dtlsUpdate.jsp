<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Vehicle Details</h3>
	<table>
		<form:form action="vhclInfoUpd?ownerID=${ownerID}"
			modelAttribute="vhclDtlsModelCmd">
			<tr>
				<td>&nbsp;Vehicle_Type&nbsp;</td>
				<td><form:input path="vtype" /></td>
			</tr>
			<tr>
				<td>&nbsp;MFG_Year&nbsp;</td>
				<td><form:input path="mfgYear" /></td>
			</tr>
			<tr>
				<td>&nbsp;Vehicle_Brand&nbsp;</td>
				<td><form:input path="brandName" /></td>
			</tr>
			<tr>
				<td><button type="submit">Next</button>
				</td>
			</tr>
		</form:form>
	</table>
</body>
</html>