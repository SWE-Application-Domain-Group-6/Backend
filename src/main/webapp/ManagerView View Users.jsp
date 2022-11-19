<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>View Users</title>
  <link rel="stylesheet" href="ManagerView View Users.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
  <a href="ManagerView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a class="active" href="ManagerView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="ManagerView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a href="ManagerView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="ManagerView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>


</div>


<div class="main">
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
      <%
        User u1 = new User();
        u1.getAllUsers();
        for(int i = 0; i < u1.userList.size(); i++) {
          User u2 = u1.userList.getUser(i);
      %>
      <tr>
        <td><%=u2.getEmail()%></td>
        <td><%=u2.getFname()%></td>
        <td><%=u2.getLname()%></td>
        <td><%=u2.getDob()%></td>
        <td><%=u2.getAddress()%></td>

      </tr>
      <%
        }
      %>

    </table>



  </form>

</div>



</div>


</div>
</div>
<h4> Username</h4>
<h5>MANAGER</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>
