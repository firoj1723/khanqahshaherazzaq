<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ include file="menu.jsp" %> --%>
         <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin</title>
<link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${pageContext.request.contextPath}/css/login-register.css" rel="stylesheet">
  
  <!-- Custom styles for this page -->
  <link href="${pageContext.request.contextPath}/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">
</head>
<body class="bg-gradient-primary">

<div class="container">
<div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
<div class="sidebar-brand d-flex align-items-center justify-content-center">
<h2 style="margin-top: 20px;">ADMIN DASHBOARD</h2></div><hr>

<h4 style="margin-top: 20px;margin-left: 380px;">Add New Notification Here...</h4>

<form action="addNotification" method="post" style="margin-top: 20px;margin-left: 380px;">
<pre>
<input type="text" name="message" placeholder="enter here new notification"/>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
<button type="submit" style="background-color:buttonshadow ;">Add Notification</button>
</pre>
</form>

<hr>
<h4 style="margin-top: 20px;margin-left: 380px;">Add New Books Here...</h4>
   <form action="uploadFiles" method="post" encType="multipart/form-data" style="margin-top: 20px;margin-left: 380px;">
<pre>
<input type="file" name="files" multiple required />
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
<button type="submit" style="background-color:buttonshadow ;">Add Book</button>
</pre>
</form>

<hr>
   <div>
    <div class="sidebar-brand d-flex align-items-center justify-content-center">
     <h2 style="background-color: pink;">List of Miya Huzur Books</h2></div>
     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
       <thead style="background-color: pink;">
         <tr>
           <th>Id</th>
           <th>Book Name</th>
           <th>Delete Book</th>
         </tr>
       </thead>
       <c:forEach var="doc" items="${docs }">
       <tbody>
         <tr ${docs}>
           <td style="color:green;">${doc.id}</td>
           <td style="color:green;">${doc.docName}</td>
           <td style="color:green;"><a href="delete/+${doc.id}">Delete</a></td>
         </tr>
       </tbody>
       </c:forEach>
     </table>
   </div>
   <hr>
   <strong style="margin-left: 450px;"><a href="deleteNotification">Show All Notifications</a></strong>
   <hr>
   <hr>
   <strong style="margin-left: 450px;"><a href="feedbackSee">Show All Feedbacks</a></strong>
   <hr>
   <div>
    <div class="sidebar-brand d-flex align-items-center justify-content-center">
     <h2 style="background-color: pink;">List of Notifications</h2></div>
     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
       <thead style="background-color: pink;">
         <tr>
           <th>Id</th>
           <th>Message</th>
           <th>Delete Notification</th>
         </tr>
       </thead>
       <c:forEach var="notification" items="${notifications }">
       <tbody>
         <tr ${notifications}>
           <td style="color:green;">${notification.id}</td>
           <td style="color:green;">${notification.message}</td>
           <td style="color:green;"><a href="deleteNotification/+${notification.id}">Delete</a></td>
         </tr>
       </tbody>
       </c:forEach>
     </table>
   </div>
   
   <div>
    <div class="sidebar-brand d-flex align-items-center justify-content-center">
     <h2 style="background-color: pink;">List of FeedBacks</h2></div>
     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
       <thead style="background-color: pink;">
         <tr>
           <th>Id</th>
           <th>Name</th>
           <th>Feedback</th>
           <th>City</th>
           <th>Mobile</th>
           <th>Email</th>
           <th>Gender</th>
           <th>Delete Feedback</th>
         </tr>
       </thead>
       <c:forEach var="feeds" items="${feed }">
       <tbody>
         <tr ${feed}>
           <td style="color:green;">${feeds.id}</td>
           <td style="color:green;">${feeds.name}</td>
           <td style="color:green;">${feeds.feed}</td>
           <td style="color:green;">${feeds.city}</td>
           <td style="color:green;">${feeds.mobile}</td>
           <td style="color:green;">${feeds.email}</td>
           <td style="color:green;">${feeds.gender}</td>
           <td style="color:green;"><a href="deleteFeedback/+${feeds.id}">Delete</a></td>
         </tr>
       </tbody>
       </c:forEach>
     </table>
   </div>
   
<strong style="margin-left: 450px;">${deleteMessage }</strong>
   <hr>
   <strong style="margin-left: 450px;">${errorMessage }</strong>
</div>
</div>
</div>
</body>
</html>