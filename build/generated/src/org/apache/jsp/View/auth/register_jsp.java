package org.apache.jsp.View.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta name=\"robots\" content=\"INDEX,FOLLOW\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://www.cgv.vn/media/favicon/default/cgvcinemas-vietnam-favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/base/default/aw_blog/css/style.css\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/prototype/prototype.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/lib/jquery/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/lib/jquery/noconflict.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/lib/ccard.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/prototype/validation.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/scriptaculous/builder.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/scriptaculous/effects.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/scriptaculous/dragdrop.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/scriptaculous/controls.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/scriptaculous/slider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/varien/js.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/varien/form.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/mage/translate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/mage/cookies.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/google/ga.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/mage/captcha.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/modernizr.custom.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/selectivizr.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.addListener.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/enquire.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/cgv.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.swipe.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.carousel.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/slideshow.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/imagesloaded.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/scripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/minicart.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/jquery.colorbox.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/catalogevent.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/wishlist.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//fonts.googleapis.com/css?family=Raleway:300,400,500,700,600\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/css/enterprise.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/styles.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/colorbox.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/madisonisland.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/g-erp-cgv.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/custom-cgv.css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, width=device-width\" />\n");
      out.write("\n");
      out.write("        <script src='//cdnt.netcoresmartech.com/smartechclient.js'></script> \n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-app.js\"></script>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-messaging.js\"></script>\n");
      out.write("        <script src='https://www.cgv.vn/mto.js'></script>\n");
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/registerStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <!-- Header-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/header.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"main-container col1-layout\">\n");
      out.write("                    <div class=\"main\">            \n");
      out.write("                        <div class=\"col-main\">\n");
      out.write("                            <div class=\"account-wrap\">\n");
      out.write("                                <div class=\"col2-set\">\n");
      out.write("                                    <div class=\"cgv-login-register-form\">\n");
      out.write("                                        <div class=\"r-login\">\n");
      out.write("                                            <h2><span id=\"form-login-content\"><a href=\"login\">lOGIN</a></span><span id=\"form-register-content\" class=\"active\">REGISTER</span></h2>\n");
      out.write("                                            <div class=\"cgvfc form-register-content\">\n");
      out.write("                                                <form class=\"cgv-signup-form\" id=\"cgv-signup-form\" action=\"register\" method=\"POST\">\n");
      out.write("                                                    <fieldset>\n");
      out.write("                                                        <label for=\"r-fname\">Name<span>*</span></label>\n");
      out.write("                                                        <input type=\"text\" name=\"register_fullname\" class=\"input-text required-entry\" placeholder=\"Name\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                                        <label for=\"r-phone\">Phone Number<span>*</span></label>\n");
      out.write("                                                        <input type=\"text\" name=\"register_phone\" class=\"input-text required-entry\" placeholder=\"Phone number\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                                        <label for=\"r-email\">Email<span>*</span></label>\n");
      out.write("                                                        <input type=\"text\" name=\"register_email\" class=\"input-text required-entry\" placeholder=\"Email\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                                        <label for=\"r-password\">Password<span>*</span></label>\n");
      out.write("                                                        <input type=\"password\" name=\"register_password\" class=\"input-text required-entry\" placeholder=\"Password\" autocomplete=\"new-password\">\n");
      out.write("\n");
      out.write("                                                        <label for=\"r-birthday\">Date of birth<span>*</span></label>\n");
      out.write("                                                        <input type=\"date\" name=\"register_dob\" class=\"input-text required-entry\" placeholder=\"Date of birth\">\n");
      out.write("                                                        <label for=\"r-fname\" class=\"gender-title\">Gender<span>*</span>\n");
      out.write("                                                            <input type=\"radio\" name=\"register_gender\" id=\"male-gender\" value=\"Male\"> Male\n");
      out.write("                                                            <input type=\"radio\" name=\"register_gender\" id=\"female-gender\" value=\"Female\"> Female</label>\n");
      out.write("                                                        <label for=\"r-city\">Address<span>*</span></label>\n");
      out.write("                                                        <input type=\"text\" name=\"register_address\" class=\"input-text required-entry\" placeholder=\"Address\" autocomplete=\"off\">\n");
      out.write("                                                    </fieldset>\n");
      out.write("                                                    <input type=\"submit\" id=\"cgv-btnsignup\" value=\"REGISTER\">\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span id=\"error-validate\"></span>\n");
      out.write("                                            <div id=\"correct\" style=\"color:gray;\"></div>\n");
      out.write("                                            <div id=\"seconds\"></div>\n");
      out.write("                                        </div>            \n");
      out.write("                                        <div class=\"l-login\">\n");
      out.write("                                            <div id=\"slider-container\">\n");
      out.write("                                                <div class=\"mySlides fade\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/wysiwyg/2020/3.jpg\" />\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"mySlides fade\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/wysiwyg/2020/1.jpg\" />\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"mySlides fade\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/wysiwyg/2020/2.jpg\" />\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- The dots/circles -->\n");
      out.write("                                            <div class=\"cgv-dots\">\n");
      out.write("                                                <span class=\"dot\" onclick=\"currentSlide(0)\"></span>\n");
      out.write("                                                <span class=\"dot\" onclick=\"currentSlide(1)\"></span>\n");
      out.write("                                                <span class=\"dot\" onclick=\"currentSlide(2)\"></span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <div class=\"banner-login-page\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/registerJS.js\"></script>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Footer-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
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
