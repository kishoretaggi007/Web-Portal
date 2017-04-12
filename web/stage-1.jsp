<html>
<head> 

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Details</title>

<link rel="stylesheet" type="text/css" href="bootstrap/js/bootstrap.min.js">

<script src="totaljs.js" type="text/javascript" language="javascript">

</script>
</head>

<body style="background-color: #e6f2ff" onload="return certicheck()">
    
<form name="myForm" action="stage-1data.jsp" method="post" onsubmit="return validate()" >

<img src="topnewfinal1.png" alt="logo" width=1335 height=250>

<center>
<div class="navbar">
<div class="nav nav-tabs">
    <a class="brand" href="index.jsp">Home</a>
    <a href="contact.html">Contact Us</a>
</div>
</div>
</center>

<center>
<table cellspacing="10pt" width="950px">
<tr>
	<td><center>
	<h1 style="background-color:#7FFFD4;">Registration Form [Stage-1] Junior Trainees- 2016</h1>
	</center></td>
</tr>
</table>

<table cellspacing="1pt" width="950px">
<tr>
	<td><center>
	<h1 style="background-color:#7FFF00;">Basic Details</h1>
	</center></td>
</tr>
</table>

<table cellspacing="8pt" width="950px" style="background-color: #FFFAF0">
<tr>
	<marquee behavior ="scroll" direction="left" width="935px">
		<font color="Red" size='5'> #Enter details as per SSC certificate </font> 
	</marquee>
</tr>
	
<tr>
	<td>
		<font color="Red"> *Fields are mandatory </font>
	</td>
</tr>

<tr>
<td>Category<font color="Red">*</font>:
<td><input type="radio" checked="true" id="gen" value="Gen" name="caste" onclick="certicheck()">Gen
<input type="radio" id="obc" name="caste" value="OBC" onclick="certicheck()">OBC
<input type="radio" id="sc" name="caste" value="SC" onclick="certicheck()">SC
<input type="radio" id="st" name="caste" value="ST" onclick="certicheck()">ST 
</td>
</tr>

<td>
<div id="certi1" style="visibility:hidden">                       <!-- hidden certificate no and issue date-->
Category Certificate No<font color="Red">*</font>:
<input id="certificate" name="certificate" type="text" size="20" placeholder="Category Certificate No"/>
</div>

<td>
<div id="certi2" style="visibility:hidden">                       <!-- hidden certificate no and issue date-->
Issued Date<font color="Red">*</font>:
<input id="certidate" name="certidate" type="date" size="10" placeholder="dd-MMM-yyyy"/>
</div>
</td>


<tr>
<td>Physically Challenged<font color="Red">*</font>:</td>
<td><input type="radio"  id="phc" name="phc"  value="yes"/>Yes
   <input type="radio"  id="phc" name="phc"  value="no"/>No
</td>
<tr>
<td>Domiciled in J&K state<font color="Red">*</font>:</td>
<td><input type="radio"  id="domicille" name="domicile"  value="yes"/>Yes
   <input type="radio"  id="domicille" name="domicile"  value="no"/>No
</td>
</tr>

<tr> 
<td>Minority Status<font color="Red">*</font>:</td>
<td><select id="minority" name="minority" >
<option selected="selected" value="0">Not Applicable</option>
<option value="Muslims">Muslims</option>
<option value="Sikhs">Sikhs</option>
<option value="Christians">Christians</option>
<option value="Buddhists">Buddhists</option>
<option value="Zoroastrians (Parsis)">Zoroastrians (Parsis)</option>
<option value="Jains">Jains</option>
</select>
</td>
</tr>

<tr>
<td>Ex-Servicemen<font color="Red">*</font>:
<td><input type="radio"  id="serve" name="service"  value="yes"/>Yes
   <input type="radio"  id="serve" name="service"  value="no"/>No
</td></tr>

<tr>
<td>Sports Person<font color="Red">*</font>:
<td><input type="radio"  id="sports" name="sports"  value="yes"/>Yes
   <input type="radio"  id="sports" name="sports"  value="no"/>No
</td>
</tr>

<tr>
<td>Application Fee:
<td><input id="fees" name="fees" type="text" size="5" placeholder="Fees" readonly/></td>
</tr>

<tr>
<td>Name<font color="Red">*</font>:</td>
<td><input id="fname" name="fname" type="text" size='14' placeholder="First Name"/>
<input id="mname" name="mname" type="text" size='14' placeholder="Middle Name"/>
<input id="lname" name="lname" type="text" size='14' placeholder="Last Name"/>
</tr>

<tr>
<td>Date of Birth<font color="Red">*</font>:</td>
<td><input id="dob" name="dob" type="date" size="11" placeholder="dd-MMM-yyyy"/></td>
</tr>

<tr>
<td>Nativity<font color="Red">*</font>:</td>
<td><input id="country" name="country" type="text" size="10" placeholder="Country"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Only <font color="Blue"><b>INDIAN</b></font> nationals are eligible
</td>
</tr>

<tr>
<td>Gender<font color="Red">*</font>:
<td><input type="radio" checked="true" id="male" name="gender" value="male">Male
<input type="radio" id="female" name="gender" value="female">Female
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="Blue"><b>FEMALE</b></font>s are eligible only for <font color="blue"><b>Instrumentation Discipline</b></font>
</td>
</tr>

<tr>
<td>Email Address<font color="Red">*</font>:</td>
<td><input id="email1" name="email1" type="email" size="40" placeholder="xxxxxx@gmail.com"/></td>
</tr>

<tr>
<td>Confirm Email Address<font color="Red">*</font>:</td>
<td><input id="email2" name="email2" type="email" size="40" placeholder="xxxxxx@gmail.com"/></td>
</tr>

<br><br>
</center>
</table>
<br><br>
<tr>
<center> 
<input id="Button1" type="submit" value="Submit" style="height:25px;width:70px"/> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input id="Button2" type="Reset" value="Reset" style="height:25px;width:70px"/>
</center>
</tr>

</form>
</body>
</html>