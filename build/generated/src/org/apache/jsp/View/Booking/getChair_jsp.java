package org.apache.jsp.View.Booking;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getChair_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vi\" id=\"top\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Booking</title>\n");
      out.write("        <link rel=\"canonical\" href=\"https://www.cgv.vn/default/cinemas/booking/tickets/site/044/seq/6165530/dy/20211027\" />\n");
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
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/js/varien/weee.js\"></script>\n");
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
      out.write("        <script src='//cdnt.netcoresmartech.com/smartechclient.js'></script>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-app.js\"></script>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-messaging.js\"></script>\n");
      out.write("        <script src='https://www.cgv.vn/mto.js'></script>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bookingStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\" cinemas-booking-tickets\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"main-container col1-layout\">\n");
      out.write("                <div class=\"main\">            \n");
      out.write("                    <div class=\"col-main\">\n");
      out.write("                        <div class=\"booking-progress\">\n");
      out.write("                            <div class=\"page-title\">\n");
      out.write("                                <h1>Booking Online</h1>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"top-content\">\n");
      out.write("                                <ol class=\"products-list\" id=\"products-list\">\n");
      out.write("                                    <li class=\"item\">\n");
      out.write("                                        <div class=\"product-shop\">\n");
      out.write("                                            <div class=\"f-fix\">\n");
      out.write("                                                <div class=\"product-primary\">\n");
      out.write("                                                    <p>CGV Vincom TN | ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.roomName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.slot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"main-content\">\n");
      out.write("                            <ul class=\"progress\">\n");
      out.write("                                <li class=\"booking-step\">\n");
      out.write("                                    <label class=\"h1\">People / Seats</label>\n");
      out.write("\n");
      out.write("                                    <div class=\"ticketbox\">\n");
      out.write("                                        <div class=\"screen\"><span class=\"text-screen\">Cinema</span></div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\t\t\t\t\t\t\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>\n");
      out.write("                                            <div class=\"seat empty\">Q88</div>                                                \n");
      out.write("                                        </div>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"seat seat-standard active\">A1</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A2</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A3</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A4</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A5</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A6</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A7</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A8</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A9</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">A10</div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"seat seat-standard active\">B1</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B2</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B3</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B4</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B5</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B6</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B7</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B8</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B9</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">B10</div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"seat seat-standard active\">C1</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C2</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C3</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C4</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C5</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C6</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C7</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C8</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C9</div>\n");
      out.write("                                            <div class=\"seat seat-standard active\">C10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"row\">\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">D10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"row\">\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">E10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"row\">\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">F10</div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\t\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">G10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"row\">\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">H10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"row\">\t\t\t\t\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I1</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I2</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I3</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I4</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I5</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I6</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I7</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I8</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I9</div>\n");
      out.write("                                            <div class=\"seat seat-vipprime active\">I10</div>\n");
      out.write("                                        </div>\t\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"bottom-content\">\n");
      out.write("                            <div class=\"format-bg-top\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"minicart-wrapper\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"item first\" xmlns=\"http://www.w3.org/1999/html\">\n");
      out.write("                                        <div class=\"product-details\">\n");
      out.write("                                            <table class=\"info-wrapper\">\n");
      out.write("                                                <colgroup>\n");
      out.write("                                                    <col width=\"40%\"/>\n");
      out.write("                                                    <col/>\n");
      out.write("                                                </colgroup>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.film.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.film.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </td>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <table class=\"info-wrapper\">\n");
      out.write("                                                                <tr><td class=\"label\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.film.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td></tr>\n");
      out.write("                                                                <tr><td class=\"label\">2D</td></tr>\n");
      out.write("                                                                <tr><td class=\"label\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.film.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td></tr>\n");
      out.write("                                                            </table>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li class=\"item\" xmlns=\"http://www.w3.org/1999/html\">\n");
      out.write("                                        <div class=\"product-details\">\n");
      out.write("                                            <table class=\"info-wrapper\">\t\t\t\t\t\t\t\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td class=\"label\">Theater</td>\n");
      out.write("                                                        <td>CGV Vincom TN</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td class=\"label\">Showtime</td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.slot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td class=\"label\">Screen</td>\n");
      out.write("                                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.trf.roomName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr class=\"block-seats\" style=\"display: none;\">\n");
      out.write("                                                        <td class=\"label\">Seats</td>\n");
      out.write("                                                        <td class=\"data\"></td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li class=\"item\" xmlns=\"http://www.w3.org/1999/html\">\n");
      out.write("                                        <div class=\"product-details\">\n");
      out.write("                                            <form action=\"getchair\" method=\"POST\">\n");
      out.write("                                                <input type=\"hidden\" name=\"finalFilmID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.finalFilmID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"finalDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.finalDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"finalSlot\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.finalSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                <label>Select chair:</label><select name=\"chairSelected\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                                <button type=\"submit\" title=\"Book\" class=\"button btn-booking\">\n");
      out.write("                                                    <span><span>Book</span></span>\n");
      out.write("                                                </button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"format-bg-bottom\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.chairs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("chair");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chair.chairID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chair.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
