package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;

public final class stage_002d2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head> \n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<title>Details</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/js/bootstrap.min.js\">\n");
      out.write("\n");
      out.write("<script src=\"totaljs.js\" type=\"text/javascript\" language=\"javascript\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-color: #e6f2ff\">\n");
      out.write("<!-- <form action=\"form1.html\" method=\"post\"> -->\n");
      out.write("<form name=\"myForm\" action=\"stage-2data.jsp\" method=\"post\" onsubmit=\"return validate()\" >\n");
      out.write("\n");
      out.write("<img src=\"topnewfinal1.png\" alt=\"logo\" width=1335 height=250>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"nav nav-tabs\">\n");
      out.write("    <a class=\"brand\" href=\"index.jsp\">Home</a>\n");
      out.write("    <a href=\"contact.html\">Contact Us</a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<table cellspacing=\"10pt\" width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFFD4;\">Registration Form [Stage-2] Junior Trainees- 2016</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"1pt\" width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Application Fee Detials</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"8pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write(" \n");
      out.write("\n");


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


      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>Registration No:</td><td>");
 out.println(s); 
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Name:</td><td>");
      out.print(resultset.getString(11)+" "+resultset.getString(12)+" "+resultset.getString(13));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Gender:</td><td>");
      out.print(resultset.getString(16));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Category:</td><td>");
      out.print(resultset.getString(2));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Physically Challenged:</td><td>");
      out.print(resultset.getString(5));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Fee amount:</td><td>");
      out.print(resultset.getString(10));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"1pt\" width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Personal Detials</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
} } catch (Exception e) {
                                out.println(e.getMessage());
                            }
      out.write("\n");
      out.write("<table cellspacing=\"4pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("<tr>\n");
      out.write("\t<td>\n");
      out.write("\t\t<font color=\"Red\"> *Fields are mandatory </font>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Father's Name<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"fatname\" name=\"fatname\" type=\"text\" size='28' placeholder=\"Father's Name\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Address<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"addr1\" type=\"text\" size='40' name=\"addr1\" placeholder=\"Address Line 1\"></td>\n");
      out.write("\t<tr></tr><td></td><td><input id=\"addr2\" type=\"text\" size='40' name=\"addr2\" placeholder=\"Address Line 2\"></td>\n");
      out.write("\t<tr></tr><td></td><td><input id=\"addr3\" type=\"text\" size='40' name=\"addr3\" placeholder=\"Address Line 3\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>City/Mandal<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"city\" type=\"text\" size='30' name=\"city\" placeholder=\"City/Mandal\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>District<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"district\" type=\"text\" size='30' name=\"district\" placeholder=\"District Name\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Pincode<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"pincode\" type=\"text\" sixe='10' name=\"pincode\" placeholder=\"Pincode\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>State:<font color=\"Red\">*</font></td>\n");
      out.write("\t<td><select id=\"state\" name=\"state\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select a state</option>\n");
      out.write("\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("\t\t<option value=\"Assam\">Assam</option>\n");
      out.write("\t\t<option value=\"Bihar\">Bihar</option>\n");
      out.write("\t\t<option value=\"Chattisgarh\">Chattisgarh</option>\n");
      out.write("\t\t<option value=\"Goa\">Goa</option>\n");
      out.write("\t\t<option value=\"Gujarat\">Gujarat</option>\n");
      out.write("\t\t<option value=\"Haryana\">Haryana</option>\n");
      out.write("\t\t<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("\t\t<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\n");
      out.write("\t\t<option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("\t\t<option value=\"Karnataka\">Karnataka</option>\n");
      out.write("\t\t<option value=\"Kerala\">Kerala</option>\n");
      out.write("\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("\t\t<option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("\t\t<option value=\"Manipur\">Manipur</option>\n");
      out.write("\t\t<option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("\t\t<option value=\"Mizoram\">Mizoram</option>\n");
      out.write("\t\t<option value=\"Nagaland\">Nagaland</option>\n");
      out.write("\t\t<option value=\"Odisha\">Odisha</option>\n");
      out.write("\t\t<option value=\"Punjab\">Punjab</option>\n");
      out.write("\t\t<option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("\t\t<option value=\"Sikkim\">Sikkim</option>\n");
      out.write("\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("\t\t<option value=\"Telangana\">Telangana</option>\n");
      out.write("\t\t<option value=\"Tripura\">Tripura</option>\n");
      out.write("\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("\t\t<option value=\"West Bengal\">West Bengal</option>\n");
      out.write("\t\t<option value=\"Delhi\">Delhi</option>\n");
      out.write("\t\t<option value=\"Andaman and Nicobar Island\">Andaman and Nicobar Island</option>\n");
      out.write("\t\t<option value=\"Chandiharh\">Chandiharh</option>\n");
      out.write("\t\t<option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option>\n");
      out.write("\t\t<option value=\"Daman and Diu\">Daman and Diu</option>\n");
      out.write("\t\t<option value=\"Lakshadweep\">Lakshadweep</option>\n");
      out.write("\t\t<option value=\"Puducherry\">Puducherry</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Nearest Railway Station:</td>\n");
      out.write("\t<td><input id=\"railway\" name=\"nrs\" type=\"text\" size='25' placeholder=\"Railway Station\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Mobile No<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"mobile\" name=\"mobile\" type=\"text\" size='15' placeholder=\"Mobile Number\" pattern=\"[0-9]+\">\n");
      out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"Blue\"> (10 digits only, without leading 0)</font></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Landline No<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td>STD Code&nbsp;&nbsp;<input id=\"std\" name=\"std\" type=\"text\" size='10' placeholder=\"STD code\" pattern=\"[0-9]+\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\tPhone No&nbsp;&nbsp;<input id=\"phone\" name=\"phone\" type=\"text\" size='15' placeholder=\"Phone Number\" pattern=\"[0-9]+\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Examination Center<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"examcenter\" name=\"exam\" style=\"width:200px\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select an examination center</option>\n");
      out.write("\t\t<option value=\"Agra\">Agra</option>\n");
      out.write("\t\t<option value=\"Ahmedabad\">Ahmedabad</option>\n");
      out.write("\t\t<option value=\"Ajmer\">Ajmer</option>\n");
      out.write("\t\t<option value=\"Aligarh\">Aligarh</option>\n");
      out.write("\t\t<option value=\"Allahabad\">Allahabad</option>\n");
      out.write("\t\t<option value=\"Ambattur\">Ambattur</option>\n");
      out.write("\t\t<option value=\"Amravati\">Amravati</option>\n");
      out.write("\t\t<option value=\"Amritsar\">Amritsar</option>\n");
      out.write("\t\t<option value=\"Asansol\">Asansol</option>\n");
      out.write("\t\t<option value=\"Aurangabad\">Aurangabad</option>\n");
      out.write("\t\t<option value=\"Bangalore\">Bangalore</option>\n");
      out.write("\t\t<option value=\"Bareilly\">Bareilly</option>\n");
      out.write("\t\t<option value=\"Belgaum\">Belgaum</option>\n");
      out.write("\t\t<option value=\"Bhilai\">Bhilai</option>\n");
      out.write("\t\t<option value=\"Bhopal\">Bhopal</option>\n");
      out.write("\t\t<option value=\"Bhubaneshwar\">Bhubaneshwar</option>\n");
      out.write("\t\t<option value=\"Bikaner\">Bikaner</option>\n");
      out.write("\t\t<option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("\t\t<option value=\"Chennai\">Chennai</option>\n");
      out.write("\t\t<option value=\"Coimbatore\">Coimbatore</option>\n");
      out.write("\t\t<option value=\"Cuttak\">Cuttak</option>\n");
      out.write("\t\t<option value=\"Dehradun\">Dehradun</option>\n");
      out.write("\t\t<option value=\"Delhi\">Delhi</option>\n");
      out.write("\t\t<option value=\"Dhanbad\">Dhanbad</option>\n");
      out.write("\t\t<option value=\"Durgapur\">Durgapur</option>\n");
      out.write("\t\t<option value=\"Erode\">Erode</option>\n");
      out.write("\t\t<option value=\"Faridabad\">Faridabad</option>\n");
      out.write("\t\t<option value=\"Firozabad\">Firozabad</option>\n");
      out.write("\t\t<option value=\"Gaya\">Gaya</option>\n");
      out.write("\t\t<option value=\"Ghaziabad\">Ghaziabad</option>\n");
      out.write("\t\t<option value=\"Gulbarga\">Gulbarga</option>\n");
      out.write("\t\t<option value=\"Gorakhpur\">Gorakhpur</option>\n");
      out.write("\t\t<option value=\"Gurgaon\">Gurgaon</option>\n");
      out.write("\t\t<option value=\"Guwahati\">Guwahati</option>\n");
      out.write("\t\t<option value=\"Gwalior\">Gwalior</option>\n");
      out.write("\t\t<option value=\"Hyderabad\">Hyderabad</option>\n");
      out.write("\t\t<option value=\"Howrah\">Howrah</option>\n");
      out.write("\t\t<option value=\"Hubballi-Dharwad\">Hubballi-Dharwad</option>\n");
      out.write("\t\t<option value=\"Indore\">Indore</option>\n");
      out.write("\t\t<option value=\"Jabalpur\">Jabalpur</option>\n");
      out.write("\t\t<option value=\"Jaipur\">Jaipur</option>\n");
      out.write("\t\t<option value=\"Jalandhar\">Jalandhar</option>\n");
      out.write("\t\t<option value=\"Jamnagar\">Jamnagar</option>\n");
      out.write("\t\t<option value=\"Jamshedpur\">Jamshedpur</option>\n");
      out.write("\t\t<option value=\"Jhansi\">Jhansi</option>\n");
      out.write("\t\t<option value=\"Jodhpur\">Jodhpur</option>\n");
      out.write("\t\t<option value=\"Kalyan-Dombivali\">Kalyan-Dombivali</option>\n");
      out.write("\t\t<option value=\"Kanpur\">Kanpur</option>\n");
      out.write("\t\t<option value=\"Kochi\">Kochi</option>\n");
      out.write("\t\t<option value=\"Kolhapur\">Kolhapur</option>\n");
      out.write("\t\t<option value=\"Kolkata\">Kolkata</option>\n");
      out.write("\t\t<option value=\"Kota\">Kota</option>\n");
      out.write("\t\t<option value=\"Loni\">Loni</option>\n");
      out.write("\t\t<option value=\"Ludhiana\">Ludhiana</option>\n");
      out.write("\t\t<option value=\"Lucknow\">Lucknow</option>\n");
      out.write("\t\t<option value=\"Madurai\">Madurai</option>\n");
      out.write("\t\t<option value=\"Mangalore\">Mangalore</option>\n");
      out.write("\t\t<option value=\"Meerut\">Meerut</option>\n");
      out.write("\t\t<option value=\"Mira-Bhayandar\">Mira-Bhayandar</option>\n");
      out.write("\t\t<option value=\"Moradabad\">Moradabad</option>\n");
      out.write("\t\t<option value=\"Mumbai\">Mumbai</option>\n");
      out.write("\t\t<option value=\"Mysore\">Mysore</option>\n");
      out.write("\t\t<option value=\"Nagpur\">Nagpur</option>\n");
      out.write("\t\t<option value=\"Nanded\">Nanded</option>\n");
      out.write("\t\t<option value=\"Nashik\">Nashik</option>\n");
      out.write("\t\t<option value=\"Navi Mumbai\">Navi Mumbai</option>\n");
      out.write("\t\t<option value=\"Nellore\">Nellore</option>\n");
      out.write("\t\t<option value=\"Noida\">Noida</option>\n");
      out.write("\t\t<option value=\"Patna\">Patna</option>\n");
      out.write("\t\t<option value=\"Pimpri-Chinchwad\">Pimpri-Chinchwad</option>\n");
      out.write("\t\t<option value=\"Puducherry\">Puducherry</option>\n");
      out.write("\t\t<option value=\"Pune\">Pune</option>\n");
      out.write("\t\t<option value=\"Rajkot\">Rajkot</option>\n");
      out.write("\t\t<option value=\"Raipur\">Raipur</option>\n");
      out.write("\t\t<option value=\"Ranchi\">Ranchi</option>\n");
      out.write("\t\t<option value=\"Rourkela\">Rourkela</option>\n");
      out.write("\t\t<option value=\"Srinagar\">Srinagar</option>\n");
      out.write("\t\t<option value=\"Surat\">Surat</option>\n");
      out.write("\t\t<option value=\"Solapur\">Solapur</option>\n");
      out.write("\t\t<option value=\"Saharanpur\">Saharanpur</option>\n");
      out.write("\t\t<option value=\"Salem\">Salem</option>\n");
      out.write("\t\t<option value=\"Sangli-Miraj & Kupwad\">Sangli-Miraj & Kupwad</option>\n");
      out.write("\t\t<option value=\"Siliguri\">Siliguri</option>\n");
      out.write("\t\t<option value=\"Thane\">Thane</option>\n");
      out.write("\t\t<option value=\"Tirucihrapalli\">Tirucihrapalli</option>\n");
      out.write("\t\t<option value=\"Tirunelveli\">Tirunelveli</option>\n");
      out.write("\t\t<option value=\"Tiruppur\">Tiruppur</option>\n");
      out.write("\t\t<option value=\"Ujjain\">Ujjain</option>\n");
      out.write("\t\t<option value=\"Ulhasnagar\">Ulhasnagar</option>\n");
      out.write("\t\t<option value=\"Vadodara\">Vadodara</option>\n");
      out.write("\t\t<option value=\"Varanasi\">Varanasi</option>\n");
      out.write("\t\t<option value=\"Vasai-Virar\">Vasai-Virar</option>\n");
      out.write("\t\t<option value=\"Vijayawada\">Vijayawada</option>\n");
      out.write("\t\t<option value=\"Visakhapatnam\">Visakhapatnam</option>\n");
      out.write("\t\t<option value=\"Warangal\">Warangal</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"8pt\" width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Qualification and Experience Details</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"4pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Qualifying Exam -1<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"exam1\" name=\"exam1\" style=\"width:165px\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select a degree</option>\n");
      out.write("\t\t<option value=\"5th Grade\">5th Grade</option>\n");
      out.write("\t\t<option value=\"SSC\">SSC</option>\n");
      out.write("\t\t<option value=\"Diploma\">Diploma</option>\n");
      out.write("\t\t<option value=\"Intermediate\">Intermediate</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Qualifying Exam -2:</td>\n");
      out.write("\t<td><select id=\"exam2\" name=\"exam2\" style=\"width:165px\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select a degree</option>\n");
      out.write("\t\t<option value=\"Under Graduate\">Under Graduate</option>\n");
      out.write("\t\t<option value=\"Master Graduate\">Master Graduate</option>\n");
      out.write("\t\t<option value=\"Ph D Graduate\">Ph D Graduate</option>\n");
      out.write("\t\t<option value=\"ITI\">ITI</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Select Discipline<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"discipline\" name=\"discipline\" style=\"width:165px\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select a discipline</option>\n");
      out.write("\t\t<option value=\"Mechanical\">Mechanical</option>\n");
      out.write("\t\t<option value=\"Electrical\">Electrical</option>\n");
      out.write("\t\t<option value=\"Electronics\">Electronics</option>\n");
      out.write("\t\t<option value=\"Civil\">Civil</option>\n");
      out.write("\t\t<option value=\"IT/CSE\">IT/CSE</option>\n");
      out.write("\t\t<option value=\"Metallurgy\">Metallurgy</option>\n");
      out.write("\t\t<option value=\"Chemical\">Chemical</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Select Sub Discipline<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"subdiscipline\" name=\"subdiscipline\" style=\"width:165px\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select a sub discipline</option>\n");
      out.write("\t\t<option value=\"Thermodynamics\">Thermodynamics</option>\n");
      out.write("\t\t<option value=\"Electromagnestism\">Electromagnestism</option>\n");
      out.write("\t\t<option value=\"Mechanics\">Mechanics</option>\n");
      out.write("\t\t<option value=\"Software Developer\">Software Developer</option>\n");
      out.write("\t\t<option value=\"Coder\">Coder</option>\n");
      out.write("\t\t<option value=\"System Analyst\">System Analyst</option>\n");
      out.write("\t\t<option value=\"Thermo\">Thermo</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Institute<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"institute\" name=\"institute\" type=\"text\" size=\"30\" placeholder=\"Institute name\">\n");
      out.write("\t&nbsp;&nbsp;&nbsp;<font color=\"Blue\">(For Qualifying Exam -2)</font></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>University<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"university\" name=\"university\" type=\"text\" size=\"30\" placeholder=\"University name\">\n");
      out.write("\t&nbsp;&nbsp;&nbsp;<font color=\"Blue\">(For Qualifying Exam -2)</font></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Type of Course<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"course\" name=\"course\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select Course Type</option>\n");
      out.write("\t\t<option value=\"B Sc\">B Sc</option>\n");
      out.write("\t\t<option value=\"B Tech\">B Tech</option>\n");
      out.write("\t\t<option value=\"ITI\">ITI</option>\n");
      out.write("\t\t<option value=\"Diploma\">Diploma</option>\n");
      out.write("\t\t<option value=\"10th\">10th</option>\n");
      out.write("\t</select>&nbsp;&nbsp;&nbsp; <font color=\"Blue\">(For Qualifying Exam -2)</font>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Are you appearing in the final </br> semester/year of Qualifying Exam -2?<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input type=\"radio\" id=\"final1\" name=\"appr\" value=\"Yes\">Yes\n");
      out.write("\t<input type=\"radio\" checked=\"true\" id=\"final2\" name=\"appr\"  value=\"No\">No\n");
      out.write("\t&nbsp;&nbsp;&nbsp; <font color=\"Blue\"> (For Qualifying Exam -2)</font></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Month and Year of course </br> completion (Passing/Appearing)<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"monthyear\" type=\"month\" name=\"my\"> \n");
      out.write("\t&nbsp;&nbsp;&nbsp; <font color=\"Blue\">(For Qualifying Exam -2)</font> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Percentage of marks<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input id=\"marks\" name=\"marks\" type=\"text\" size=\"15\" placeholder=\"Percentage of marks\">\n");
      out.write("\t&nbsp;&nbsp;&nbsp; Eg: 89.00<font color=\"Blue\"> (For Qualifying Exam -2)</font> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Do you have any work experience?<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><input type=\"radio\" id=\"experience1\" name=\"work\" value=\"yes\">Yes\n");
      out.write("\t<input type=\"radio\" checked=\"true\" id=\"experience2\" name=\"work\" value=\"no\">No</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Current/Last Company name:</td>\n");
      out.write("\t<td><input id=\"company\" name=\"company\" type=\"text\" size=\"35\" placeholder=\"Company name\"></td>\n");
      out.write("\t<tr><td></td><td>From: <input id=\"lastfrom\" type=\"month\"></td></tr>\n");
      out.write("\t<tr><td></td><td>To:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input id=\"lastto\" type=\"month\"></td></tr>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>Type of company<font color=\"Red\">*</font>:</td>\n");
      out.write("\t<td><select id=\"companytype\" name=\"companytype\">\n");
      out.write("\t\t<option selected=\"selected\" value=\"0\">Select Company Type</option>\n");
      out.write("\t\t<option value=\"Public\">Public</option>\n");
      out.write("\t\t<option value=\"Private\">Private</option>\n");
      out.write("\t\t<option value=\"Unlimited\">Unlimited</option>\n");
      out.write("\t\t<option value=\"Limited Liability Partnership (LLP)\">Limited Liability Partnership (LLP)</option>\n");
      out.write("\t\t<option value=\"Partnership\">Partnership</option>\n");
      out.write("\t\t<option value=\"Sole Propreitorship\">Sole Propreitorship</option>\n");
      out.write("\t\t<option value=\"Joint Venture\">Joint Venture</option>\n");
      out.write("\t\t<option value=\"Subsidiary\">Subsidiary</option>\n");
      out.write("\t</select>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<tr>\n");
      out.write("<center> \n");
      out.write("<input id=\"Button1\" type=\"submit\" value=\"Submit\" style=\"height:25px;width:70px\"/> \n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input id=\"Button2\" type=\"Reset\" value=\"Reset\" style=\"height:25px;width:70px\"/>\n");
      out.write("</center>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
