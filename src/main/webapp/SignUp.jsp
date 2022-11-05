<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>Sign Up</title>

  <link rel="stylesheet" href="SignUp.css" />
</head>

<body style="background-color:#ECECEE;">

<img src="ksu books logo.png" alt="ksu books logo">


<form name="SignUp" method="post" action="SignUpServlet" >
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <br/>

    <label>><b>First name</b></label>
    <input type="text" placeholder="Enter first name" name="firstname" required>
    <br/> <br/>

    <label>><b>Last name</b></label>
    <input type="text" placeholder="Enter last name" name="lastname" required>
    <br/> <br/>

    <label><b>Email</b></label>
    <!-- <!label for="email"><b>Email</b>-->
    <input type="text" placeholder="Enter email" name="email" required>
    <br/> <br/>

    <label><b>Date of birth</b></label>
    <input type="text" placeholder="Enter date of birth" name="dob" required>
    <br/> <br/>

    <label><b>Address</b></label>
    <input type="username" placeholder="Enter address (Street, city, state, zip)" name="address" required>
    <br/> <br/>

    <label><b>Password</b></label>
    <!-- <!label for="psw"><b>Password</b></label> -->
    <input type="password" placeholder="Enter password" name="psw" required>
    <br/> <br/>

    <label><b>Confirm Password</b></label>
    <!-- <label for="psw-repeat"><b>Repeat Password</b></label>-->
    <input type="password" placeholder="Confirm password" name="psw-confirm" required>
    <br/><br/>

    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
    <!-- link terms and conditions-->


    <div class="clearfix">

      <button type="cancel" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">SIGN UP</button>

    </div>

  </div>
</form>


</body>
</html>




