<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>

<!--  <style>
body {
  background-color: lightblue;
}
</style>
<style>
h2 {
text-align: center;
  background-color: white;
}
</style>
<style>
h3 {
text-align: right;
  background-color: white;
  border-bottom: medium;
}
</style> -->
<!-- Custom fonts for this template -->
  <link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${pageContext.request.contextPath}/css/login-register.css" rel="stylesheet">
  
  <!-- Custom styles for this page -->
  <link href="${pageContext.request.contextPath}/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">


<title>File Upload / Download</title>
</head>
<body class="bg-gradient-primary"> <div class="container">
<div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">



<!--  <form id="uploadFiles" name="uploadFiles" method="post" th:action=@{/uploadFiles} encType="multipart/form-data">
       <input type="file" name="files" multiple required />
       <button type="submit">Submit</button>
     </form> -->
    <div class="sidebar-brand d-flex align-items-center justify-content-center">
     <h2 style="background-color: pink;">Download The Books Here</h2>
    
   </div>
<%--    <form action="file/uploadFiles" method="post" encType="multipart/form-data">
<pre>
<input type="file" name="files" multiple required />
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
<button type="submit">Submit</button>
</pre>
</form> --%>
<hr>
   <div>
    <div class="sidebar-brand d-flex align-items-center justify-content-center">
     <h2 style="background-color: pink;">List of Miya Huzur Books</h2></div>
     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
       <thead style="background-color: pink;">
         <tr>
           <th>Id</th>
           <th>Book Name</th>
           <th>Download Link</th>
         </tr>
       </thead>
       <c:forEach var="doc" items="${docs }">
       <tbody>
         <tr ${docs}>
           <td style="color:green;">${doc.id}</td>
           <td style="color:green;">${doc.docName}</td>
           <td style="color:green;"><a href="file/downloadFile/+${doc.id}">Download</a></td>
         </tr>
       </tbody>
       </c:forEach>
     </table>
   </div>
   </div>
   </div>
    <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; github.com/shahe-e-razzaq/onlinebookstore 2023</span>
          </div>
        </div>
      </footer>
   </div>
   
  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
                

</body>