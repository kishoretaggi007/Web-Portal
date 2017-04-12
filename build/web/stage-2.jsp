<html>
<head> 

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Details</title>

<link rel="stylesheet" type="text/css" href="bootstrap/js/bootstrap.min.js">

<script src="totaljs.js" type="text/javascript" language="javascript"></script>
</head>

<body style="background-color: #e6f2ff">
<!-- <form action="form1.html" method="post"> -->
<form name="myForm" action="stage-2data.jsp" method="post" onsubmit="return validate1()" >

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
	<h1 style="background-color:#7FFFD4;">Registration Form [Stage-2] Junior Trainees- 2016</h1>
	</center></td>
</tr>
</table>

<table cellspacing="1pt" width="950px">
<tr>
	<td><center>
	<h1 style="background-color:#7FFF00;">Registration Details</h1>
	</center></td>
</tr>
</table>

<table cellspacing="8pt" width="950px" style="background-color: #FFFAF0">
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.Date" %>
<%

                        Connection con = null;
                        //int n = 0;//Date d;
                        //=null; 
                        //String em = null;
                        try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");

                            Statement statement = con.createStatement();

                            String s = (String) session.getAttribute("rno");
                            //int n= Integer.parseInt(s);
                            ResultSet resultset
                                    = statement.executeQuery("select * from STAGE_1 where REG_NO='"+s+"'");
                            
                          while(resultset.next()){

%>
<tr>
    <td>Registration No:</td><td><% out.println(s); %></td>
</tr>

<tr>
	<td>Name:</td><td><%=resultset.getString(11)+" "+resultset.getString(12)+" "+resultset.getString(13)%></td>
</tr>

<tr>
	<td>Gender:</td><td><%=resultset.getString(16)%></td>
</tr>

<tr>
	<td>Category:</td><td><%=resultset.getString(2)%></td>
</tr>

<tr>
	<td>Physically Challenged:</td><td><%=resultset.getString(5)%></td>
</tr>

<tr>
	<td>Fee amount:</td><td><%=resultset.getString(10)%></td>
</tr>

</table>

<table cellspacing="1pt" width="950px">
<tr>
	<td><center>
	<h1 style="background-color:#7FFF00;">Personal Detials</h1>
	</center></td>
</tr>
</table>
<%} } catch (Exception e) {
                                out.println(e.getMessage());
                            }%>
<table cellspacing="4pt" width="950px" style="background-color: #FFFAF0">
<tr>
	<td>
		<font color="Red"> *Fields are mandatory </font>
	</td>
</tr>

<tr>
	<td>Father's Name<font color="Red">*</font>:</td>
	<td><input id="fatname" name="fatname" type="text" size='28' placeholder="Father's Name"></td>
</tr>

<tr>
	<td>Address<font color="Red">*</font>:</td>
	<td><input id="addr1" type="text" size='40' name="addr1" placeholder="Address Line 1"></td>
	<tr></tr><td></td><td><input id="addr2" type="text" size='40' name="addr2" placeholder="Address Line 2"></td>
	<tr></tr><td></td><td><input id="addr3" type="text" size='40' name="addr3" placeholder="Address Line 3"></td>
</tr>

<tr>
	<td>City/Mandal<font color="Red">*</font>:</td>
	<td><input id="city" type="text" size='30' name="city" placeholder="City/Mandal"></td>
</tr>

<tr>
	<td>District<font color="Red">*</font>:</td>
	<td><input id="district" type="text" size='30' name="district" placeholder="District Name"></td>
</tr>

<tr>
	<td>Pincode<font color="Red">*</font>:</td>
	<td><input id="pincode" type="text" sixe='10' name="pincode" placeholder="Pincode"></td>
</tr>

