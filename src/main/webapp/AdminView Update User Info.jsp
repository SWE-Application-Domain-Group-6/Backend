<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Update User Information</title>
  <link rel="stylesheet" href="AdminView Update User Info.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
  <a href="AdminView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a href="AdminView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="AdminView Create User.jsp"><i class="fa fa-fw fa fa-user-plus"></i> Create JavaFilesAndServlets.User</a>
  <a href="AdminView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a class="active" href="AdminView Update User Info.jsp"><i class="fa fa-fw fas fa-edit"></i> Update JavaFilesAndServlets.User Information</a>
  <a href="AdminView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="AdminView Activate Deactivate User.jsp"><i class="fa fa-fw fa fa-toggle-on"></i> Activate/Deactivate JavaFilesAndServlets.User</a>
  <a href="AdminView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>


</div>


<form action="action_page.php">
  <div class="main">
    <!-- top icon nav -->
    <div class="icon-bar">
      <a href="AdminView Help.jsp"><i class="fa fa-question-circle"></i></a>
      <a href="AdminView Activate Deactivate User.jsp"><i class="fa fa-fw fa fa-toggle-on"></i></a>
      <a href="AdminView Email.jsp"><i class="fa fa-fw fa-envelope"></i></a>
      <a href="AdminView Update User Info.jsp"><i class="fa fa-fw fas fa-edit"></i></a>
      <a href="AdminView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i></a>
      <a href="AdminView Create User.jsp"><i class="fa fa-fw fa fa-user-plus"></i></a>
      <a href="AdminView View Users.jsp"><i class="fa fa-fw fa fa-users"></i></a>
    </div> <br/>
    <input type="date" name="date_picker">

    <img src="ksu books logo.png" alt="ksu books logo">
    <h1>Update User Information</h1>


    <div class="container2">

      <p>Fill in this form to update a user's information.</p>
      <br/>

      <label><b>First name</b></label><br/>
      <input type="text" placeholder="Enter first name" name="firstname" required>
      <br/> <br/>

      <label><b>Last name</b></label><br/>
      <input type="text" placeholder="Enter last name" name="lastname" required>
      <br/> <br/>

      <label><b>Date of Birth</b></label><br/>
      <input type="text" placeholder="Enter date of birth" name="firstname" required>
      <br/> <br/>
      <br/> <br/>

      <label><b>Address</b></label><br/>
      <!-- <!label for="email"><b>Email</b>-->
      <input type="text" placeholder="Enter address" name="street" required>
      <br/> <br/>

      <!-- <label><b>Apartment, suite, etc.</b></label><br/>
       <!-- <!label for="email"><b>Email</b>-->
      <!--      <input type="text" placeholder="Enter apartment, suite, etc." name="street" required>
            <br/> <br/>

            <label><b>City</b></label><br/>
            <!-- <!label for="email"><b>Email</b>-->
      <!--  <input type="text" placeholder="Enter city" name="street" required>
        <br/> <br/>

        <label><b>State</b></label><br/>
        <!-- <!label for="email"><b>Email</b>-->
      <!--
      <input type="text" placeholder="Enter state" name="street" required>
         <br/> <br/>

         <label><b>Zip/Postal Code</b></label><br/>
         <!-- <!label for="email"><b>Email</b>-->
      <!--
       <input type="text" placeholder="Enter zip/postal code" name="street" required>
       <br/> <br/> -->



      <br/><br/>

      <label><b>Password</b></label><br/>
      <input type="password" placeholder="Enter password" name="psw" required>
      <br/> <br/>

      <label><b>Confirm Password</b></label><br/>
      <input type="password" placeholder="Confirm password" name="psw-confirm" required>
      <br/><br/>


      <div class="clearfix">
        <br/>
        <button type="update" class="updatebtn">UPDATE</button> <br/><br/>

      </div>

    </div>
</form>



</div>


</div>
</div>
<h4> Username</h4>
<h5>ADMINISTRATOR</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>
