package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stage_002d1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"totaljs.js\" type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-color: #e6f2ff\" onload=\"return certicheck()\">\n");
      out.write("    \n");
      out.write("<form name=\"myForm\" action=\"stage-1data.jsp\" method=\"post\" onsubmit=\"return validate()\" >\n");
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
      out.write("\t<h1 style=\"background-color:#7FFFD4;\">Registration Form [Stage-1] Junior Trainees- 2016</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"1pt\" width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Basic Details</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"8pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("<tr>\n");
      out.write("\t<marquee behavior =\"scroll\" direction=\"left\" width=\"935px\">\n");
      out.write("\t\t<font color=\"Red\" size='5'> #Enter details as per SSC certificate </font> \n");
      out.write("\t</marquee>\n");
      out.write("</tr>\n");
      out.write("\t\n");
      out.write("<tr>\n");
      out.write("\t<td>\n");
      out.write("\t\t<font color=\"Red\"> *Fields are mandatory </font>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Category<font color=\"Red\">*</font>:\n");
      out.write("<td><input type=\"radio\" checked=\"true\" id=\"gen\" value=\"Gen\" name=\"caste\" onclick=\"certicheck()\">Gen\n");
      out.write("<input type=\"radio\" id=\"obc\" name=\"caste\" value=\"OBC\" onclick=\"certicheck()\">OBC\n");
      out.write("<input type=\"radio\" id=\"sc\" name=\"caste\" value=\"SC\" onclick=\"certicheck()\">SC\n");
      out.write("<input type=\"radio\" id=\"st\" name=\"caste\" value=\"ST\" onclick=\"certicheck()\">ST \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<div id=\"certi1\" style=\"visibility:hidden\">                       <!-- hidden certificate no and issue date-->\n");
      out.write("Category Certificate No<font color=\"Red\">*</font>:\n");
      out.write("<input id=\"certificate\" name=\"certificate\" type=\"text\" size=\"20\" placeholder=\"Category Certificate No\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<div id=\"certi2\" style=\"visibility:hidden\">                       <!-- hidden certificate no and issue date-->\n");
      out.write("Issued Date<font color=\"Red\">*</font>:\n");
      out.write("<input id=\"certidate\" name=\"certidate\" type=\"date\" size=\"10\" placeholder=\"dd-MMM-yyyy\"/>\n");
      out.write("</div>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Physically Challenged<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input type=\"radio\"  id=\"phc\" name=\"phc\"  value=\"yes\"/>Yes\n");
      out.write("   <input type=\"radio\"  id=\"phc\" name=\"phc\"  value=\"no\"/>No\n");
      out.write("</td>\n");
      out.write("<tr>\n");
      out.write("<td>Domiciled in J&K state<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input type=\"radio\"  id=\"domicille\" name=\"domicile\"  value=\"yes\"/>Yes\n");
      out.write("   <input type=\"radio\"  id=\"domicille\" name=\"domicile\"  value=\"no\"/>No\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("<td>Minority Status<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><select id=\"minority\" name=\"minority\" >\n");
      out.write("<option selected=\"selected\" value=\"1\">Not Applicable</option>\n");
      out.write("<option value=\"2\">Muslims</option>\n");
      out.write("<option value=\"3\">Sikhs</option>\n");
      out.write("<option value=\"4\">Christians</option>\n");
      out.write("<option value=\"5\">Buddhists</option>\n");
      out.write("<option value=\"6\">Zoroastrians (Parsis)</option>\n");
      out.write("<option value=\"7\">Jains</option>\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Ex-Servicemen<font color=\"Red\">*</font>:\n");
      out.write("<td><input type=\"radio\"  id=\"serve\" name=\"service\"  value=\"yes\"/>Yes\n");
      out.write("   <input type=\"radio\"  id=\"serve\" name=\"service\"  value=\"no\"/>No\n");
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Sports Person<font color=\"Red\">*</font>:\n");
      out.write("<td><input type=\"radio\"  id=\"sports\" name=\"sports\"  value=\"yes\"/>Yes\n");
      out.write("   <input type=\"radio\"  id=\"sports\" name=\"sports\"  value=\"no\"/>No\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Application Fee:\n");
      out.write("<td><input id=\"fees\" name=\"fees\" type=\"text\" size=\"5\" placeholder=\"Fees\" readonly/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Name<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input id=\"fname\" name=\"fname\" type=\"text\" size='14' placeholder=\"First Name\"/>\n");
      out.write("<input id=\"mname\" name=\"mname\" type=\"text\" size='14' placeholder=\"Middle Name\"/>\n");
      out.write("<input id=\"lname\" name=\"lname\" type=\"text\" size='14' placeholder=\"Last Name\"/>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Date of Birth<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input id=\"dob\" name=\"dob\" type=\"date\" size=\"11\" placeholder=\"dd-MMM-yyyy\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Nativity<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input id=\"country\" name=\"country\" type=\"text\" size=\"10\" placeholder=\"Country\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("Only <font color=\"Blue\"><b>INDIAN</b></font> nationals are eligible\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Gender<font color=\"Red\">*</font>:\n");
      out.write("<td><input type=\"radio\" checked=\"true\" id=\"male\" name=\"gender\" value=\"male\">Male\n");
      out.write("<input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">Female\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<font color=\"Blue\"><b>FEMALE</b></font>s are eligible only for <font color=\"blue\"><b>Instrumentation Discipline</b></font>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Email Address<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input id=\"email1\" name=\"email1\" type=\"email\" size=\"40\" placeholder=\"xxxxxx@gmail.com\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Confirm Email Address<font color=\"Red\">*</font>:</td>\n");
      out.write("<td><input id=\"email2\" name=\"email2\" type=\"email\" size=\"40\" placeholder=\"xxxxxx@gmail.com\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("</center>\n");
      out.write("</table>\n");
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