<tr>
	<td>State:<font color="Red">*</font></td>
	<td><select id="state" name="state">
		<option selected="selected" value="0">Select a state</option>
		<option value="Andhra Pradesh">Andhra Pradesh</option>
		<option value="Arunachal Pradesh">Arunachal Pradesh</option>
		<option value="Assam">Assam</option>
		<option value="Bihar">Bihar</option>
		<option value="Chattisgarh">Chattisgarh</option>
		<option value="Goa">Goa</option>
		<option value="Gujarat">Gujarat</option>
		<option value="Haryana">Haryana</option>
		<option value="Himachal Pradesh">Himachal Pradesh</option>
		<option value="Jammu and Kashmir">Jammu and Kashmir</option>
		<option value="Jharkhand">Jharkhand</option>
		<option value="Karnataka">Karnataka</option>
		<option value="Kerala">Kerala</option>
		<option value="Madhya Pradesh">Madhya Pradesh</option>
		<option value="Maharashtra">Maharashtra</option>
		<option value="Manipur">Manipur</option>
		<option value="Meghalaya">Meghalaya</option>
		<option value="Mizoram">Mizoram</option>
		<option value="Nagaland">Nagaland</option>
		<option value="Odisha">Odisha</option>
		<option value="Punjab">Punjab</option>
		<option value="Rajasthan">Rajasthan</option>
		<option value="Sikkim">Sikkim</option>
		<option value="Tamil Nadu">Tamil Nadu</option>
		<option value="Telangana">Telangana</option>
		<option value="Tripura">Tripura</option>
		<option value="Uttarakhand">Uttarakhand</option>
		<option value="Uttar Pradesh">Uttar Pradesh</option>
		<option value="West Bengal">West Bengal</option>
		<option value="Delhi">Delhi</option>
		<option value="Andaman and Nicobar Island">Andaman and Nicobar Island</option>
		<option value="Chandiharh">Chandiharh</option>
		<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
		<option value="Daman and Diu">Daman and Diu</option>
		<option value="Lakshadweep">Lakshadweep</option>
		<option value="Puducherry">Puducherry</option>
	</select>
	</td>
</tr>

<tr>
	<td>Nearest Railway Station:</td>
	<td><input id="railway" name="nrs" type="text" size='25' placeholder="Railway Station"></td>
</tr>

<tr>
	<td>Mobile No<font color="Red">*</font>:</td>
	<td><input id="mobile" name="mobile" type="text" size='15' placeholder="Mobile Number" pattern="[0-9]+">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="Blue"> (10 digits only, without leading 0)</font></td>
</tr>

<tr>
	<td>Landline No<font color="Red">*</font>:</td>
	<td>STD Code&nbsp;&nbsp;<input id="std" name="std" type="text" size='10' placeholder="STD code" pattern="[0-9]+">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	Phone No&nbsp;&nbsp;<input id="phone" name="phone" type="text" size='15' placeholder="Phone Number" pattern="[0-9]+"></td>
</tr>

