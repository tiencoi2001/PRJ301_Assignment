package org.apache.jsp.View.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transactionsHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>CGV Cinemas Vietnam</title>\n");
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
      out.write("/css/transactionHistory.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"main-container col2-left-layout\">\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <div class=\"col-left sidebar col-left-first\"><div class=\"block block-account\">\n");
      out.write("                            <div class=\"block-title\">\n");
      out.write("                                <strong><span>MY CGV</span></strong>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"block-content\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li ><a href=\"dashbroad\">DASHBOARD</a></li>\n");
      out.write("                                    <li ><a href=\"accountDetail\">ACCOUTNT DETAILS</a></li>\n");
      out.write("                                    <li ><a href=\"#\">MEMBERSHIP CARD</a></li>\n");
      out.write("                                    <li ><a href=\"#\">POINT</a></li>\n");
      out.write("                                    <li ><a href=\"#\">GIFT CARD</a></li>\n");
      out.write("                                    <li ><a href=\"#\">Voucher</a></li>\n");
      out.write("                                    <li ><a href=\"#\">Coupon</a></li>\n");
      out.write("                                    <li class=\"current last\"><a href=\"transactionsHistory\">TRANSACTIONS HISTORY</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-main\">\n");
      out.write("                        <div class=\"my-account\"><div class=\"page-title\">\n");
      out.write("                                <h1>Transactions history</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box-head\">\n");
      out.write("                                <button class=\"ptype button selected\"><span>Movie</span></button>\n");
      out.write("\n");
      out.write("                                <button class=\"ptype button\" onclick=\"location.href = 'https://www.cgv.vn/en/sales/order/history/type/phototicket/';\"><span>PhotoTicket</span></button>\n");
      out.write("\n");
      out.write("                                <button class=\"ptype button\" onclick=\"location.href = 'https://www.cgv.vn/en/sales/order/history/type/onlinestore/';\"><span>Online Store</span></button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"list-my-order\" id=\"list-my-order\">\n");
      out.write("                                <li class=\"list-my-order-detail\">\n");
      out.write("                                    <div class=\"col2-set\">\n");
      out.write("                                        <p class=\"status-order\">\n");
      out.write("                                            <label>Booking Number : 696302230</label>\n");
      out.write("                                            <em>(Status : Complete)</em>\t\t\t\t\n");
      out.write("                                            <em><img class=\"channel-icon\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png\" /></em>\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-1\">\n");
      out.write("                                            <img src=\"https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/t/a/tazza-oneeyedjack__main_poster_1__2.jpg\" alt=\"TAZZA: ONE EYED JACK\" />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-2\">\n");
      out.write("                                            <p>TAZZA: ONE EYED JACK</p>\n");
      out.write("                                            <span class=\"icon-rating-movie icon-C18\">C18</span>\n");
      out.write("                                            <p>12/02/2021</p>\n");
      out.write("                                            <p>From 20:00 PM ~ To 22:32 PM</p>\n");
      out.write("                                            <p>CGV Vincom Thai Nguyen</p>\n");
      out.write("                                            <p>\n");
      out.write("                                                Cinema 1\t\t\t\t\t\t(K7, K6, K5, K4)\t\t\t\t\t</p>\n");
      out.write("                                            <p><strong>₫332,000.00</strong></p>\n");
      out.write("                                            <div class=\"area-view-order\">\n");
      out.write("                                                <button class=\"view-order\" onclick=\"window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/56656238/'\">\n");
      out.write("                                                    <span><span>View</span></span>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"list-my-order-detail\">\n");
      out.write("                                    <div class=\"col2-set\">\n");
      out.write("                                        <p class=\"status-order\">\n");
      out.write("                                            <label>Booking Number : 667455864</label>\n");
      out.write("                                            <em>(Status : Complete)</em>\t\t\t\t\n");
      out.write("                                            <em><img class=\"channel-icon\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png\" /></em>\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-1\">\n");
      out.write("                                            <img src=\"https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/r/s/rsz_em_l__c_a_em-official_poster-_kc_08012021_2.jpg\" alt=\"‘EM’ LÀ CỦA EM \" />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-2\">\n");
      out.write("                                            <p>‘EM’ LÀ CỦA EM </p>\n");
      out.write("                                            <span class=\"icon-rating-movie icon-C16\">C16</span>\n");
      out.write("                                            <p>17/01/2021</p>\n");
      out.write("                                            <p>From 13:15 PM ~ To 15:16 PM</p>\n");
      out.write("                                            <p>CGV Aeon Long Bien</p>\n");
      out.write("                                            <p>\n");
      out.write("                                                Cinema 2\t\t\t\t\t\t(F7, F6)\t\t\t\t\t</p>\n");
      out.write("                                            <p><strong>₫240,000.00</strong></p>\n");
      out.write("                                            <div class=\"area-view-order\">\n");
      out.write("                                                <button class=\"view-order\" onclick=\"window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/56277713/'\">\n");
      out.write("                                                    <span><span>View</span></span>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"list-my-order-detail\">\n");
      out.write("                                    <div class=\"col2-set\">\n");
      out.write("                                        <p class=\"status-order\">\n");
      out.write("                                            <label>Booking Number : 514184788</label>\n");
      out.write("                                            <em>(Status : Complete)</em>\t\t\t\t\n");
      out.write("                                            <em><img class=\"channel-icon\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png\" /></em>\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-1\">\n");
      out.write("                                            <img src=\"https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/t/t/ttm_main-poster_2__2.jpg\" alt=\"TIEC TRANG MAU\" />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-2\">\n");
      out.write("                                            <p>TIEC TRANG MAU</p>\n");
      out.write("                                            <span class=\"icon-rating-movie icon-C18\">C18</span>\n");
      out.write("                                            <p>07/12/2020</p>\n");
      out.write("                                            <p>From 19:50 PM ~ To 22:06 PM</p>\n");
      out.write("                                            <p>CGV Vincom D Capitale</p>\n");
      out.write("                                            <p>\n");
      out.write("                                                Cinema 5\t\t\t\t\t\t(D3, D4)\t\t\t\t\t</p>\n");
      out.write("                                            <p><strong>₫90,000.00</strong></p>\n");
      out.write("                                            <div class=\"area-view-order\">\n");
      out.write("                                                <button class=\"view-order\" onclick=\"window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/54308083/'\">\n");
      out.write("                                                    <span><span>View</span></span>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"buttons-set\">\n");
      out.write("                                <p class=\"back-link\"><a href=\"https://www.cgv.vn/en/\"><small>&laquo; </small>Back</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
