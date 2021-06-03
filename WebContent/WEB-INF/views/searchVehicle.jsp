<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url('https://media1.giphy.com/media/3oKGzApIBl3UyNo7Cw/giphy.gif');

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>
<div class="bg">
<h2>Search Vehicle Page!</h2>
	<form action="${pageContext.request.contextPath}/vehicle/search" method="post" name="form1">
	
		<table>
		<tr>
		    <td>Vehicle Registration No:</td>
		    <td><input name="number" size="30" required="required" /></td>
		</tr>
		<tr>
		 <td> <label for="email">Enter your email:</label></td>
  		 <td> <input type="email" id="email" name="email"></td>
  		</tr>
		<tr>
		    <td colspan="2"><input type="submit" value="Search" /></td>
		</tr>
				
		</table>

	</form>

		 <a href="${pageContext.request.contextPath}/user/home" >Go Back to Home</a> <br />
</div>
</body>
</html>