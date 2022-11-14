<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="JavaFilesAndServlets.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Accountant View</title>
  <link rel="stylesheet" href="AccountantView.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<style>
  tr[data-href]{
    cursor: pointer;
  }
</style>

<body>
<body style="background-color:#ECECEE;">

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
<img src="je green.png" alt="jegreen" class="jegreen">



<div class="coachart">
  <br/> <br/>



  <h3>Chart of Accounts</h3>
  <table>
    <tr>
      <th>Account ID</th>
      <th>Account Name</th>
      <th>Account Description</th>
    </tr>

    <%
      Accounts a1 = new Accounts();
      a1.getAllAccounts();
      for(int i = 0; i < a1.accountList.size(); i++) {
        Accounts a2 = a1.accountList.getAccount(i);
        session.setAttribute("a2", a2);
    %>

    <tr data-href="http://localhost:8080/Backend/Ledger.jsp?acctID=<%=a2.getAccountID()%>">
      <td><%=a2.getAccountID()%></td>
      <td><%=a2.getName()%></td>
      <td><%=a2.getDescription()%></td>

    </tr>

    <%
      }
    %>

  </table>

    <script>
      document.addEventListener("DOMContentLoaded", () => {
        const rows = document.querySelectorAll("tr[data-href]");

        rows.forEach(row =>{
          row.addEventListener("click", () => {
            window.location.href = row.dataset.href;
          });
        });
      });
    </script>


</div>


</div>


</div>


</div>

<h4> Username</h4>
<h5>ACCOUNTANT</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html></html>
