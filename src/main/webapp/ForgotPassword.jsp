<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">

  <title>Forgot Password</title>
  <link rel="stylesheet" href="ForgotPassword.css" />
</head>
<body style="background-color:#ECECEE;">

<img src="ksu books logo.png" alt="ksu books logo">


<form name="ForgotPasswordForm" method="post" action="ForgotPasswordServlet" style="border:1px solid #ccc">
  <div class="container">
    <h1>Forgot Your Password?</h1> <br/>

    <label for="enteremail"><b>Enter email address</b></label>
    <input type="text" placeholder="Enter email address" name="enteremail" required>
    <br/> <br/>

    <label for="enterusername"><b>Enter username</b></label>
    <input type="text" placeholder="Enter username" name="enterusername" required>
    <br/> <br/>

    <label for="securityquestion"><b>Security Question: <br/>Lorem ipsum?</b></label>
    <input type="text" placeholder="Enter answer to security question" name="securityquestion" required>
    <br/> <br/> <br/>



    <div class="clearfix">
      <button type="resetpwd" class="resetpwdbtn">RESET PASSWORD</button>


      <br/>
      <p>Have an account? <a href="#" style="color:black"><b>BACK TO LOGIN</a></p>
      <!-- link back to login-->

    </div>
  </div>
</form>
</body>
