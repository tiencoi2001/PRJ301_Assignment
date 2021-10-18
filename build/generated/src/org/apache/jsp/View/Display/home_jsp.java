package org.apache.jsp.View.Display;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" id=\"top\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>CGV Cinemas Vietnam</title>\n");
      out.write("        <link rel=\"canonical\" href=\"https://www.cgv.vn/en/\" />\n");
      out.write("        <meta name=\"robots\" content=\"INDEX,FOLLOW\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://www.cgv.vn/media/favicon/default/cgvcinemas-vietnam-favicon.ico\"\n");
      out.write("              type=\"image/x-icon\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/base/default/aw_blog/css/style.css\"\n");
      out.write("              media=\"all\" />\n");
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
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/modernizr.custom.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/selectivizr.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.addListener.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/enquire.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/cgv.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.swipe.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.carousel.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/slideshow.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/lib/imagesloaded.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/scripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/minicart.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.cgv.vn/skin/frontend/cgv/default/js/jquery.colorbox.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/catalogevent.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("        src=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/wishlist.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//fonts.googleapis.com/css?family=Raleway:300,400,500,700,600\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/enterprise/css/enterprise.css\"\n");
      out.write("              media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/styles.css\"\n");
      out.write("              media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/colorbox.css\"\n");
      out.write("              media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/madisonisland.css\"\n");
      out.write("              media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/g-erp-cgv.css\"\n");
      out.write("              media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cgv.vn/skin/frontend/cgv/default/css/custom-cgv.css\"\n");
      out.write("              <meta name=\"viewport\" content=\"initial-scale=1.0, width=device-width\" />\n");
      out.write("        <script src='//cdnt.netcoresmartech.com/smartechclient.js'></script>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-app.js\"></script>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/8.2.1/firebase-messaging.js\"></script>\n");
      out.write("        <script src='https://www.cgv.vn/mto.js'></script>\n");
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/homeStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\" cms-index-index cms-home\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"main-container col1-layout\">\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <div class=\"col-main\">\n");
      out.write("                        <div class=\"std\">\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"widget widget-static-block\">\n");
      out.write("                                <div class=\"sect-person\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a class=\"theater\" href=\"https://www.cgv.vn/en/cinox/site/\">cgv theater</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a class=\"now-sh\" href=\"https://www.cgv.vn/en/movies/now-showing.html/\">now\n");
      out.write("                                                showing</a></li>\n");
      out.write("                                        <li><a class=\"special\"\n");
      out.write("                                               href=\"https://www.cgv.vn/en/theaters/special/gold-class\">cgv special</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a class=\"event\" href=\"https://www.cgv.vn/en/du-an-xay-dung-rap-cgv/\">cgv\n");
      out.write("                                                under construction</a></li>\n");
      out.write("                                        <li><a class=\"ticket required-login\" href=\"https://www.cgv.vn/en/contacts/\">my\n");
      out.write("                                                ticket info</a></li>\n");
      out.write("                                        <li><a class=\"dc\" href=\"https://www.cgv.vn/en/newsoffer/\">discount info</a></li>\n");
      out.write("                                        <li><a class=\"login-header\"\n");
      out.write("                                               href=\"https://www.cgv.vn/en/customer/account/create/\">create account\n");
      out.write("                                                quick</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slideshow-container\">\n");
      out.write("                            <ul id=\"home_big_banner\" class=\"slideshow\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_109.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-digital-team-diy-980x448_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/_/c/_cgv_l_u_ng_980_x_448_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_112.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/o/r/oreo-900x448_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_114.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_116.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_118.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/3/t/3thang-980x448_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-production-team-midnite-streetfood-980x448.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-tarot-series-2-980x448_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img\n");
      out.write("                                            src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/d/u/du_an_phim_ngan_cj_1.jpg\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"slideshow-pager home_big_banner_pager\">&nbsp;</div>\n");
      out.write("                            <span class=\"slideshow-prev home_big_banner_prev\">&nbsp;</span>\n");
      out.write("                            <span class=\"slideshow-next home_big_banner_next\">&nbsp;</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"home-movie-selection\">\n");
      out.write("                            <div class=\"home-title\">\n");
      out.write("                                <h2>movie selection</h2>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"slideshow-containe-movier feature_slide_show_480_767\">\n");
      out.write("                                <ul class=\"feature_slide_show\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\t\t\t\n");
      out.write("                            <span class=\"feature_slide_show_prev\"><<</span> \n");
      out.write("                            <span class=\"feature_slide_show_next\">>></span>\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"loading-mask\" style=\"left: -2px; top: 0px; display: none;z-index: 999999;\">\n");
      out.write("                        <p class=\"loader\" id=\"loading_mask_loader\">\n");
      out.write("                            <img src=\"https://www.cgv.vn/skin/frontend/cgv/default/images/ajax-loader.gif\"\n");
      out.write("                                 alt=\"Loading...\">\n");
      out.write("                            <br>Please wait...\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        $j(window).bind(\"load\", function () {\n");
      out.write("                            var width = $j(window).width();\n");
      out.write("                            if (width >= 979) {\n");
      out.write("                                reinitCycle(4);\n");
      out.write("                            } else if (width >= 770) {\n");
      out.write("                                reinitCycle(3);\n");
      out.write("                            } else if (width >= 479) {\n");
      out.write("                                reinitCycle(2);\n");
      out.write("                            } else {\n");
      out.write("                                reinitCycle(1);\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            $j(\".play-button\").click(function () {\n");
      out.write("                                var trailer = $j(this).find('span.movie-trailer');\n");
      out.write("                                if (typeof $j('#main-popup').attr('id') != undefined)\n");
      out.write("                                    $j.colorbox.remove();\n");
      out.write("                                $j.colorbox({iframe: true, innerWidth: 640, innerHeight: 390, href: trailer.html()});\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        $j(window).on('resize', function () {\n");
      out.write("                            var width = $j(window).width();\n");
      out.write("                            $j('.feature_slide_show').cycle('destroy');\n");
      out.write("                            if (width >= 979) {\n");
      out.write("                                reinitCycle(4);\n");
      out.write("                            } else if (width >= 770) {\n");
      out.write("                                reinitCycle(3);\n");
      out.write("                            } else if (width >= 479) {\n");
      out.write("                                reinitCycle(2);\n");
      out.write("                            } else {\n");
      out.write("                                reinitCycle(1);\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        function reinitCycle(visibleSlides) {\n");
      out.write("                            try {\n");
      out.write("                                $j('.feature_slide_show').cycle({\n");
      out.write("                                    \"carouselSlideDimension\": \"240px\",\n");
      out.write("                                    \"carouselVisible\": visibleSlides,\n");
      out.write("                                    \"fx\": \"carousel\",\n");
      out.write("                                    \"timeout\": 0,\n");
      out.write("                                    \"next\": \".feature_slide_show_next\",\n");
      out.write("                                    \"prev\": \".feature_slide_show_prev\",\n");
      out.write("                                    \"slideActiveClass\": \"active\",\n");
      out.write("                                    \"slides\": \"li\",\n");
      out.write("                                    \"allowWrap\": false,\n");
      out.write("                                });\n");
      out.write("                            } catch (err) {\n");
      out.write("                                console.log(err.message);\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        function Quickbooking(obj) {\n");
      out.write("                            $j.ajax({\n");
      out.write("                                type: 'post',\n");
      out.write("                                url: 'https://www.cgv.vn/en/cinemas/product/ajaxschedule/',\n");
      out.write("                                data: 'id=' + obj,\n");
      out.write("                                beforeSend: function () {\n");
      out.write("                                    $j.colorbox();\n");
      out.write("                                },\n");
      out.write("                            }).done(function (result) {\n");
      out.write("                                var html = '<div class=\"product-collateral toggle-content tabs tabs-cgv-movie-view-date\">';\n");
      out.write("                                html += '<dl id=\"collateral-tabs\" class=\"collateral-tabs\">';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211016\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Sat</em>';\n");
      out.write("                                html += '<strong>16</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += result;\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211017\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Sun</em>';\n");
      out.write("                                html += '<strong>17</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211018\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Mon</em>';\n");
      out.write("                                html += '<strong>18</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211019\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Tue</em>';\n");
      out.write("                                html += '<strong>19</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211020\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Wed</em>';\n");
      out.write("                                html += '<strong>20</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211021\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Thu</em>';\n");
      out.write("                                html += '<strong>21</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211022\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Fri</em>';\n");
      out.write("                                html += '<strong>22</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211023\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Sat</em>';\n");
      out.write("                                html += '<strong>23</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211024\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Sun</em>';\n");
      out.write("                                html += '<strong>24</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211025\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Mon</em>';\n");
      out.write("                                html += '<strong>25</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211026\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Tue</em>';\n");
      out.write("                                html += '<strong>26</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211027\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Wed</em>';\n");
      out.write("                                html += '<strong>27</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211028\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Thu</em>';\n");
      out.write("                                html += '<strong>28</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '<dt class=\"tab\">';\n");
      out.write("                                html += '<div class=\"day\" onclick=\"getSelectDay(' + obj + ', \\'20211029\\');\">';\n");
      out.write("                                html += '<span>10</span>';\n");
      out.write("                                html += '<em>Fri</em>';\n");
      out.write("                                html += '<strong>29</strong>';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dt>';\n");
      out.write("\n");
      out.write("                                html += '<dd class=\"tab-container\">';\n");
      out.write("                                html += '<div class=\"tab-content showtimes\">';\n");
      out.write("                                html += '</div>';\n");
      out.write("                                html += '</dd>';\n");
      out.write("                                html += '</dl>';\n");
      out.write("                                html += '</div>';\n");
      out.write("\n");
      out.write("                                $j.colorbox({html: '<div class=\"product-view quick-booking cgv-schedule-popup\">' + html + '</div>', width: \"88%\", height: \"88%\", fixed: true, modal: false});\n");
      out.write("                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-view-date');\n");
      out.write("                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-cites');\n");
      out.write("                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-type');\n");
      out.write("                                $j('#loading-mask').hide();\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        function getSelectDay(id, dy) {\n");
      out.write("                            $j.ajax({\n");
      out.write("                                type: 'post',\n");
      out.write("                                url: 'https://www.cgv.vn/en/cinemas/product/ajaxschedule/',\n");
      out.write("                                data: 'id=' + id + '&dy=' + dy,\n");
      out.write("                                beforeSend: function () {\n");
      out.write("                                    $j('#loading-mask').show();\n");
      out.write("                                    $j('dd.current .showtimes').empty();\n");
      out.write("                                },\n");
      out.write("                            }).done(function (result) {\n");
      out.write("                                $j('dd.current .showtimes').html(result);\n");
      out.write("                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-cites');\n");
      out.write("                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-type');\n");
      out.write("                                $j('#loading-mask').hide();\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                    <div class=\"product-collateral toggle-content tabs home-event\">\n");
      out.write("                        <div class=\"home-title\">\n");
      out.write("                            <h2>event</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <dl id=\"collateral-tabs\" class=\"collateral-tabs\">\n");
      out.write("                            <dt class=\"tab\"><span>News & Offers</span></dt>\n");
      out.write("                            <dd class=\"tab-container\">\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div class=\"home-show-event\">\n");
      out.write("                                        <ul class=\"slide_home_event newsoffers\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/promo-standard-charter-cgv/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/c/scb_cgv_240x201.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/an-toan-cung-cgv/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/n/9/n95_240x201.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/promo-sacombank-cgv-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/a/sacombank-cgv-240x201_1.png\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/hsbc-cgv-promo-2020-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/s/hsbc_platinum-cgv_digital-poster_240x201px.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/happy-ox-year-happy-ox-combo/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happy-new-year-240x201.png\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                        <span class=\"slide_home_event_prev newsoffers_prev\"><<</span>\n");
      out.write("                                        <span class=\"slide_home_event_next newsoffers_next\">>></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </dd>\t\t\t\n");
      out.write("                            <dt class=\"tab\"><span>Member CGV</span></dt>\n");
      out.write("                            <dd class=\"tab-container\">\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div class=\"home-show-event\">\n");
      out.write("                                        <ul class=\"slide_home_event membercgv\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/u22-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/u/2/u22_240x201_1.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/happy-wednesday-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happywednesday240x201_2.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/cgv-culture-day-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/u/culture-240_1_1.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.cgv.vn/en/newsoffer/quyen-loi-moi-nam-2020-en/\">\n");
      out.write("                                                    <img src=\"https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-crm-team-membership-launch-240x201_1.jpg\" />\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                        <span class=\"slide_home_event_prev membercgv_prev\"><<</span>\n");
      out.write("                                        <span class=\"slide_home_event_next membercgv_next\">>></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </dd>\n");
      out.write("                        </dl>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"home-promotion-card\">\n");
      out.write("                        <ul class=\"promos\">\n");
      out.write("                            <li class=\"col-ad\">\n");
      out.write("                                <div class=\"format-border\"><a href=\"#\"><img alt=\"\" src=\"https://www.cgv.vn/media/wysiwyg/packages/214x245.jpg\" /></a></div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"col-hd\">\n");
      out.write("                                <div class=\"format-border\"><a href=\"#\"><img src=\"https://www.cgv.vn/media/wysiwyg/2021/U22_WEB_496x247.jpg\" /></a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"col-ad\">\n");
      out.write("                                <div class=\"format-border\"><a href=\"#\" target=\"_blank\"><img src=\"https://www.cgv.vn/media/wysiwyg/2021/CGV-DIGITAL-HALL-RENTAL-214x245.png\" /></a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/homeJS.js\"></script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header_Footer/footer.jsp", out, false);
      out.write("\n");
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
          out.write("                                    <li class=\"poster-film film-lists item\">\n");
          out.write("                                        <span class=\"nmovie-rating \n");
          out.write("                                              ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                              ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                              ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                              ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                              \"></span>\n");
          out.write("                                        <img class=\"product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                        <div class=\"feature_film_content\">\n");
          out.write("                                            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                            <a title=\"Details\" class=\"button\" href=\"detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Details</a>\n");
          out.write("                                            <button type=\"button\" title=\"Booking\" class=\"button btn-booking\"><span><span>Booking</span></span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </li>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.note eq \"C18\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                  nmovie-rating-c18\n");
        out.write("                                              ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.note eq \"C16\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                  nmovie-rating-c16\n");
        out.write("                                              ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.note eq \"C13\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                  nmovie-rating-c13\n");
        out.write("                                              ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.note eq \"P\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                  nmovie-rating-p\n");
        out.write("                                              ");
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
}
