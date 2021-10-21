package org.apache.jsp.View.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Account</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"main-container col2-left-layout\">\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <div class=\"col-left sidebar col-left-first\"><div class=\"block block-account\">\n");
      out.write("                            <div class=\"block-title\">\n");
      out.write("                                <strong><span>Tài khoản CGV</span></strong>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"block-content\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"current\"><a href=\"https://www.cgv.vn/default/customer/account/\">Thông tin chung</a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/customer/account/edit/\">Chi tiết tài khoản</strong></a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/loyalty/account/card/\">Thẻ thành viên</strong></a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/loyalty/account/point/\">Điểm thưởng</strong></a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/loyalty/account/gift/\">Thẻ quà tặng</strong></a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/loyalty/account/voucher/\">Voucher</strong></a></li>\n");
      out.write("                                    <li ><a href=\"https://www.cgv.vn/default/loyalty/account/coupon/\">Coupon</strong></a></li>\n");
      out.write("                                    <li class=\"last\"><a href=\"https://www.cgv.vn/default/sales/order/history/\">Lịch sử giao dịch</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div></div>\n");
      out.write("                    <div class=\"col-main\">\n");
      out.write("                        <div class=\"my-account\"><div class=\"dashboard\">\n");
      out.write("                                <div class=\"page-title\">\n");
      out.write("                                    <h1>Thông tin chung</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"format-profile-cgv\">\n");
      out.write("                                    <div class=\"my-profile-cgv\">\n");
      out.write("                                        <div class=\"image-profile-cgv\">\n");
      out.write("                                            <form action=\"https://www.cgv.vn/default/customer/account/changeavatar/\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("                                                <input name=\"form_key\" type=\"hidden\" value=\"SlpfmJrgU4EqOAjh\" />\n");
      out.write("                                                <input name=\"usersatus\" type=\"hidden\" value=\"1\" />\n");
      out.write("                                                <div class=\"insert-image-profile-cgv\">\n");
      out.write("                                                    <label id=\"fileToUpload\" for=\"fileToUpload\">\n");
      out.write("                                                        <img src=\"https://www.cgv.vn/media//customer//1/5/153804708728117578_455346314868599_918861810_n.jpg\" width=\"120\" height=\"120\" alt=\"Avatar Profile\" />\n");
      out.write("                                                    </label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"input-box\">\n");
      out.write("                                                    <input type=\"file\" name=\"avatar\" title=\"Avatar\" id=\"avatar\" class=\"input-text\" />\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"button-change-image-profile\">\n");
      out.write("                                                    <button type=\"button\" id=\"btnchange\">\n");
      out.write("                                                        <span><span>Thay đổi</span></span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"button-change-image-profile\">\n");
      out.write("                                                    <button type=\"submit\" id=\"btnsubmit\">\n");
      out.write("                                                        <span><span>Gửi đi</span></span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"barcode-my-cgv\">\n");
      out.write("                                            <div class=\"show-barcode-my-cgv\">\n");
      out.write("                                                <strong>Thẻ thành viên</strong>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"show-barcode-my-cgv\"><img src=\"https://www.barcodesinc.com/generator/image.php?code=9021875000713190&style=196&type=C128B&width=220&height=80&xres=1&font=3\" alt=\"Barcode.\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"welcome-msg\">\n");
      out.write("                                        <p class=\"hello\"><strong>Xin chào Nguyễn Thị Minh Thảo,</strong></p>\n");
      out.write("                                        <p>Với trang này, bạn sẽ quản lý được tất cả thông tin tài khoản của mình.</p>\n");
      out.write("                                    </div>\t\t<div class=\"box-account cgv-info\">\n");
      out.write("                                        <div class=\"cgv-status-member\">\n");
      out.write("                                            <div class=\"cgv-tier\">\n");
      out.write("                                                <label>Cấp Độ Thẻ</label>\n");
      out.write("                                                <span class=\"member-icon\"></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cgv-point total-spending\">\n");
      out.write("                                                <div class=\"format-acc-point\">\n");
      out.write("                                                    <label>Tổng Chi Tiêu</label>\n");
      out.write("                                                    <span class=\"acc-show-point\">\n");
      out.write("                                                        950.000 đ\t\t\t\t</span>\n");
      out.write("                                                </div>\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cgv-point\">\t\t\t\n");
      out.write("                                                <div class=\"format-acc-point\">\n");
      out.write("                                                    <label>Điểm CGV</label>\n");
      out.write("                                                    <span class=\"acc-show-point\">\n");
      out.write("                                                        47 P\t\t\t\t</span>\n");
      out.write("                                                </div>\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"cgv-gift-card cgv-info-detail\">\n");
      out.write("                                            <label>Thẻ quà tặng</label>\n");
      out.write("                                            <div class=\"format-acc\">\t\t\t\n");
      out.write("                                                <span class=\"acc-show-point\">\n");
      out.write("                                                    0 đ\t\t\t</span>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/default/loyalty/account/gift/\"><span class=\"icon-acc-add\">Xem</span></a>\n");
      out.write("                                            </div>\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"cgv-voucher cgv-info-detail cgv-coupons\">\n");
      out.write("                                            <label>Voucher</label>\n");
      out.write("                                            <div class=\"format-acc\">\t\t\t\n");
      out.write("                                                <span class=\"acc-show-point\">\n");
      out.write("                                                    0\t\t\t</span>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/default/loyalty/account/voucher/\"><span class=\"icon-acc-add\">Xem</span></a>\n");
      out.write("                                            </div>\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"cgv-coupon cgv-info-detail cgv-coupons\">\n");
      out.write("                                            <label>Coupon</label>\n");
      out.write("                                            <div class=\"format-acc\">\t\t\t\n");
      out.write("                                                <span class=\"acc-show-point\">\n");
      out.write("                                                    1\t\t\t</span>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/default/loyalty/account/coupon/\"><span class=\"icon-acc-add\">Xem</span></a>\n");
      out.write("                                            </div>\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"cgv-info-member-card cgv-point-last cgv-info-detail\">\n");
      out.write("                                            <label >Thẻ Thành Viên</label>\n");
      out.write("                                            <div class=\"format-acc\">\n");
      out.write("                                                <span class=\"acc-show-point\">\n");
      out.write("                                                    2\t\t\t</span>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/default/loyalty/account/card/\"><span class=\"icon-acc-add\">Xem</span></a>\n");
      out.write("                                            </div>\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"box-account box-info\">\n");
      out.write("                                        <div class=\"box-head\">\n");
      out.write("                                            <h2>Thông tin tài khoản</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"box\">\n");
      out.write("                                            <div class=\"box-title\">\n");
      out.write("                                                <h3 class=\"title-my-cgv\">Liên hệ</h3>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/default/customer/account/edit/\">Thay đổi</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"box-content box-content-my-cgv col2-set\">\n");
      out.write("                                                <span>Tên : Nguyễn Thị Minh Thảo</span>\n");
      out.write("                                                <span>Email : thaothoi31082000@gmail.com</span>\n");
      out.write("                                                <span>Tên đăng nhập : thaothoi31082000</span>\n");
      out.write("                                                <span>Điện thoại : 0886089019</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/footer.jsp", out, false);
      out.write("\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
