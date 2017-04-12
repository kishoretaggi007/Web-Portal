package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class photo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body style=\"background-color: #E6F2FF\">\n");
      out.write("<!-- <form action=\"form1.html\" method=\"post\"> -->\n");
      out.write("\n");
      out.write("<form name=\"myForm\" action=\"photodata.jsp\" method=\"post\" onsubmit=\"return validate()\" >\n");
      out.write("\n");
      out.write("<img src=\"topnewfinal1.png\" alt=\"logo\" width=1335 height=250>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"nav nav-tabs\">\n");
      out.write("    <a class=\"brand\" href=\"index.jsp\">Home</a>\n");
      out.write("    \n");
      out.write("    <a href=\"contact.html\">Contact Us</a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<table cellspacing=\"4pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFFD4;\">Registration Form for Junior Trainees- 2016</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"4pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("    ");

        String s=(String)session.getAttribute("rno");
    
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("            Your details have been registered with Registration No:");
 out.println(s); 
      out.write("  </br> Please upload your photograph and signature.\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td><center><font color=\"Red\">**Note: Please upload <b>jpg</b> files only with size more than <b>2KB</b> \n");
      out.write("\tand less than <b>50KB</b> each. Please check the files before uploading</center></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"10pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("<tr>\n");
      out.write("\t<td><center>\n");
      out.write("\t<h1 style=\"background-color:#7FFF00;\">Photo/Signature</h1>\n");
      out.write("\t</center></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table cellspacing=\"10pt\" width=\"950px\" style=\"background-color: #FFFAF0\">\n");
      out.write("<tr>\n");
      out.write("\t<td>Photo:<td><input name=\"photo\" type=\"file\" accept=\"image/*\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</br>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<input id=\"Button1\" type=\"submit\" value=\"Submit\" style=\"height:25px;width:70px\"/> \n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input id=\"Button2\" type=\"reset\" value=\"Reset\" style=\"height:25px;width:70px\"/>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</br></br></br>\n");
      out.write("\n");
      out.write("<table align=\"center\" cellspacing=\"10pt\" >\n");
      out.write("<tr>\n");
      out.write("\t<td>Ideal dimensions for photograph is 3:4 (Eg: Width-150 Height-200)</br>Ideal dimensions for signature is 3:1 (Eg: Width-150 Height-50)</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
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
