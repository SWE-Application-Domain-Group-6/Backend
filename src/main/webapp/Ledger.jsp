<%--
  Created by IntelliJ IDEA.
  User: Ben
  Date: 11/9/2022
  Time: 1:43 PM
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
    //= Integer.valueOf(request.getParameter(""));
    //String[] entries = j1.getJournalEntries(accid); %>



<img src="ksu books logo.png" alt="ksu books logo">
<h1> <b>Hi, Name</b></h1>
<h2>Accountant</h2>


<!-- The sidebar -->
<div class="sidebar">
    <a class="active" href="AccountantView.html"><i class="fa fa-fw fa-home"></i> Home</a>
    <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
    <a href="AccountantView View Users.html"><i class="fa fa-fw fa fa-users"></i> View Users</a>
    <!--  <a href="AccountantView Assign Roles.html"><i class="fa fa-fw fa-user"></i> Assign Roles</a> -->
    <a href="AccountantView Email.html"><i class="fa fa-fw fa-envelope"></i> Email</a>
    <a href="AccountantView Help.html"><i class="fa fa-question-circle"></i> Help</a>



</div>


<div class="container2">

</div>

<img src="coa gold.png" alt="coagold" class="coagold">

<div class="coachart">
    <br/> <br/>

    <h3>Journal Entries</h3>
    <table>
        <tr>
            <th>Entry</th>
            <th>Date</th>
            <th>Debit</th>
            <th>Credit</th>
        </tr>

        <%
            JournalEntry j1 = new JournalEntry();
            j1.getJournalEntries(accid);
            System.out.println("here");
            for(int i = 0; i < j1.journalEntryList.size(); i++) {
                JournalEntry j2 = j1.journalEntryList.getJournalEntry(i);

        %>
        <tr>
            <td><%=j2.getEntryNum()%></td>
            <td><%=j2.getDate()%></td>
            <td><%=j2.getDebit()%></td>
            <td><%=j2.getCredit()%></td>


        </tr>
        <%
            }
        %>
    </table>
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




<h4> Username</h4>
<h5>ACCOUNTANT</h5>

<img src="user icon.png" alt="user icon" class="usericon">



</body>
</html>
