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
  background-image: url('https://st.depositphotos.com/1499637/1244/v/600/depositphotos_12440626-stock-illustration-funny-vehicles-in-the-city.jpg');

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
<h3>Welcome to home page!</h3><br>
<a href="${pageContext.request.contextPath}/vehicle/getAll">All Vehicles</a><br/>
<a href="${pageContext.request.contextPath}/vehicle/search">Search Vehicle</a><br/>
</div>
</body>
</html>