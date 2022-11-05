<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Administrator View</title>
  <link rel="stylesheet" href="AdminView.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">
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
  <h1> <b>Hi, Name</b></h1>
  <h2>Administrator</h2>

  <!-- The sidebar -->
  <div class="sidebar">
    <a class="active" href="AdminView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
    <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
    <a href="AdminView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
    <a href="AdminView Create User.jsp"><i class="fa fa-fw fa fa-user-plus"></i> Create User</a>
    <a href="AdminView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
    <a href="AdminView Update User Info.jsp"><i class="fa fa-fw fas fa-edit"></i> Update User Information</a>
    <a href="AdminView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
    <a href="AdminView Activate Deactivate User.jsp"><i class="fa fa-fw fa fa-toggle-on"></i> Activate/Deactivate User</a>
    <a href="AdminView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>

  </div>




  <!--
  <div class="container">
     <br/> <br/> <br/> <br/> <br/> <br/> <br/> <br/> <br/> <br/>
     <label for="createuser"><b>+ Create User</b></label>
     <br/> <br/> <br/>

     <label for="assignroles"><b>+ Assign Roles</b></label>
     <br/> <br/><br/>

     <label for="composeemail"><b>+ Compose Email</b></label>
     <br/> <br/><br/>

     <label for="updateinformation"><b>+ Update Information</b></label>
     <br/> <br/><br/>

     <label for="activatedeactivateuser"><b>+ Activate/Deactivate User</b></label>




  </div>
  -->
  <div class="container2">

  </div>

  <img src="Group 7.png" alt="group7" class="blue">
  <img src="Group 5.png" alt="group5" class="red">
  <img src="Group 6.png" alt="group6" class="green">
  <img src="Group 4.png" alt="group4" class="pink">
  <img src="Group 13.png" alt="group13" class="gold">
  <img src="Group 14.png" alt="group14" class="purple">


  <div class="blue2">
    <br/> <br/>

    <h3>Create User</h3>



    <div class="clearfix">

      <a href="AdminView Create User.jsp"><button>Create User</button></a>

    </div>
  </div>

  <div class="red2">
    <br/> <br/>

    <h3>Assign Roles</h3>

    <br/>


    <label><b>Username</b></label><br/>
    <input type="username" placeholder="Enter username" name="psw" required>
    <br/> <br/>

    <label><b>New Role</b></label><br/>

    <select name="newrole" id="newrole">
      <option value="administrator">Administrator</option>
      <option value="manager">Manager</option>
      <option value="regular">Regular</option>
    </select>
    <br/>    <br/>




    <div class="clearfix">
      <button type="submit" class="submitbtn">SUBMIT</button>


    </div>
  </div>

  <div class="green2">
    <br/> <br/>
    <h3>Update Information</h3>

    <br/>
    <label><b>Username</b></label><br/>
    <input type="username" placeholder="Enter username" name="usn" required>
    <br/> <br/>

    <label><b>New Information</b></label><br/>
    <input type="newinfo" placeholder="Enter new information" name="ninfo" required>
    <br/> <br/>

    <div class="clearfix">
      <button type="submit" class="submitbtn">SUBMIT</button>


    </div>
  </div>

  <div class="pink2">
    <br/> <br/>
    <h3>Activate/Deactivate User</h3>

    <br/>
    <label><b>Username</b></label><br/>
    <input type="username" placeholder="Enter username" name="usn" required>
    <br/> <br/>


    <!-- Rounded switch -->
    <label class="switch">
      <input type="checkbox">
      <span class="slider round"></span>
    </label>

  </div>

  <div class="gold2">
    <br/> <br/>
    <h3>Compose Email</h3>

  </div>

  <div class="purple2">
    <br/> <br/>
    <h3>View Users</h3>
    <p>Username1</p>
    <p>Username2</p>
    <p>Username3</p>


  </div>


</div>
</div>

<h4> Username</h4>
<h5>ADMINISTRATOR</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>
