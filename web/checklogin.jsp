<%@ page import="java.sql.*" %>
<%  // connect to oracle using thin driver  
    Connection con = null;

    //int n=0;
    String regchk = request.getParameter("reg1");
    String datchk = request.getParameter("dob1");
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");
        Statement st = con.createStatement();
        String s = (String) session.getAttribute("rno");
        ResultSet rs = st.executeQuery("select * from STAGE_1 where REG_NO='" + s + "' and DOB='" + datchk + "'");
        
       
        if (!rs.next()) {
           response.sendRedirect("loginfail.jsp");
//out.print("CREDENTIALS DID NOT MATCH");
        } else {
            
            session.setAttribute("chkdat",datchk);
            response.sendRedirect("stage-2.jsp");
        }

    } catch (Exception e) {
        out.println(e.getMessage());
    }%>