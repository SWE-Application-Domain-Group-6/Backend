<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/18/2022
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Create Chart of Accounts</title>
  <link rel="stylesheet" href="ManagerView COA.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  </script>
</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
  <a href="ManagerView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a href="ManagerView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="ManagerView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a href="ManagerView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="ManagerView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>



</div>


<div class="main">
  <form action="action_page.php">

    <img src="ksu books logo.png" alt="ksu books logo">
    <h1>Create Chart of Accounts</h1>



  </form>
  <form name="CreateJEandCOA" method="post" action="ManagerViewUpdateJEandCOA" style="border:1px solid #ccc">
  <div class="emailslots"><br>
    Account Name <br><input type="text" id="accountname" name="accountname" placeholder="  Account Name"><br><br>
    Account Category <br><input type="text" id="accountcategory" name="accountcategory" placeholder="  Account Category"><br><br>
    Account Subcategory <br><input type="text" id="accountsubcategory" name="accountsubcategory" placeholder="  Account Subcategory"><br><br>
    Booking Date (Entry Date) <br><input type="date" name="date_picker"><br><br>

    Notes <br><textarea id="msg" placeholder="Enter message"></textarea><br><br>
    <button class="button" input type="submit" name="updateChartOfAccounts" >UPDATE CHART OF ACCOUNTS</button>

    <p> <a href="ManagerView.jsp" style="color:black" >HOME </a></p>

  </div>
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