<tr>
	<td>Examination Center<font color="Red">*</font>:</td>
	<td><select id="examcenter" name="exam" style="width:200px">
		<option selected="selected" value="0">Select an examination center</option>
		<option value="Agra">Agra</option>
		<option value="Ahmedabad">Ahmedabad</option>
		<option value="Ajmer">Ajmer</option>
		<option value="Aligarh">Aligarh</option>
		<option value="Allahabad">Allahabad</option>
		<option value="Ambattur">Ambattur</option>
		<option value="Amravati">Amravati</option>
		<option value="Amritsar">Amritsar</option>
		<option value="Asansol">Asansol</option>
		<option value="Aurangabad">Aurangabad</option>
		<option value="Bangalore">Bangalore</option>
		<option value="Bareilly">Bareilly</option>
		<option value="Belgaum">Belgaum</option>
		<option value="Bhilai">Bhilai</option>
		<option value="Bhopal">Bhopal</option>
		<option value="Bhubaneshwar">Bhubaneshwar</option>
		<option value="Bikaner">Bikaner</option>
		<option value="Chandigarh">Chandigarh</option>
		<option value="Chennai">Chennai</option>
		<option value="Coimbatore">Coimbatore</option>
		<option value="Cuttak">Cuttak</option>
		<option value="Dehradun">Dehradun</option>
		<option value="Delhi">Delhi</option>
		<option value="Dhanbad">Dhanbad</option>
		<option value="Durgapur">Durgapur</option>
		<option value="Erode">Erode</option>
		<option value="Faridabad">Faridabad</option>
		<option value="Firozabad">Firozabad</option>
		<option value="Gaya">Gaya</option>
		<option value="Ghaziabad">Ghaziabad</option>
		<option value="Gulbarga">Gulbarga</option>
		<option value="Gorakhpur">Gorakhpur</option>
		<option value="Gurgaon">Gurgaon</option>
		<option value="Guwahati">Guwahati</option>
		<option value="Gwalior">Gwalior</option>
		<option value="Hyderabad">Hyderabad</option>
		<option value="Howrah">Howrah</option>
		<option value="Hubballi-Dharwad">Hubballi-Dharwad</option>
		<option value="Indore">Indore</option>
		<option value="Jabalpur">Jabalpur</option>
		<option value="Jaipur">Jaipur</option>
		<option value="Jalandhar">Jalandhar</option>
		<option value="Jamnagar">Jamnagar</option>
		<option value="Jamshedpur">Jamshedpur</option>
		<option value="Jhansi">Jhansi</option>
		<option value="Jodhpur">Jodhpur</option>
		<option value="Kalyan-Dombivali">Kalyan-Dombivali</option>
		<option value="Kanpur">Kanpur</option>
		<option value="Kochi">Kochi</option>
		<option value="Kolhapur">Kolhapur</option>
		<option value="Kolkata">Kolkata</option>
		<option value="Kota">Kota</option>
		<option value="Loni">Loni</option>
		<option value="Ludhiana">Ludhiana</option>
		<option value="Lucknow">Lucknow</option>
		<option value="Madurai">Madurai</option>
		<option value="Mangalore">Mangalore</option>
		<option value="Meerut">Meerut</option>
		<option value="Mira-Bhayandar">Mira-Bhayandar</option>
		<option value="Moradabad">Moradabad</option>
		<option value="Mumbai">Mumbai</option>
		<option value="Mysore">Mysore</option>
		<option value="Nagpur">Nagpur</option>
		<option value="Nanded">Nanded</option>
		<option value="Nashik">Nashik</option>
		<option value="Navi Mumbai">Navi Mumbai</option>
		<option value="Nellore">Nellore</option>
		<option value="Noida">Noida</option>
		<option value="Patna">Patna</option>
		<option value="Pimpri-Chinchwad">Pimpri-Chinchwad</option>
		<option value="Puducherry">Puducherry</option>
		<option value="Pune">Pune</option>
		<option value="Rajkot">Rajkot</option>
		<option value="Raipur">Raipur</option>
		<option value="Ranchi">Ranchi</option>
		<option value="Rourkela">Rourkela</option>
		<option value="Srinagar">Srinagar</option>
		<option value="Surat">Surat</option>
		<option value="Solapur">Solapur</option>
		<option value="Saharanpur">Saharanpur</option>
		<option value="Salem">Salem</option>
		<option value="Sangli-Miraj & Kupwad">Sangli-Miraj & Kupwad</option>
		<option value="Siliguri">Siliguri</option>
		<option value="Thane">Thane</option>
		<option value="Tirucihrapalli">Tirucihrapalli</option>
		<option value="Tirunelveli">Tirunelveli</option>
		<option value="Tiruppur">Tiruppur</option>
		<option value="Ujjain">Ujjain</option>
		<option value="Ulhasnagar">Ulhasnagar</option>
		<option value="Vadodara">Vadodara</option>
		<option value="Varanasi">Varanasi</option>
		<option value="Vasai-Virar">Vasai-Virar</option>
		<option value="Vijayawada">Vijayawada</option>
		<option value="Visakhapatnam">Visakhapatnam</option>
		<option value="Warangal">Warangal</option>
	</select>
	</td>
</tr>
</table>

<table cellspacing="8pt" width="950px">
<tr>
	<td><center>
	<h1 style="background-color:#7FFF00;">Qualification and Experience Details</h1>
	</center></td>
</tr>
</table>

<table cellspacing="4pt" width="950px" style="background-color: #FFFAF0">

<tr>
	<td>Qualifying Exam -1<font color="Red">*</font>:</td>
	<td><select id="exam1" name="exam1" style="width:165px">
		<option selected="selected" value="0">Select a degree</option>
		<option value="5th Grade">5th Grade</option>
		<option value="SSC">SSC</option>
		<option value="Diploma">Diploma</option>
		<option value="Intermediate">Intermediate</option>
	</select>
	</td>
</tr>

<tr>
	<td>Qualifying Exam -2:</td>
	<td><select id="exam2" name="exam2" style="width:165px">
		<option selected="selected" value="0">Select a degree</option>
		<option value="Under Graduate">Under Graduate</option>
		<option value="Master Graduate">Master Graduate</option>
		<option value="Ph D Graduate">Ph D Graduate</option>
		<option value="ITI">ITI</option>
	</select>
	</td>
</tr>

