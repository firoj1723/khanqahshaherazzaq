<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link href=”https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css” rel=”stylesheet” integrity=”sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU” crossorigin=”anonymous”>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
 integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" >
<meta charset="ISO-8859-1">
<title>khanqah shahe razzaq</title>
 <style type="text/css">
.fa-instagram {  
  background: #125688;  
  color: red; 
  width: 100%; 
  font-size: 3em; 
  
}  

.fa-facebook {  
  background: #125688;  
  color: blue; 
  width: 100%; 
  height: 240;
  font-size: 3em; 
} 

.fa-youtube {  
  background: #125688; 
  width: 100%; 
  color: red;  
  font-size: 3em; 
} 
/* ../img/hello.jp
 */
</style>
<style>



footer {
    clear: both;
    position: relative;
    height: 200px;
    margin-top: 162px;
}</style>
<style>
body {
  /* background-color: lightblue; */ 
  background-image: url("https://images.unsplash.com/photo-1596367407372-96cb88503db6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80");   
}
/* http://www.shah-e-razzaq.com/images/gallery/c88d12.jpg */
/*  https://wallpapercave.com/wp/wp8136322.jpg*/

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
</style>
<style>
h4 {
text-align: right;
  background-color: white;
  border-bottom: medium;
}
</style>
<style>
table, td, th {
  border: 1px solid black;
}

table {
  border-collapse: collapse;
  width: 100%;
}

th {
  text-align: center;
}

 .notification-list {
            list-style: none;
            padding: 0;
        }

        .notification-item {
            background-color: #fff;
            border: 1px solid #ddd;
            margin: 10px;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
</style> 
</head>
<body>
<h2>KHANQAH SHAHE RAZZAQ</h2>

  
 <div class="centerdiv">
 
 </div>

<%--  <div class="container">
        <h1> Notifications</h1>
        <div class="notification-popup">
            <ul id="notification-list">
                <c:forEach items="${notifications}" var="notification">
                    <li>${notification.message}</li>
                </c:forEach>
            </ul>
           <!--  <form id="notification-form">
                <input type="text" id="notification-input" placeholder="Enter a new notification">
                <button type="submit">Add Notification</button>
            </form> -->
        </div>
    </div>
    
     <script>
        $(document).ready(function () {
            // Submit the form via AJAX to add a new notification
            $('#notification-form').submit(function (e) {
                e.preventDefault();
                var message = $('#notification-input').val();
                $.ajax({
                    type: "POST",
                    url: "/add-notification",
                    data: { message: message },
                    success: function (response) {
                        $('#notification-input').val(''); // Clear the input field
                        $('#notification-list').append('<li>' + message + '</li>'); // Add the new notification to the list
                    },
                    error: function (error) {
                        // Handle error, if any
                    }
                });
            });
        });
    </script> --%>


<!-- <ul><li><div>
  <a href="https://www.instagram.com/khanqah_shahe_razzaq/"><div class="fa fa-instagram"></div>
  </a>
</div></li>
<li><div>
  <a href="https://www.facebook.com/khanqah.shaherazzaq?mibextid=ZbWKwL"><div class="fa fa-facebook"></div>
  </a>
</div></li>

<li><div>
  <a href="https://www.youtube.com/@khanqahshaherazzaqofficial"><div class="fa fa-youtube"></div>
  </a>
</div></li>

<li>
<div>
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3582.9724711736612!2d75.19886257453699!3d26.099817294552917!
 2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396eb9d6c89f614d%3A0x886bbc0d51e422f9!2zS2hhbnFhaCBTaGFoZSBSYXp6YXEg4KWZ4KS-4KSo4KWY4KS-4KS5IOCktuCkvuCkueClhyDgpLDgpZvgpY3gpZvgpL7gpZg!5e0!3m2!1sen!2sin!4v1685083008931!5m2!1sen!2sin"><div class="fa fa-youtube"></div></iframe>
</div>
</li>
</ul> -->


 <table border="1" class="center">

<tr align="center" height="15" >
<th><div>
  <a href="https://www.instagram.com/khanqah_shahe_razzaq/"><div class="fa fa-instagram"></div>
  </a>
</div></th>

<th><div>
  <a href="https://www.facebook.com/khanqah.shaherazzaq?mibextid=ZbWKwL"><div class="fa fa-facebook"></div>
  </a>
</div></th>
<th><div>
  <a href="https://www.youtube.com/@khanqahshaherazzaqofficial"><div class="fa fa-youtube"></div>
  </a>
</div></th>

<!-- <th>
<div>
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3582.9724711736612!2d75.19886257453699!3d26.099817294552917!
 2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396eb9d6c89f614d%3A0x886bbc0d51e422f9!2zS2hhbnFhaCBTaGFoZSBSYXp6YXEg4KWZ4KS-4KSo4KWY4KS-4KS5IOCktuCkvuCkueClhyDgpLDgpZvgpY3gpZvgpL7gpZg!5e0!3m2!1sen!2sin!4v1685083008931!5m2!1sen!2sin"><div class="fa fa-youtube"></div></iframe>
</div>
</th> -->
</tr>
</table> 
 
<!-- <footer>
<a href="about">About us</a><br>
<a href="contact">Contact us</a><br>
<a href="review">Feedback</a><br>
</footer> -->

<marquee behavior="slide" direction="left" scrollamount="20" loop="1000" vspace=25>
<img src="http://www.shah-e-razzaq.com/images/gallery/c88d12.jpg" alt="Roza" title="Roza" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/48ce28.jpg" alt="Miya1" title="Miya1" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/7b1405.jpg" alt="DadaMiya1" title="DadaMiya1" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/f3f01d.jpg" alt="DadaMiya2" title="DadaMiya2" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/af4bd1.jpg" alt="Miya2" title="Miya2" width="150" height="200">
<img src="http://www.shah-e-razzaq.com/images/gallery/4f8dbd.jpg" alt="Miya2" title="Miya2" width="150" height="200">
</marquee>
<footer>
<!-- <h3>Mobile: +91-9829699009 E-mail : mkmansoori@gmail.com</h3> -->
<h3><div class="padding">
    <div class="main">
      <div class="wrapper">
        <div class="fleft footer-text"> Copyright &copy; <a href="#">Shah-e-razzaq</a> All Rights Reserved <br> <strong> Developed by <a target="_blank" href="https://www.instagram.com/skkikhanfk/">F2F Developers</a></strong>
          <!-- {%FOOTER_LINK} -->
        </div>
      
      </div>
    </div>
  </div></h3>
</footer>

<!--  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> -->
</body>
</html> 