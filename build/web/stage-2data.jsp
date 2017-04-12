<%@ page import="java.sql.*" %>  
        <%  // connect to oracle using thin driver  
            Connection con = null;            
            String ftname= request.getParameter("fatname");
            String add1= request.getParameter("addr1");
            String add2 = request.getParameter("addr2");
            String add3 = request.getParameter("addr3");
            String city = request.getParameter("city");
            String disc = request.getParameter("district");
            String pin = request.getParameter("pincode");
            String state = request.getParameter("state");
            String nrs = request.getParameter("nrs");
            String mobn = request.getParameter("mobile");
            String code = request.getParameter("std");
            String lndn = request.getParameter("phone");
            String examc= request.getParameter("exam");
            String qexamo = request.getParameter("exam1");
            String qexamt = request.getParameter("exam2");
            String discp = request.getParameter("discipline");
            String subdiscp = request.getParameter("subdiscipline");
            String inst = request.getParameter("institute");
            String uni = request.getParameter("university");
            String typec = request.getParameter("course");
            String appear = request.getParameter("appr");
            String coucomp = request.getParameter("my");
            String marks = request.getParameter("marks");
            String workexp = request.getParameter("work");
            String compn = request.getParameter("company");
            String compty = request.getParameter("companytype");
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");
               //Statement stmt = con.createStatement();
               String s = (String) session.getAttribute("rno");
               /*ResultSet rs = stmt.executeQuery("SELECT * from STAGE_1 where REG_NO='"+s+"'");
                 stmt.close();
                 rs.close();*/
                PreparedStatement ps = con.prepareStatement( "update STAGE_1 set FATHERS_NAME=?,ADDRESS_1=?,ADDRESS_2=?,ADDRESS_3=?,CITY=?,DISTRICT=?,PINCODE=?,STATE=?,NEAREST_RAILWAY_STATION=?,MOBILE_NO=?,STD_CODE=?,LANDLINE_NO=?,EXAMINATION_CENTER=?,QUALIFYING_EXAM_1=?,QUALIFYING_EXAM_2=?,DISCIPLINE=?,SUB_DISCIPLINE=?,INSTITUTE=?,UNIVERSITY=?,TYPE_OF_COURSE=?,APPEARANCE=?,YEAR_OF_PASSING=?,PERCENTAGE=?,EXPERIENCE=?,COMPANY_NAME=?,COMPANY_TYPE=? where REG_NO='"+s+"'"); 
                 ps.setString(1,ftname);
                 ps.setString(2,add1);
                 ps.setString(3,add2);
                 ps.setString(4,add3);
                 ps.setString(5,city);   
                 ps.setString(6,disc);
                 ps.setString(7,pin);
                 ps.setString(8,state);   
                 ps.setString(9,nrs);       
                 ps.setString(10,mobn);       
                 ps.setString(11,code);       
                 ps.setString(12,lndn);       
                 ps.setString(13,examc);       
                 ps.setString(14,qexamo);       
                 ps.setString(15,qexamt); 
                 ps.setString(16,discp);
                 ps.setString(17,subdiscp);
                 ps.setString(18,inst); 
                 ps.setString(19,uni);
                 ps.setString(20,typec);
                 ps.setString(21,appear);
                 ps.setString(22,coucomp);
                 ps.setString(23,marks);
                 ps.setString(24,workexp);
                 ps.setString(25,compn);
                 ps.setString(26,compty);
                 int i=ps.executeUpdate();
                 //out.println("i");
                 ps.close();
                con.close();
            } catch (Exception e) {out.println(e.getMessage());
            }
           
           
          response.sendRedirect("regslipgen.jsp");
        %> 
