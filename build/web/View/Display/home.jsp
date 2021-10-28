<%-- 
    Document   : home.jsp
    Created on : Oct 14, 2021, 9:43:42 PM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" id="top" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>CGV Cinemas Vietnam</title>
        <link rel="canonical" href="https://www.cgv.vn/en/" />
        <meta name="robots" content="INDEX,FOLLOW" />
        <link rel="shortcut icon" href="https://www.cgv.vn/media/favicon/default/cgvcinemas-vietnam-favicon.ico"
              type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/base/default/aw_blog/css/style.css"
              media="all" />
        <script type="text/javascript" src="https://www.cgv.vn/js/prototype/prototype.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/lib/jquery/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/lib/jquery/noconflict.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/lib/ccard.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/prototype/validation.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/scriptaculous/builder.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/scriptaculous/effects.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/scriptaculous/dragdrop.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/scriptaculous/controls.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/scriptaculous/slider.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/varien/js.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/varien/form.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/mage/translate.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/mage/cookies.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/js/google/ga.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/modernizr.custom.min.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/selectivizr.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.addListener.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/enquire.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/cgv.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/app.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.min.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.swipe.min.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.carousel.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/slideshow.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/imagesloaded.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/scripts.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/minicart.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/jquery.colorbox.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/catalogevent.js"></script>
        <script type="text/javascript"
        src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/wishlist.js"></script>
        <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Raleway:300,400,500,700,600" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/enterprise/css/enterprise.css"
              media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/styles.css"
              media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/colorbox.css"
              media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/madisonisland.css"
              media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/g-erp-cgv.css"
              media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/custom-cgv.css"
              <meta name="viewport" content="initial-scale=1.0, width=device-width" />
        <script src='//cdnt.netcoresmartech.com/smartechclient.js'></script>
        <script src="https://www.gstatic.com/firebasejs/8.2.1/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.2.1/firebase-messaging.js"></script>
        <script src='https://www.cgv.vn/mto.js'></script>

        <link href="${pageContext.request.contextPath}/css/homeStyle.css" rel="stylesheet" type="text/css">
    </head>

    <body class=" cms-index-index cms-home">
        <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
            <div class="main-container col1-layout">
                <div class="main">
                    <div class="col-main">
                        <div class="std">
                            <p>
                            <div class="widget widget-static-block">
                                <div class="sect-person">
                                    <ul>
                                        <li><a class="theater" href="#">cgv theater</a>
                                        </li>
                                        <li><a class="now-sh" href="showing">now showing</a></li>
                                        <li><a class="special" href="#">cgv special</a>
                                        </li>
                                        <li><a class="event" href="#">cgv under construction</a></li>
                                        <li><a class="ticket required-login" href="#">my ticket info</a></li>
                                        <li><a class="dc" href="#">discount info</a></li>
                                        <li><a class="login-header" href="register">create account quick</a></li>
                                    </ul>
                                </div>
                            </div>
                            </p>
                        </div>
                        <div class="slideshow-container">
                            <ul id="home_big_banner" class="slideshow">
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_109.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-digital-team-diy-980x448_1.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/_/c/_cgv_l_u_ng_980_x_448_1.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_112.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/o/r/oreo-900x448_1.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_114.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_116.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/9/8/980x448_118.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/3/t/3thang-980x448_1.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-production-team-midnite-streetfood-980x448.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-tarot-series-2-980x448_1.jpg" />
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img
                                            src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/d/u/du_an_phim_ngan_cj_1.jpg" />
                                    </a>
                                </li>
                            </ul>
                            <div class="slideshow-pager home_big_banner_pager">&nbsp;</div>
                            <span class="slideshow-prev home_big_banner_prev">&nbsp;</span>
                            <span class="slideshow-next home_big_banner_next">&nbsp;</span>
                        </div>

                        <div class="home-movie-selection">
                            <div class="home-title">
                                <h2>movie selection</h2>
                            </div>

                            <div class="slideshow-containe-movier feature_slide_show_480_767">
                                <ul class="feature_slide_show">
                                <c:forEach items="${requestScope.films}" var="f">
                                    <li class="poster-film film-lists item">
                                        <span class="nmovie-rating 
                                              <c:if test="${f.note eq \"C18\"}">
                                                  nmovie-rating-c18
                                              </c:if>
                                              <c:if test="${f.note eq \"C16\"}">
                                                  nmovie-rating-c16
                                              </c:if>
                                              <c:if test="${f.note eq \"C13\"}">
                                                  nmovie-rating-c13
                                              </c:if>
                                              <c:if test="${f.note eq \"P\"}">
                                                  nmovie-rating-p
                                              </c:if>
                                              "></span>
                                        <img class="product-img" src="${f.image}" alt="${f.name}" />
                                        <div class="feature_film_content">
                                            <h3>${f.name}</h3>
                                            <a title="Details" class="button" href="detail?id=${f.id}">Details</a>
                                            <a href="booking?id=${f.id}">
                                                <button type="button" title="Booking" class="button btn-booking">
                                                    <span><span>Booking</span></span>
                                                </button>
                                            </a>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>			
                            <span class="feature_slide_show_prev"><<</span> 
                            <span class="feature_slide_show_next">>></span>		
                        </div>
                    </div>

                    <div id="loading-mask" style="left: -2px; top: 0px; display: none;z-index: 999999;">
                        <p class="loader" id="loading_mask_loader">
                            <img src="https://www.cgv.vn/skin/frontend/cgv/default/images/ajax-loader.gif"
                                 alt="Loading...">
                            <br>Please wait...
                        </p>
                    </div>

                    <script type="text/javascript">
                        $j(window).bind("load", function () {
                            var width = $j(window).width();
                            if (width >= 979) {
                                reinitCycle(4);
                            } else if (width >= 770) {
                                reinitCycle(3);
                            } else if (width >= 479) {
                                reinitCycle(2);
                            } else {
                                reinitCycle(1);
                            }

                            $j(".play-button").click(function () {
                                var trailer = $j(this).find('span.movie-trailer');
                                if (typeof $j('#main-popup').attr('id') != undefined)
                                    $j.colorbox.remove();
                                $j.colorbox({iframe: true, innerWidth: 640, innerHeight: 390, href: trailer.html()});
                            });
                        });

                        $j(window).on('resize', function () {
                            var width = $j(window).width();
                            $j('.feature_slide_show').cycle('destroy');
                            if (width >= 979) {
                                reinitCycle(4);
                            } else if (width >= 770) {
                                reinitCycle(3);
                            } else if (width >= 479) {
                                reinitCycle(2);
                            } else {
                                reinitCycle(1);
                            }
                        });

                        function reinitCycle(visibleSlides) {
                            try {
                                $j('.feature_slide_show').cycle({
                                    "carouselSlideDimension": "240px",
                                    "carouselVisible": visibleSlides,
                                    "fx": "carousel",
                                    "timeout": 0,
                                    "next": ".feature_slide_show_next",
                                    "prev": ".feature_slide_show_prev",
                                    "slideActiveClass": "active",
                                    "slides": "li",
                                    "allowWrap": false,
                                });
                            } catch (err) {
                                console.log(err.message);
                            }
                        }

                        function Quickbooking(obj) {
                            $j.ajax({
                                type: 'post',
                                url: 'https://www.cgv.vn/en/cinemas/product/ajaxschedule/',
                                data: 'id=' + obj,
                                beforeSend: function () {
                                    $j.colorbox();
                                },
                            }).done(function (result) {
                                var html = '<div class="product-collateral toggle-content tabs tabs-cgv-movie-view-date">';
                                html += '<dl id="collateral-tabs" class="collateral-tabs">';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211016\');">';
                                html += '<span>10</span>';
                                html += '<em>Sat</em>';
                                html += '<strong>16</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += result;
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211017\');">';
                                html += '<span>10</span>';
                                html += '<em>Sun</em>';
                                html += '<strong>17</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211018\');">';
                                html += '<span>10</span>';
                                html += '<em>Mon</em>';
                                html += '<strong>18</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211019\');">';
                                html += '<span>10</span>';
                                html += '<em>Tue</em>';
                                html += '<strong>19</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211020\');">';
                                html += '<span>10</span>';
                                html += '<em>Wed</em>';
                                html += '<strong>20</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211021\');">';
                                html += '<span>10</span>';
                                html += '<em>Thu</em>';
                                html += '<strong>21</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211022\');">';
                                html += '<span>10</span>';
                                html += '<em>Fri</em>';
                                html += '<strong>22</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211023\');">';
                                html += '<span>10</span>';
                                html += '<em>Sat</em>';
                                html += '<strong>23</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211024\');">';
                                html += '<span>10</span>';
                                html += '<em>Sun</em>';
                                html += '<strong>24</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211025\');">';
                                html += '<span>10</span>';
                                html += '<em>Mon</em>';
                                html += '<strong>25</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211026\');">';
                                html += '<span>10</span>';
                                html += '<em>Tue</em>';
                                html += '<strong>26</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211027\');">';
                                html += '<span>10</span>';
                                html += '<em>Wed</em>';
                                html += '<strong>27</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211028\');">';
                                html += '<span>10</span>';
                                html += '<em>Thu</em>';
                                html += '<strong>28</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '<dt class="tab">';
                                html += '<div class="day" onclick="getSelectDay(' + obj + ', \'20211029\');">';
                                html += '<span>10</span>';
                                html += '<em>Fri</em>';
                                html += '<strong>29</strong>';
                                html += '</div>';
                                html += '</dt>';

                                html += '<dd class="tab-container">';
                                html += '<div class="tab-content showtimes">';
                                html += '</div>';
                                html += '</dd>';
                                html += '</dl>';
                                html += '</div>';

                                $j.colorbox({html: '<div class="product-view quick-booking cgv-schedule-popup">' + html + '</div>', width: "88%", height: "88%", fixed: true, modal: false});
                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-view-date');
                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-cites');
                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-type');
                                $j('#loading-mask').hide();
                            });
                        }

                        function getSelectDay(id, dy) {
                            $j.ajax({
                                type: 'post',
                                url: 'https://www.cgv.vn/en/cinemas/product/ajaxschedule/',
                                data: 'id=' + id + '&dy=' + dy,
                                beforeSend: function () {
                                    $j('#loading-mask').show();
                                    $j('dd.current .showtimes').empty();
                                },
                            }).done(function (result) {
                                $j('dd.current .showtimes').html(result);
                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-cites');
                                togglecontent('cgv-schedule-popup .tabs-cgv-movie-type');
                                $j('#loading-mask').hide();
                            });
                        }
                    </script>
                    <div class="product-collateral toggle-content tabs home-event">
                        <div class="home-title">
                            <h2>event</h2>
                        </div>

                        <dl id="collateral-tabs" class="collateral-tabs">
                            <dt class="tab"><span>News & Offers</span></dt>
                            <dd class="tab-container">
                                <div class="tab-content">
                                    <div class="home-show-event">
                                        <ul class="slide_home_event newsoffers">
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/promo-standard-charter-cgv/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/c/scb_cgv_240x201.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/an-toan-cung-cgv/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/n/9/n95_240x201.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/promo-sacombank-cgv-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/a/sacombank-cgv-240x201_1.png" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/hsbc-cgv-promo-2020-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/s/hsbc_platinum-cgv_digital-poster_240x201px.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/happy-ox-year-happy-ox-combo/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happy-new-year-240x201.png" />
                                                </a>
                                            </li>

                                        </ul>
                                        <span class="slide_home_event_prev newsoffers_prev"><<</span>
                                        <span class="slide_home_event_next newsoffers_next">>></span>
                                    </div>
                                </div>
                            </dd>			
                            <dt class="tab"><span>Member CGV</span></dt>
                            <dd class="tab-container">
                                <div class="tab-content">
                                    <div class="home-show-event">
                                        <ul class="slide_home_event membercgv">
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/u22-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/u/2/u22_240x201_1.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/happy-wednesday-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happywednesday240x201_2.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/cgv-culture-day-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/u/culture-240_1_1.jpg" />
                                                </a>
                                            </li>
                                            <li>
                                                <a href="https://www.cgv.vn/en/newsoffer/quyen-loi-moi-nam-2020-en/">
                                                    <img src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-crm-team-membership-launch-240x201_1.jpg" />
                                                </a>
                                            </li>

                                        </ul>
                                        <span class="slide_home_event_prev membercgv_prev"><<</span>
                                        <span class="slide_home_event_next membercgv_next">>></span>
                                    </div>
                                </div>
                            </dd>
                        </dl>
                    </div>
                    <div class="home-promotion-card">
                        <ul class="promos">
                            <li class="col-ad">
                                <div class="format-border"><a href="#"><img alt="" src="https://www.cgv.vn/media/wysiwyg/packages/214x245.jpg" /></a></div>
                            </li>
                            <li class="col-hd">
                                <div class="format-border"><a href="#"><img src="https://www.cgv.vn/media/wysiwyg/2021/U22_WEB_496x247.jpg" /></a>
                                </div>
                            </li>
                            <li class="col-ad">
                                <div class="format-border"><a href="#" target="_blank"><img src="https://www.cgv.vn/media/wysiwyg/2021/CGV-DIGITAL-HALL-RENTAL-214x245.png" /></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/homeJS.js"></script>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>