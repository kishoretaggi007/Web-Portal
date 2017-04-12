package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><title>Home page</title>\n");
      out.write("\n");
      out.write("    <script src=\"totaljs.js\" type=\"text/javascript\" language=\"javascript\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #e6f2ff\">\n");
      out.write("\n");
      out.write("<form name=\"myForm\" action=\"stage-1.jsp\" method=\"post\" onload=\"return checkForm()\" >\n");
      out.write("\n");
      out.write("<img src=\"topnewfinal1.png\" alt=\"logo\" width=1335 height=250>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<table cellspacing=\"10pt\" width=\"1345\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFFD4;\">Recruitment of Junior Trainees- 2016</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><font color=\"Red\" size=\"5\">Payment of application fees by challan can be done at SBI branches only</font></p>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<table  border=\"8\" class=\"boldtable\" size=\"7\" align=\"left\" color=\"blue\" width=\"300\" height=\"50%\" style=\"background-color:FFFF00;\">\n");
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
      out.write("</table>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".boldtable,.boldtable td,.boldtable th\n");
      out.write("{\n");
      out.write("font-family:palatino linotype;\n");
      out.write("font-size:15pt;\n");
      out.write("color:violet;\n");
      out.write("text-align:center-left;\n");
      out.write("}</style>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<br><br><br>\n");
      out.write("<tr>\n");
      out.write("\t<td><input id=\"terms\" type=\"checkbox\"><font color=\"Green\"> &nbsp;&nbsp;I have carefully read the post for Junior Trainees in RINL -VSP </br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; and accept the terms and conditions given in the advertisement.</br> I have gone through the FAQ.</font>\n");
      out.write("</tr>\n");
      out.write("<br><br>\n");
      out.write("<font size=\"5pt\" color=\"blue\">\n");
      out.write("<a href=\"stage-1.jsp\" onclick=\"return checkForm()\"></br></br>Click here to Apply </a>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<table cellspacing=\"10px\">\n");
      out.write("<tr>\n");
      out.write("    <td></td></br></br></br></br></br></br>\n");
      out.write("    <td><font color=\"Blue\" size=\"5\" style=\"background-color:#7FFF00 \">&copy; 2016, Rasthriya Ispat Nigam Limited</font></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write("</html>\n");
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
