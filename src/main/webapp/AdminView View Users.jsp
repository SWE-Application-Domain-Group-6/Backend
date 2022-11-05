<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>View Users</title>
  <link rel="stylesheet" href="AdminView View Users.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
  <a href="AdminView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a class="active" href="AdminView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="AdminView Create User.jsp"><i class="fa fa-fw fa fa-user-plus"></i> Create JavaFilesAndServlets.User</a>
  <a href="AdminView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a href="AdminView Update User Info.jsp"><i class="fa fa-fw fas fa-edit"></i> Update JavaFilesAndServlets.User Information</a>
  <a href="AdminView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="AdminView Activate Deactivate User.jsp"><i class="fa fa-fw fa fa-toggle-on"></i> Activate/Deactivate JavaFilesAndServlets.User</a>
  <a href="AdminView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>


</div>


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

  <form action="action_page.php">

    <img src="ksu books logo.png" alt="ksu books logo">
    <h1>Users</h1>



    <br/>

    <table>
      <tr>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Date of Birth</th>
        <th>Address</th>

      </tr>
      <tr>
        <td>username1</td>
        <td>Maria</td>
        <td>Anders</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>

      </tr>
      <tr>
        <td>username2</td>
        <td>Francisco</td>
        <td>Chang</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td>username3</td>
        <td>Roland</td>
        <td>Mendel</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td>username4</td>
        <td>Helen</td>
        <td>Bennett</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td>username5</td>
        <td>Yoshi</td>
        <td>Tannamuri</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td>username6</td>
        <td>Giovanni</td>
        <td>Rovelli</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td>username7</td>
        <td>Giovanna</td>
        <td>Rovelli</td>
        <td>MM/DD/YYYY</td>
        <td>123 Address St</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>

      </tr>

    </table>



  </form>

</div>



</div>


</div>
</div>
<h4> Username</h4>
<h5>ADMINISTRATOR</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>
