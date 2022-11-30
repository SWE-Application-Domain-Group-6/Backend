<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JavaFilesAndServlets.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Manager View</title>
  <link rel="stylesheet" href="ManagerView.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<body style="background-color:#ECECEE;">

<img src="ksu books logo.png" alt="ksu books logo">
<h1> <b>Hi, Name</b></h1>
<h2>Manager</h2>


<!-- The sidebar -->
<div class="sidebar">
  <a class="active" href="ManagerView.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <!-- <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> -->
  <a href="ManagerView View Users.jsp"><i class="fa fa-fw fa fa-users"></i> View Users</a>
  <a href="ManagerView Assign Roles.jsp"><i class="fa fa-fw fa-user"></i> Assign Roles</a>
  <a href="ManagerView Email.jsp"><i class="fa fa-fw fa-envelope"></i> Email</a>
  <a href="ManagerView Help.jsp"><i class="fa fa-question-circle"></i> Help</a>



</div>


<div class="main">



  <div class="journalentries">


    <h3><br>All Journal Entries</h3>

    <table>
      <tr>
        <th>Entry Number</th>
        <th>Account ID</th>
        <th>Date</th>
        <th>Account Name</th>
        <th>Debit</th>
        <th>Credit</th>
      </tr>
      <%
        JournalEntry j1 = new JournalEntry();
        j1.getAllJournalEntries();
        for (int i = 0; i < j1.journalEntryList.size(); i++){
          JournalEntry t1 = j1.journalEntryList.getJournalEntry(i);
      %>
      <tr>
        <td><%=t1.getEntryNum()%></td>
        <td><%=t1.getAccountID()%></td>
        <td><%=t1.getDate()%></td>
        <td><%=t1.getAccountName()%></td>
        <td><%=t1.getDebit()%></td>
        <td><%=t1.getCredit()%></td>
        <%
          }
        %>
      </tr>
    </table>

  </div>

  <div class="pendingentries">


    <h3><br>Pending Entries</h3>

    <table>
      <tr>
        <th>Entry Number</th>
        <th>Account ID</th>
        <th>Date</th>
        <th>Account Name</th>
        <th>Debit</th>
        <th>Credit</th>
      </tr>
      <%
        JournalEntry j2 = new JournalEntry();
        j2.getPendingJournalEntries();
        for (int i = 0; i < j2.journalEntryList.size(); i++){
          JournalEntry t2 = j2.journalEntryList.getJournalEntry(i);
          int entryNum1 = t2.getEntryNum();

      %>
      <tr>
        <td><%=t2.getEntryNum()%></td>
        <td><%=t2.getAccountID()%></td>
        <td><%=t2.getDate()%></td>
        <td><%=t2.getAccountName()%></td>
        <td><%=t2.getDebit()%></td>
        <td><%=t2.getCredit()%></td>
        <form name="UpdateJEStatusForm" method="post" action="ManagerViewUpdateStatusServlet" style="border:1px solid #ccc">
        <td>
          <button class="approvebtn" input type="submit" name="approvebtn" value="<%=t2.getEntryNum()%>">Approve</button>
          <button class="rejectbtn" input type="submit" name="rejectbtn" value="<%=t2.getEntryNum()%>">Reject</button>
        </td>
        </form>
      <%
        }
      %>
      </tr>


    </table>

  </div>

  <div class="rejectedentries">


    <h3><br>Rejected Entries</h3>

    <table>
      <tr>
        <th>Entry ID</th>
        <th>Date Submitted</th>
        <th>Submitted By</th>
        <th>Rejected By</th>
        <th>Description</th>
        <th>Accounts Debited</th>
        <th>Accounts Credited</th>
        <th>Attachment</th>
      </tr>
      <%
        JournalEntry j3 = new JournalEntry();
        j3.getRejectedJournalEntries();
        for (int i = 0; i < j3.journalEntryList.size(); i++){
          JournalEntry t3 = j3.journalEntryList.getJournalEntry(i);
      %>
      <tr>
        <td><%=t3.getEntryNum()%></td>
        <td><%=t3.getDate()%></td>
        <td></td>
        <td></td>
        <td></td>
        <td><%=t3.getDebit()%></td>
        <td><%=t3.getCredit()%></td>
        <td>Files To Be Uploaded</td>
        <%
          }
        %>
      </tr>

    </table>

  </div>

  <script>
    function setStatusToApproved(entryNum){

    }
  </script>

  </br>
  <div class="button"
  <button> <a href="ManagerView Journal Entry.jsp" style="color:black"> <BR>CREATE JOURNAL ENTRY</button>
</div>
<br>
<div class="button"
<button> <a href="ManagerView COA.jsp" style="color:black"> <BR>CREATE CHART OF ACCOUNTS</button>
</div>
<br>



<h4> Username</h4>
<h5>MANAGER</h5>

<img src="user icon.png" alt="user icon" class="usericon">









</body>
</html>