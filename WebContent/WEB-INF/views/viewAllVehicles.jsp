<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  /* The image used*/
  background-image: url('https://lh3.googleusercontent.com/proxy/a48OC0pZy6l6TC3V6djoywp9A7giwam-13JbB-rKlPLP4ijn9UVaZuDsT6nzchqTLrfGbOwItMEbr8xUxYb3DS5x0P9lCow');

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
<h2> All the vehicles !!</h2>
<c:forEach items="${requestScope.vehicleList}" var="vehicle">
            <b>Vehicle No:</b> ${vehicle.number}<br>
            <b>Vehicle Type:</b> ${vehicle.vehicleType}<br>
            <b>Color</b> ${vehicle.color}<br>
            <b>Address:</b> ${vehicle.address}<br>
            <b>Vehicle Model:</b> ${vehicle.modelName}<br><br>
        </c:forEach>
        
        <a href="${pageContext.request.contextPath}/user/home" >Go Back to Home</a> <br />
</div>
</body>

</html>