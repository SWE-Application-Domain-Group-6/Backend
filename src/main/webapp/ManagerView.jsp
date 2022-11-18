<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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


        <h3><br>Journal Entries</h3>

        <table>
            <tr>
                <th>Date</th>
                <th>Entry</th>
                <th>Debit</th>
                <th>Credit</th>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>

        </table>

    </div>

    <div class="pendingentries">


        <h3><br>Pending Entries</h3>

        <table>
            <tr>
                <th>Entry ID</th>
                <th>Date Submitted</th>
                <th>Submitted By</th>
                <th>Description</th>
                <th>Accounts Debited</th>
                <th>Accounts Credited</th>
                <th>Attachment</th>
                <th>Entry Actions</th>


            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <button class="approvebtn">Approve</button>
                    <button class="rejectbtn">Reject</button>
                </td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <button class="approvebtn">Approve</button>
                    <button class="rejectbtn">Reject</button>
                </td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <button class="approvebtn">Approve</button>
                    <button class="rejectbtn">Reject</button>
                </td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <button class="approvebtn">Approve</button>
                    <button class="rejectbtn">Reject</button>
                </td>

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
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>

        </table>

    </div>




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
