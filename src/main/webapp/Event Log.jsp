<%--
  Created by IntelliJ IDEA.
  User: Peoples
  Date: 11/17/2022
  Time: 1:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>View Users</title>
  <link rel="stylesheet" href="AccountantView.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body style="background-color:#ECECEE;">
<%@ page import="JavaFilesAndServlets.*"%>


<%
  //need to get accid of selected account from frontend
  //Accounts a2;
  //session = request.getSession();
  //a2 = (Accounts)session.getAttribute("a2");
  int accid = Integer.parseInt(request.getParameter("acctID"));
  //Integer.parseInt(request.getParameter("acctID"));
  //= Integer.valueOf(request.getParameter(""));
  //String[] entries = j1.getJournalEntries(accid); %>



<img src="ksu books logo.png" alt="ksu books logo">
<h1> <b>Hi, Name</b></h1>
<h2>Accountant</h2>


<!-- The sidebar -->
<div class="sidebar">
  <a class="active" href="AccountantView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a href="AccountantView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <!--  <a href="AccountantView Assign Roles.html"><i class="fa fa-fw fa-user"></i> Assign Roles</a> -->
  <a href="AccountantView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="AccountantView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>



</div>


<div class="container2">

</div>

<img src="coa gold.png" alt="coagold" class="coagold">

<div class="coachart">
  <br/> <br/>

  <h3>Event Log</h3>
  <table>
    <tr>
      <th>AccountID</th>
      <th>ChangeID</th>
      <th>Attribute</th>
      <th>Value</th>
      <th>User</th>
    </tr>

    <%
      Event e1 = new Event();
      e1.getAllEvents(accid);
      for(int i = 0; i < e1.eventList.size(); i++) {
        Event e2 = e1.eventList.getEvent(i);

    %>
    <tr>
      <td><%=e2.getAccountID()%></td>
      <td><%=e2.getChangeID()%></td>
      <td><%=e2.getAttribute()%></td>
      <td><%=e2.getValue()%></td>
      <td><%=e2.getUser()%></td>

    </tr>
    <%
      }
    %>
  </table>

</div>




<h4> Username</h4>
<h5>ACCOUNTANT</h5>

<img src="user icon.png" alt="user icon" class="usericon">




</body>
</html>
