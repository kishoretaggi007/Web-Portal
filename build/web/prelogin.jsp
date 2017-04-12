<html>

    <body>
        <title>Login Details</title>
        <form action="login.jsp" name="regform" method="post">
            <img src="topnewfinal1.png" width=1335 height=250>
            
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

            
	</table></br>
        <center>
                <h1 style="background-color:">Successfully Completed stage-1!!
                </h1></br>
                <!--<h2>
                    <a href="challanpdf.jsp">Click Here</a>To Download Challan</h2>-->
                </br></br>
                <table border="0" class="boldtable" align="center">
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
                        <td>Registration No:<%out.print(s);%>
                        </td>
                    </tr>
                    <tr>
                        <td>DOB:<%=resultset.getString(14)%>
                        </td>
                    </tr>
                    <tr>
                        <td>Email:<%=resultset.getString(17)%>
                        </td>
                    </tr>
                    </table>
                
                <%} } catch (Exception e) {
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
                <p>Note:Above details should be used to login and Re-print challan
                </p>
                
                 </center>
                
                <table>
 <tr>
<center> 
<input id="Button1" type="submit" value="Click here to login" style="height:25px;width:170px"/> 
</center>
 </tr> </table>

           
    </body>
</html>