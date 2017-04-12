package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginfail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\n");
      out.write("\t<title>Home page\n");
      out.write("\t</title>\n");
      out.write("\t<script src=\"reg.js\" type=\"text/javascript\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body text-transform=\"UPPERCASE\" style=\"background-color:beige\">\n");
      out.write("\t<form action=\"checklogin.jsp\" name=\"chkform\">\n");
      out.write("\t<img src=\"topnewfinal1.png\" width=1335 height=250>\n");
      out.write("\t<center>\n");
      out.write("\t<i>\n");
      out.write("\t\n");
      out.write("\t<h1 style= \"background-color:#7FFFD4;\">Recruitment of Junior Trainees-2016 </h1>\n");
      out.write("\t\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Online Registration Form </br></h1>\n");
      out.write("\t</i>\n");
      out.write("            <font size=\"5\" color=\"red\">\n");
      out.write("            <marquee direction =\"right\" scrollamount=\"4\" behavior=\"alternate\" border=\"2pt\">Payment Of challan should be done at SBI branches only</marquee>  </font>\n");
      out.write("\t</br></br>\n");
      out.write("\t\n");
      out.write("        <table  border=\"8\" class=\"boldtable\" size=\"7\" align=\"left\" color=\"blue\" width=\"300\" height=\"50%\" style=\"background-color:FFFF00;\">\n");
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
      out.write("\t<td><a href=\"photo.jsp\">Upload Photos</a></td>\t\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"login.jsp\">Stage-2 Login</a></td>\t\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"login.jsp\">Registration Slip</a></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><a href=\"contact.html\">Contact Us</a></td>\n");
      out.write("</tr>        \n");
      out.write("\t</table>\n");
      out.write("       </br>\n");
      out.write("\t</center>\n");
      out.write("<style>\n");
      out.write("\t.boldtable,.boldtable td,.boldtable th\n");
      out.write("\t{\n");
      out.write("\tfont-family:palatino linotype;\n");
      out.write("\tfont-size:15pt;\n");
      out.write("\tcolor:blue;\n");
      out.write("\ttext-align:center-left;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\t<td>\n");
      out.write("\t<font size=\"6px\" color=\"black\">\n");
      out.write("\t<p style=\"background-color:lightblue\">To enter your Stage-2 details please login</p>\n");
      out.write("\t</font>\n");
      out.write("\t</td>\n");
      out.write("<table style=\"font-size:15pt\" cellspacing=\"30pt\">\n");
      out.write("<tr>\n");
      out.write("\t<td>Registration No:\n");
      out.write("\t</td>\n");
      out.write("\t<td>\n");
      out.write("\t<input id=\"no1\" type=\"text\" size=\"30\" name=\"reg1\" placeholder=\"Enter Registration No\"required=\"true\">\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td>DOB:\n");
      out.write("\t</td>\n");
      out.write("\t<td>\n");
      out.write("\t<input type=\"text\" id=\"dob\" name=\"dob1\" required=\"true\" size=\"30\"><font color=\"blue\" placeholder=\"dd-mm-yy\"/>[DD-MM-YY]\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<tr>\n");
      out.write("\t<td></td>\n");
      out.write("\t<td>\n");
      out.write("\t<input type=\"Submit\" value=\"Submit\" class=\"bigbutton\"> \n");
      out.write("\t<input type=\"reset\" value=\"Clear\" class=\"bigbutton\">\n");
      out.write("\t</td>\n");
      out.write("\t</font>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<label class=\"col-sm-2 control-label\"><span class=\"light\"><font size=\"5\">CREDENTIALS DID NOT MATCH</font></span></label>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\t</center>\n");
      out.write("\t<center>\n");
      out.write("<table cellspacing=\"10px\">\n");
      out.write("<tr>\n");
      out.write("    <td></td></br>\n");
      out.write("    <td><font color=\"Blue\" size=\"5\" style=\"background-color:#7FFF00 \">&copy; 2016, Rasthriya Ispat Nigam Limited</font></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("<style>\n");
      out.write(".light{font-family: Times New Roman;font-style: bold; font-weight: bold; color:red;}</style>\n");
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
