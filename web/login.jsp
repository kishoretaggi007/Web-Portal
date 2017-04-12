<html>
	<head>
	<title>Home page
	</title>
	<script src="reg.js" type="text/javascript"></script>
	</head>
	<body text-transform="UPPERCASE" style="background-color:#e6f2ff">
	<form action="checklogin.jsp" name="chkform">
	<img src="topnewfinal1.png" width=1335 height=250>
	<center>
	<i>
	
	<h1 style= "background-color:#7FFFD4;">Recruitment of Junior Trainees-2016</h1>
	
	<h1 style="background-color:#7FFF00;">Online Registration Form</br></h1>
	</i>
	<font size="5">		
        <marquee direction ="right" scrollamount="4" behavior="alternate" border="2pt"><font color="red">Payment Of challan should be done at SBI branches only</font></marquee>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	</br></br>
<table  border="8" class="boldtable" size="7" align="left" color="blue" width="300" height="50%" style="background-color:FFFF00;">

<tr>
	<td><a href="index.jsp">Home</td>
</tr>

<tr>
	<td><a href="stage-1.jsp">Online Registration</a></td>
</tr>


<tr>
	<td><a href="login.jsp">Stage-2 Login</a></td>	
</tr>

<tr>
	<td><a href="login1n.jsp">Registration Slip</a></td>
</tr>


<tr>
	<td><a href="contact.html">Contact Us</a></td>
</tr>

</table>
        </br>
	</center>
<style>
	.boldtable,.boldtable td,.boldtable th
	{
	font-family:palatino linotype;
	font-size:15pt;
	color:blue;
	text-align:center-left;
	}
</style>
<center>

	<td>
	<font size="6px" color="black">
        <p style="background-color:#e6f2ff"><font color="blue">To enter your Stage-2 details please login</font></p>
	</font>
	</td>
        <%@page import="java.sql.*"%>
        <%String s=(String) session.getAttribute("rno");%>
<table style="font-size:15pt" cellspacing="30pt">
<tr>
	<td>Registration No:
	</td>
	<td>
	<input id="no1" type="text" size="30" name="reg1" placeholder="Enter Registration No"required="true">
</tr>
<tr>
	<td>DOB:
	</td>
	<td>
	<input type="text" id="dob" name="dob1" required="true" size="30"><font color="blue" placeholder="dd-mm-yy"/>[YYYY-MM-DD]
</tr>
</table>
<center>
<tr>
	<td></td><td>
	<td>
	<input type="Submit" value="Submit" class="bigbutton"> 
	<input type="reset" value="Clear" class="bigbutton">
	</td></td>
	</font>
</tr>
	</center>
	</br></br>
	<center>
<table cellspacing="10px">
<tr>
    <td></td></br>
    <td><font color="Blue" size="5" style="background-color:#7FFF00 ">&copy; 2016, Rasthriya Ispat Nigam Limited</font></td>
</tr>
</table>
</center>

</center>
</html>