<tr>
	<td>Select Discipline<font color="Red">*</font>:</td>
	<td><select id="discipline" name="discipline" style="width:165px">
		<option selected="selected" value="0">Select a discipline</option>
		<option value="Mechanical">Mechanical</option>
		<option value="Electrical">Electrical</option>
		<option value="Electronics">Electronics</option>
		<option value="Civil">Civil</option>
		<option value="IT/CSE">IT/CSE</option>
		<option value="Metallurgy">Metallurgy</option>
		<option value="Chemical">Chemical</option>
	</select>
	</td>
</tr>

<tr>
	<td>Select Sub Discipline<font color="Red">*</font>:</td>
	<td><select id="subdiscipline" name="subdiscipline" style="width:165px">
		<option selected="selected" value="0">Select a sub discipline</option>
		<option value="Thermodynamics">Thermodynamics</option>
		<option value="Electromagnestism">Electromagnestism</option>
		<option value="Mechanics">Mechanics</option>
		<option value="Software Developer">Software Developer</option>
		<option value="Coder">Coder</option>
		<option value="System Analyst">System Analyst</option>
		<option value="Thermo">Thermo</option>
	</select>
	</td>
</tr>

<tr>
	<td>Institute<font color="Red">*</font>:</td>
	<td><input id="institute" name="institute" type="text" size="30" placeholder="Institute name">
	&nbsp;&nbsp;&nbsp;<font color="Blue">(For Qualifying Exam -2)</font></td>
</tr>

<tr>
	<td>University<font color="Red">*</font>:</td>
	<td><input id="university" name="university" type="text" size="30" placeholder="University name">
	&nbsp;&nbsp;&nbsp;<font color="Blue">(For Qualifying Exam -2)</font></td>
</tr>

<tr>
	<td>Type of Course<font color="Red">*</font>:</td>
	<td><select id="course" name="course">
		<option selected="selected" value="0">Select Course Type</option>
		<option value="B Sc">B Sc</option>
		<option value="B Tech">B Tech</option>
		<option value="ITI">ITI</option>
		<option value="Diploma">Diploma</option>
		<option value="10th">10th</option>
	</select>&nbsp;&nbsp;&nbsp; <font color="Blue">(For Qualifying Exam -2)</font>
	</td>
</tr>

<tr>
	<td>Are you appearing in the final </br> semester/year of Qualifying Exam -2?<font color="Red">*</font>:</td>
	<td><input type="radio" id="final1" name="appr" value="Yes">Yes
	<input type="radio" checked="true" id="final2" name="appr"  value="No">No
	&nbsp;&nbsp;&nbsp; <font color="Blue"> (For Qualifying Exam -2)</font></td>
</tr>

<tr>
	<td>Month and Year of course </br> completion (Passing/Appearing)<font color="Red">*</font>:</td>
	<td><input id="monthyear" type="month" name="my"> 
	&nbsp;&nbsp;&nbsp; <font color="Blue">(For Qualifying Exam -2)</font> </td>
</tr>

<tr>
	<td>Percentage of marks<font color="Red">*</font>:</td>
	<td><input id="marks" name="marks" type="text" size="15" placeholder="Percentage of marks">
	&nbsp;&nbsp;&nbsp; Eg: 89.00<font color="Blue"> (For Qualifying Exam -2)</font> </td>
</tr>

<tr>
	<td>Do you have any work experience?<font color="Red">*</font>:</td>
	<td><input type="radio" id="experience1" name="work" value="yes">Yes
	<input type="radio" checked="true" id="experience2" name="work" value="no">No</td>
</tr>

<tr>
	<td>Current/Last Company name:</td>
	<td><input id="company" name="company" type="text" size="35" placeholder="Company name"></td>
	<tr><td></td><td>From: <input id="lastfrom" type="month"></td></tr>
	<tr><td></td><td>To:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input id="lastto" type="month"></td></tr>
</tr>

<tr>
	<td>Type of company<font color="Red">*</font>:</td>
	<td><select id="companytype" name="companytype">
		<option selected="selected" value="0">Select Company Type</option>
		<option value="Public">Public</option>
		<option value="Private">Private</option>
		<option value="Unlimited">Unlimited</option>
		<option value="Limited Liability Partnership (LLP)">Limited Liability Partnership (LLP)</option>
		<option value="Partnership">Partnership</option>
		<option value="Sole Propreitorship">Sole Propreitorship</option>
		<option value="Joint Venture">Joint Venture</option>
		<option value="Subsidiary">Subsidiary</option>
	</select>
	</td>
</tr>

</table>

</center>

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