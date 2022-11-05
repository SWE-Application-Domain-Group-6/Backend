<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 11/5/2022
  Time: 1:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" href="Login.css" />
</head>
<body style="background-color:#ECECEE;">

<img src="ksu books logo.png" alt="ksu books logo">


<form name="LoginForm" method="post" action="JavaFilesAndServlets.LoginServlet" style="border:1px solid #ccc">
  <div class="container">
    <h1>Login</h1> <br/>
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter username" name="username" required>
    <br/> <br/>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter password" name="psw" required>
    <br/>

    <label>
      <br/>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>

    <div class="clearfix">
      <button type="submit" class="loginbtn">LOGIN</button>

      <p> <a href="#" style="color:black" >Forgot Password? </a></p>
      <!-- link forgot password-->


      <br/>
      <p>New user? <a href="#" style="color:black"><b>SIGNUP</a></p>
      <!-- link to new user page-->

    </div>
  </div>
</form>
</body>
