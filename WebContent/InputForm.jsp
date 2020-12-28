<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Product</title>
</head>
<body>

	<h1>Add a Product</h1>
	<form action="FormInput" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" /></td>
			</tr>
		</table>
		<select name="category" style="width: 155px">
			<option>Tires</option>
			<option>Paint</option>
			<option>Windows</option>
			<option>Mechanical</option>
			<option>Fuel</option>
		</select> <br />
		<br />
		<tr>
			<td colspan="2"><input type="submit" value="Add Product" /></td>
		</tr>
	</form>

</body>
</html>