<html>
	<body>
	<title>Registration Slip Generation
	</title>
	<form  name="regform" method="post">
	<img src="topnewfinal1.png" width="1350px">
	<center>
	<h1 style="color:blue">Registration Successful
	</h1></br></br>
	<h2>
	<a href="pdf.jsp" target="_blank">Click Here</a> To Download Registration Slip</h2>
	</br>
        <%@ page import="java.sql.*" %>
<%  // connect to oracle using thin driver  
    Connection con = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");
        Statement st = con.createStatement();
        String s = (String) session.getAttribute("rno");
        String DOB=(String) session.getAttribute("chkdat");
%>
	<table border="0" class="boldtable" align="center">
<tr>
	<td>Registration No:<%out.print(s);%>
	</td>
</tr>
<tr>
	<td>DOB:<%out.print(DOB);%>
	</td>
</tr>
	</table>
        <% } catch (Exception e) {
                                out.println(e.getMessage());
                            }%>
	<style>
	.boldtable,.boldtable td,.boldtable th
	{
	font-family:palatino linotype;
	font-size:15pt;
	text-align:center-left;
	}
</style>
	<font color="red" size="5px">
	<p>Note:Use Above details to login and Re-print Registration Slip
	</p>
	</center>
        <center>
            <input type="button" value="LOG OUT" onclick="openPage('login.jsp')" class="bigbutton"/>
        </center>
	</body>
 <script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</html>