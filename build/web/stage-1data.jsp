<%@ page import="java.sql.*" %>  
        <%  // connect to oracle using thin driver  
            Connection con = null;            
            
            
            int n=0;
            //String post= request.getParameter("post");
            String cat= request.getParameter("caste");
            String cf= request.getParameter("certificate");
            String cd= request.getParameter("certidate");
            String ph = request.getParameter("phc");
            String djk = request.getParameter("domicile");
            String ms = request.getParameter("minority");
            String es = request.getParameter("service");
            String sp = request.getParameter("sports");
            String fee = request.getParameter("fees");
            //String nation = request.getParameter("nat");
            String fn = request.getParameter("fname");
            String mn = request.getParameter("mname");
            String ln = request.getParameter("lname");
            String date = request.getParameter("dob");
            String nation = request.getParameter("country");
            String gen = request.getParameter("gender");
            String email = request.getParameter("email1");
            //String certi = request.getParameter("certi");
            //String percd = request.getParameter("certiw");
            //String date = request.getParameter("dob");
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");
               Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT MAX(REG_NO) from STAGE_1");
               
               
                 while(rs.next())
                 {
                      n=rs.getInt(1);
                      
                 }
                 if(n!=0)
                 {
                     n++;
                 }
                 else if(n==0)
                 {
                    n=1; 
                 }
            
                     
                     
                 stmt.close();
                 rs.close();
                 PreparedStatement ps = con.prepareStatement( "insert into STAGE_1(REG_NO,CATEGORY,CATEGORY_CERTI_NO,CATEGORY_ISSUE_DATE,PHC,DOMICILE_JK,MINORITY,EX_SERVICEMAN,SPORTSPERSON,FEE,FIRST_NAME,MIDDLE_NAME,LAST_NAME,DOB,NATIVITY,GENDER,EMAIL) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
                 ps.setInt(1,n);
                 out.println(n);
                 //ps.setString(2,post);
                 //out.println(post);
                 ps.setString(2,cat);
                 //out.println(cat);
                 ps.setString(5,ph);
                 //out.println(ph);
                 ps.setString(6,djk);
                 //out.println(djk);
                 ps.setString(7,ms);
                 //out.println(ms);
                 ps.setString(8,es);
                 //out.println(es);0
                 
                 ps.setString(9,sp);
                 //out.prntln(sp);
                 ps.setString(10,fee);
                 //out.println(fee);
                 ps.setString(15,nation);
                 //out.println(nation);
                 ps.setString(11,fn); 
                 //out.println(fn);
                 ps.setString(12,mn);
                 ps.setString(13,ln);
                 //out.println(ln);
                 ps.setString(16,gen); 
                 //out.println(gen);
                 ps.setString(17,email);
                 //out.println(email);
                 //certi=" ";
                 ps.setString(3,cf);
                 //out.println(certi);
                 ps.setString(4,cd);
                 //out.println(percd);
                 ps.setString(14,date); 
                 //out.println(date);
                //out.println(ps);
                 
                int i=ps.executeUpdate();
                 
                 ps.close();
                con.close();
            } catch (Exception e) {out.println(e.getMessage());
            }
           session.setAttribute("rno",String.valueOf(n));
           
   
           
           
          response.sendRedirect("prelogin.jsp");
        %> 
