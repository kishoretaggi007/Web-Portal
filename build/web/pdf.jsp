<%@page import="java.sql.*,java.util.Date,java.text.DateFormat,java.text.SimpleDateFormat,com.itextpdf.text.*,com.itextpdf.text.Image,com.itextpdf.text.pdf.PdfWriter,java.io.FileOutputStream,java.io.FileNotFoundException,com.itextpdf.text.Paragraph,java.io.* "%>
<%


//String mysub = "Sub : Monthly Content Status for Dept. Portal - " ;
//String mainbody = "The  hosted at Intranet Portal www.vspsite.org is being maintained by Department. The content of the aforesaid portal has been checked and hereby certified as accurate, correct and latest as on  ";
%>
<%
  
 Document document = new Document();

        try {
             response.setContentType("application/pdf");
           // PdfWriter.getInstance(document,new FileOutputStream("HelloWorld.pdf"));
             Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aditya", "aditya15");
       String s=(String) session.getAttribute("rno");
       int reg_no=Integer.parseInt(s);
        
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("select * from STAGE_1 where REG_NO="+reg_no+"");
PdfWriter.getInstance(document,response.getOutputStream());
            
            //out.println(document);
            document.open();
           while(rs.next()){ 
           String top ="REGISTRATION SLIP FOR JUNIOR TRAINEES";
           Paragraph heading = new Paragraph(top);
           
           heading.setAlignment(Element.ALIGN_CENTER);
            document.add(heading);
            String to ="  ";
           Paragraph headi = new Paragraph(to);
           
           headi.setAlignment(Element.ALIGN_CENTER);
            document.add(headi);
            
             String mid ="RINL,VSP";
           Paragraph headin = new Paragraph(mid);
           
           headin.setAlignment(Element.ALIGN_CENTER);
            document.add(headin);
             String t ="  ";
           Paragraph head = new Paragraph(t);
           
           headi.setAlignment(Element.ALIGN_CENTER);
            document.add(head);
             String e ="  ";
           Paragraph hea = new Paragraph(e);
           
           hea.setAlignment(Element.ALIGN_CENTER);
            document.add(hea);
        
           //Image image1 = Image.getInstance("photos/excelpics.jpg");
           // document.add(image1);
            
            
            document.add(new Paragraph("Reg_No.                        :                        " + rs.getString(1) ));
            document.add(new Paragraph("Name                           :                        " + rs.getString(11)+" "+rs.getString(12)+" "+rs.getString(13) ));
            document.add(new Paragraph("Gender                         :                        " + rs.getString(16) ));
            document.add(new Paragraph("E-Mail                         :                        " + rs.getString(17) ));
            document.add(new Paragraph("Date of Birth                  :                        " + rs.getString(14) ));
            document.add(new Paragraph("Category                       :                        " + rs.getString(2) ));
            document.add(new Paragraph("Physically Challenged          :                        " + rs.getString(5) ));
            document.add(new Paragraph("Ex-Servicemen                  :                        " + rs.getString(8) ));
            document.add(new Paragraph("Sports Person                  :                        " + rs.getString(9) ));
            document.add(new Paragraph("Domiciled in J&K state         :                        " + rs.getString(6) ));
            document.add(new Paragraph("Minority Status                :                        " + rs.getString(7) ));
            document.add(new Paragraph("Application Fee                :                        " + rs.getString(10) ));
            document.add(new Paragraph("Father's Name                  :                        " + rs.getString(18) ));
            document.add(new Paragraph("Address Line 1                 :                        " + rs.getString(19) ));
            document.add(new Paragraph("Address Line 2                 :                        " + rs.getString(20) ));
            document.add(new Paragraph("Address Line 3                 :                        " + rs.getString(21) ));
            document.add(new Paragraph("City                           :                        " + rs.getString(22) ));
            document.add(new Paragraph("District                       :                        " + rs.getString(23) ));
            document.add(new Paragraph("Pin Code                       :                        " + rs.getString(24) ));
            document.add(new Paragraph("State                          :                        " + rs.getString(25) ));
            document.add(new Paragraph("Nearest Railway Station        :                        " + rs.getString(26) ));
            document.add(new Paragraph("Mobile Number                  :                        " + rs.getString(27) ));
            document.add(new Paragraph("Landline Number                :                        "+ rs.getString(28)+"-"+rs.getString(29) ));
            document.add(new Paragraph("Examination Center             :                        " + rs.getString(30) ));
            document.add(new Paragraph("Qualifying Exam - 1            :                        " + rs.getString(31) ));
            document.add(new Paragraph("Qualifying Exam - 2            :                        " + rs.getString(32) ));
            document.add(new Paragraph("Discipline                     :                        " + rs.getString(33) ));
            document.add(new Paragraph("Sub Discipline                 :                        " + rs.getString(34) ));
            document.add(new Paragraph("Institute of Qualifying exam 1 :                        " + rs.getString(35) ));
            document.add(new Paragraph("University of Qualifying exam 2:                        " + rs.getString(36) ));
            document.add(new Paragraph("Type of Course                 :                        " + rs.getString(37) ));
            document.add(new Paragraph("Appearing in the final semester/year of Qualifying Exam - 2  : " + rs.getString(38) ));
            document.add(new Paragraph("Month and Year of passing      :                        "+rs.getString(39) ));
            document.add(new Paragraph("Nationality                    :                        " + rs.getString(15) ));
            document.add(new Paragraph("Previous Company Name          :                        " + rs.getString(42) ));
            document.add(new Paragraph("Previous Company Type          :                        " + rs.getString(43) ));
                  String x ="  ";
           Paragraph ad = new Paragraph(x);
           
           ad.setAlignment(Element.ALIGN_CENTER);
            document.add(ad);
             String m="  ";
           Paragraph c = new Paragraph(m);
           
           hea.setAlignment(Element.ALIGN_CENTER);
            document.add(c);
            String o ="@RASHTRIYA ISPAT NIGAM LIMITED,VIZAG";
           Paragraph h = new Paragraph(o);
           
           h.setAlignment(Element.ALIGN_CENTER);
            document.add(h);
            document.close(); // no need to close PDFwriter?
 //out.println("aaa");
           } } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
//session.invalidate();
 %>                                                                                                                             