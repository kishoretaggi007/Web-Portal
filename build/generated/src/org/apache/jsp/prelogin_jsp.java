package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;

public final class prelogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <title>Login Details</title>\n");
      out.write("        <form action=\"login.jsp\" name=\"regform\" method=\"post\">\n");
      out.write("            <img src=\"topnewfinal1.png\" width=1335 height=250>\n");
      out.write("            \n");
      out.write("            <table  border=\"8\" class=\"boldtable\" size=\"7\" align=\"left\" color=\"blue\" width=\"300\" height=\"50%\" style=\"background-color:FFFF00;\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"index.jsp\">Home</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"stage-1.jsp\">Online Registration</a></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"login.jsp\">Stage-2 Login</a></td>\t\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"login1n.jsp\">Registration Slip</a></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"contact.html\">Contact Us</a></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\t</table></br>\n");
      out.write("        <center>\n");
      out.write("                <h1 style=\"background-color:\">Successfully Completed stage-1!!\n");
      out.write("                </h1></br>\n");
      out.write("                <!--<h2>\n");
      out.write("                    <a href=\"challanpdf.jsp\">Click Here</a>To Download Challan</h2>-->\n");
      out.write("                </br></br>\n");
      out.write("                <table border=\"0\" class=\"boldtable\" align=\"center\">\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                    ");


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
      out.write("                    <tr>\n");
      out.write("                        <td>Registration No:");
out.print(s);
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>DOB:");
      out.print(resultset.getString(14));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email:");
      out.print(resultset.getString(17));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                \n");
      out.write("                ");
} } catch (Exception e) {
                                out.println(e.getMessage());
                            }
      out.write("\n");
      out.write("                <style>\n");
      out.write("                    .boldtable,.boldtable td,.boldtable th\n");
      out.write("                    {\n");
      out.write("                        font-family:palatino linotype;\n");
      out.write("                        font-size:15pt;\n");
      out.write("                        text-align:center-left;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("                <font color=\"red\" size=\"5px\">\n");
      out.write("                <p>Note:Above details should be used to login and Re-print challan\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                 </center>\n");
      out.write("                \n");
      out.write("                <table>\n");
      out.write(" <tr>\n");
      out.write("<center> \n");
      out.write("<input id=\"Button1\" type=\"submit\" value=\"Click here to login\" style=\"height:25px;width:170px\"/> \n");
      out.write("</center>\n");
      out.write(" </tr> </table>\n");
      out.write("\n");
      out.write("           \n");
      out.write("    </body>\n");
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
