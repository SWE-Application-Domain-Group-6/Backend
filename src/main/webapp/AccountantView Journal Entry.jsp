<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Create Journal Entry</title>
    <link rel="stylesheet" href="AccountantView Journal Entry.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </script>
</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
    <a href="AccountantView.html"><i class="fa fa-fw fa-home"></i> Home</a>
    <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
    <a href="AccountantView View Users.html"><i class="fa fa-fw fa fa-users"></i> View Users</a>
    <!--  <a href="AccountantView Assign Roles.html"><i class="fa fa-fw fa-user"></i> Assign Roles</a> -->
    <a href="AccountantView Email.html"><i class="fa fa-fw fa-envelope"></i> Email</a>
    <a href="AccountantView Help.html"><i class="fa fa-question-circle"></i> Help</a>


</div>


<div class="main">
    <form action="action_page.php">

        <img src="ksu books logo.png" alt="ksu books logo">
        <h1>Create Journal Entry</h1>



    </form>
    <div class="emailslots"><br>
        Debit Amount <br><input type="text" id="debit" placeholder="  Debit Amount"><br><br>
        Credit Amount <br><input type="text" id="credit" placeholder="  Credit Amount"><br><br>
        Booking Date (Entry Date) <br><input type="date" name="date_picker"><br><br>
        Notes <br><textarea id="msg" placeholder="Enter message"></textarea><br><br>
        <button class="button" onclick="" >LOG JOURNAL ENTRY</button>

        <p> <a href="AccountantView.html" style="color:black" >HOME </a></p>

    </div>

</div>



</div>


</div>
</div>
<h4> Username</h4>
<h5>ACCOUNTANT</h5>
<img src="user icon.png" alt="user icon" class="usericon">










</body>
</html>