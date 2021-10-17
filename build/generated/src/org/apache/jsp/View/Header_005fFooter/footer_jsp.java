package org.apache.jsp.View.Header_005fFooter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/css/enterprise.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/styles.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/colorbox.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/madisonisland.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/g-erp-cgv.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/custom-cgv.css\"\n");
      out.write("        media=\"all\" />\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-cgv-container\">\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer-brand-slide\">\n");
      out.write("                <div class=\"sect-smuse\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"dx\" href=\"#\">4DX</a></li>\n");
      out.write("                        <li><a class=\"imax\" href=\"#\">Imax</a></li>\n");
      out.write("                        <li><a class=\"starium\" href=\"#\">Starium</a></li>\n");
      out.write("                        <li><a class=\"gold-class\" href=\"#\">Goldclass</a></li>\n");
      out.write("                        <li><a class=\"lamour\" href=\"#\">L'amour</a></li>\n");
      out.write("                        <li><a class=\"sweet\" href=\"#\">Sweetbox</a></li>\n");
      out.write("                        <li><a class=\"dolby-atmos\" href=\"#\">Dolby Atmos</a></li>\n");
      out.write("                        <li><a class=\"premium-cinema\" href=\"#\">Premium Cinema</a></li>\n");
      out.write("                        <li><a class=\"screenx\" href=\"#\">Screenx</a></li>\n");
      out.write("                        <li><a class=\"cine-foret\" href=\"#\">Cine &amp; Foret</a></li>\n");
      out.write("                        <li><a class=\"cine-livingroom\" href=\"#\">Cine &amp; Living Room</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-cgv-policy\">\n");
      out.write("                <div class=\"content-cgv-policy\">\n");
      out.write("                    <div class=\"cgv-vietnam\">\n");
      out.write("                        <h3>CGV Vietnam</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">e-CGV</a></li>\n");
      out.write("                            <li><a href=\"#\">Gift Card</a></li>\n");
      out.write("                            <li><a href=\"#\">Career</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact CGV</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cgv-policy\">\n");
      out.write("                        <h3>Terms and Conditions</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Conditions of Website Use</a></li>\n");
      out.write("                            <li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("                            <li><a href=\"#\">Payment Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">F.A.Q</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cgv-follow-us\">\n");
      out.write("                        <h3>Follow Us</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"follow-fb\" href=\"#\" target=\"_blank\"></a></li>\n");
      out.write("                            <li><a class=\"follow-yt\" href=\"#\" target=\"_blank\"></a></li>\n");
      out.write("                            <li><a class=\"follow-instagram\" href=\"#\" target=\"_blank\"></a></li>\n");
      out.write("                            <li><a class=\"follow-zalo\" href=\"#\" target=\"_blank\"></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"cgv-permision\">\n");
      out.write("                            <h2><a href=\"#\" target=\"_blank\">cgv</a></h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"customer-cgv\">\n");
      out.write("                        <h3>Customer Service</h3>\n");
      out.write("                        <p style=\"line-height: 22px;\">Hotline: 1900 6017<br />Working hours: 8:00 - 22:00\n");
      out.write("                            (Monday to Sunday, including Public Holidays)&nbsp;<br />Email support: <a\n");
      out.write("                                href=\"mailto:hoidap@cgv.vn\">hoidap@cgv.vn</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-cgv-address\">\n");
      out.write("                <div class=\"cgv-address-content\">\n");
      out.write("                    <div class=\"logo-footer-cgv\">&nbsp;</div>\n");
      out.write("                    <div class=\"text-cgv-address\">\n");
      out.write("                        <h3>COMPANY CJ CGV VIETNAM</h3>\n");
      out.write("                        <p>Business registration certificate: 0303675393, registered for the first time on\n");
      out.write("                            31/7/2008, registered for the fifth change on 14/10/2015, issued by HCMC Department\n");
      out.write("                            of Planning and Investment.</p>\n");
      out.write("                        <p>Address:&nbsp;Floor 2, Rivera Park Saigon - No. 7/28 Thanh Thai street, Ward 14,\n");
      out.write("                            District 10, HCMC.</p>\n");
      out.write("                        <p>Hotline: 1900 6017</p>\n");
      out.write("                        <p>COPYRIGHT 2017 CJ CGV. All RIGHTS RESERVED .</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"wishlist_edit_action_container\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</footer>");
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
