<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
 <title>Notification Popup</title>

<link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/css/login-register.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">

</head>
<body class="bg-gradient-primary">
<div class="container">
<div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
      <div class="sidebar-brand d-flex align-items-center justify-content-center">

<h2 style="margin-top: 20px;">New Notifications</h2></div><hr>
    
            <!-- <strong>Notifications:</strong> -->
            <ul style="margin-left: 380px;">
                <c:forEach items="${notifications}" var="notification">
                    <li style="border-color: green;"><span>${notification.message}</span></li>
                </c:forEach>
            </ul>
            <hr>
<marquee behavior="slide" direction="left" scrollamount="20" loop="1000" vspace=25>
<img src="http://www.shah-e-razzaq.com/images/gallery/c88d12.jpg" alt="Roza" title="Roza" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/48ce28.jpg" alt="Miya1" title="Miya1" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/7b1405.jpg" alt="DadaMiya1" title="DadaMiya1" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/f3f01d.jpg" alt="DadaMiya2" title="DadaMiya2" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/af4bd1.jpg" alt="Miya2" title="Miya2" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/4f8dbd.jpg" alt="Miya2" title="Miya2" width="150" height="200">
</marquee>
<footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
<h5>Mobile: +91-9829699009 E-mail : mkmansoori@gmail.com</h5>
</div>
</div>
</footer>
</div>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
