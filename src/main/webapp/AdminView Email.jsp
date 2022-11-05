<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
    <link rel="stylesheet" href="AdminView Email.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <script src="script.js"></script>
    <script type="text/javascript"
            src="https://cdn.jsdelivr.net/npm/@emailjs/browser@3/dist/email.min.js">
    </script>
    <script type="text/javascript">
   (function(){
      emailjs.init("9knD2QPsCdiRYZaDc");


   })();
</script>
</head>
<body>
<body style="background-color:#ECECEE;">


<!-- The sidebar -->
<div class="sidebar">
    <a href="AdminView.html"><i class="fa fa-fw fa-home"></i> Home</a>
    <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
    <a href="AdminView View Users.html"><i class="fa fa-fw fa fa-users"></i> View Users</a>
    <a href="AdminView Create User.html"><i class="fa fa-fw fa fa-user-plus"></i> Create User</a>
    <a href="AdminView Assign Roles.html"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
    <a href="AdminView Update User Info.html"><i class="fa fa-fw fas fa-edit"></i> Update User Information</a>
    <a class="active" href="AdminView Email.html"><i class="fa fa-fw fa-envelope"></i> Email</a>
    <a href="AdminView Activate Deactivate User.html"><i class="fa fa-fw fa fa-toggle-on"></i> Activate/Deactivate User</a>
    <a href="AdminView Help.html"><i class="fa fa-question-circle"></i> Help</a>


</div>


<div class="main">
    <!-- top icon nav -->
    <div class="icon-bar">
        <a href="AdminView Help.html"><i class="fa fa-question-circle"></i></a>
        <a href="AdminView Activate Deactivate User.html"><i class="fa fa-fw fa fa-toggle-on"></i></a>
        <a href="AdminView Email.html"><i class="fa fa-fw fa-envelope"></i></a>
        <a href="AdminView Update User Info.html"><i class="fa fa-fw fas fa-edit"></i></a>
        <a href="AdminView Assign Roles.html"><i class="fa fa-fw fa-user"></i></a>
        <a href="AdminView Create User.html"><i class="fa fa-fw fa fa-user-plus"></i></a>
        <a href="AdminView View Users.html"><i class="fa fa-fw fa fa-users"></i></a>
    </div> <br/>
    <input type="date" name="date_picker">

    <form action="action_page.php">

    <img src="ksu books logo.png" alt="ksu books logo">
    <h1>Send An Email</h1>



    </form>

    <div class="emailslots"><br>
    <input type="text" id="toName" placeholder="  To">
    <input type="text" id="fromName" placeholder="  From"><br><br>
    <textarea id="msg" placeholder="Enter message"></textarea><br><br>
    <button class="button" onclick="sendMail()" >SEND EMAIL</button>
    </div>

    </div>



</div>


</div>
</div>
<h4> Username</h4>
<h5>ADMINISTRATOR</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>