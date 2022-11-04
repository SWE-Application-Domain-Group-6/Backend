<%--
  Created by IntelliJ IDEA.
  JavaFilesAndServlets.User: ander
  Date: 11/1/2022
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="JavaFilesAndServlets.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Manager View</title>
  <link rel="stylesheet" href="ManagerView.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">

<img src="ksu books logo.png" alt="ksu books logo">
<h1> <b>Hi, Name</b></h1>
<h2>Manager</h2>


<!-- The sidebar -->
<div class="sidebar">
  <a class="active" href="ManagerView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a href="ManagerView View Users.html"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="ManagerView Assign Roles.html"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a href="ManagerView Email.html"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="ManagerView Help.html"><i class="fa fa-question-circle"></i> Help</a>



</div>


<div class="container2">

</div>

<img src="coa gold.png" alt="coagold" class="coagold">
<img src="je green.png" alt="jegreen" class="jegreen">



<div class="coachart">
  <br/> <br/>

  <h3>Chart of Accounts</h3>
  <table>
    <tr>
      <th>Account #</th>
      <th>Account Name</th>
      <th>Account Category</th>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>

    </tr>

  </table>



</div>

<div class="journalentries">
  <br/> <br/>

  <h3>Journal Entries</h3>
  <%
      JournalEntry j1 = new JournalEntry();

  %>
  <table>
    <tr>
      <th>Date</th>
      <th>Entry</th>
    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>
    <tr>
      <td></td>
      <td></td>

    </tr>

  </table>

</div>
</div>


</div>


</div>

<h4> Username</h4>
<h5>MANAGER</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>
