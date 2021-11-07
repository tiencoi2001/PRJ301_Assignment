package org.apache.jsp.View.ForAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateNewShowingFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #FDFCF0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
      out.write("                                    <li ><a href=\"accountDetail\">ACCOUNT DETAILS</a></li>\n");
      out.write("                                    <li ><a href=\"#\">MEMBERSHIP CARD</a></li>\n");
      out.write("                                    <li ><a href=\"#\">POINT</a></li>\n");
      out.write("                                    <li ><a href=\"#\">GIFT CARD</a></li>\n");
      out.write("                                    <li ><a href=\"#\">Voucher</a></li>\n");
      out.write("                                    <li ><a href=\"#\">Coupon</a></li>\n");
      out.write("                                    <li ><a href=\"transactionsHistory\">TRANSACTIONS HISTORY</a></li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-main\">\n");
      out.write("                    <div class=\"my-account\"><div class=\"page-title\">\n");
      out.write("                            <h1>Update new showing film</h1>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                        <form action=\"updateNewShowingFilm\" method=\"POST\">\n");
      out.write("                            <div class=\"fieldset edit-account-my-cgv\">\n");
      out.write("                                <ul class=\"form-list edit-info-cgv-left\">\n");
      out.write("                                    <li class=\"fields\">\n");
      out.write("                                        <div class=\"customer-name\">\n");
      out.write("                                            <label class=\"required\"><em>*</em>Film</label>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <select name=\"filmID\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"fields\">\n");
      out.write("                                        <div class=\"customer-name\">\n");
      out.write("                                            <label class=\"required\"><em>*</em>Premiere</label>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <input type=\"date\" required=\"required\" id=\"fullname\" name=\"premiere\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"fields\">\n");
      out.write("                                        <div class=\"customer-name\">\n");
      out.write("                                            <label class=\"required\"><em>*</em>Rated</label>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <select name=\"note\">\n");
      out.write("                                                    <option value=\"P\">P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG</option>\n");
      out.write("                                                    <option value=\"C13\">C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI</option>\n");
      out.write("                                                    <option value=\"C16\">C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI</option>\n");
      out.write("                                                    <option value=\"C18\">C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cgv-option-info\">\n");
      out.write("                                <h3></h3>\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-cgv-withdraw-save\">\n");
      out.write("                                <div class=\"buttons-set cgv-edit-btn\">\n");
      out.write("                                    <button type=\"submit\" title=\"Save\" class=\"button\"><span><span>Save</span></span></button>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"required\">* Required field</p>\n");
      out.write("                                <span id=\"error-validate\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li ><a href=\"giveAdminRights\">GIVE ADMIN RIGHTS</a></li>\n");
        out.write("                                    <li ><a href=\"removeAdminRights\">REMOVE ADMIN RIGHTS</a></li>\n");
        out.write("                                    <li class=\"current\"><a href=\"updateNewShowingFilm\">UPDATE NEW SHOWING FILM</a></li>\n");
        out.write("                                    <li ><a href=\"addNewComingFilm\">ADD NEW COMING FILM</a></li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.isNull}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <p style=\"background: #FFF0F0; color: #e71a0f; margin: 0 0 1.5em; padding: 1em 1em;\">\n");
        out.write("                                No account to update\n");
        out.write("                            </p>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.isUpdate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <p style=\"background: #FFF0F0; color: #e71a0f; margin: 0 0 1.5em; padding: 1em 1em;\">\n");
        out.write("                                Remove admin rights success\n");
        out.write("                            </p>\n");
        out.write("                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!requestScope.canUpdate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p style=\"background: #FFF0F0; color: #e71a0f; margin: 0 0 1.5em; padding: 1em 1em;\">\n");
        out.write("                                    No account to update\n");
        out.write("                                </p>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.films}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option> \n");
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
