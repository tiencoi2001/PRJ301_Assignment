<%-- 
    Document   : home.jsp
    Created on : Oct 14, 2021, 9:43:42 PM
    Author     : Vu Duc Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" id="top" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>CGV Cinemas Vietnam</title>
        <meta name="keywords"
              content="cgv, cgv cinemas vietnam, rap chieu phim, lich chieu, phim moi nhat, trailer phim, phim sap chieu" />
        <meta name="title"
              content="CGV Cinemas Vietnam | Thông tin - Lịch chiếu - Hệ thống rạp chiếu phim đẳng cấp CGV Cinemas Việt Nam" />
        <meta name="description"
              content="Trải nghiệm điện ảnh chất lượng nhất tại cụm rạp CGV trên toàn quốc. Trang thông tin tổng hợp lịch chiếu, trailers phim mới nhất tại CGV Cinemas Việt Nam." />
        <meta name="author" content="CGV Cinemas Vietnam" />
        <meta name="publisher" content="CGV Cinemas Vietnam" />
        <meta property="fb:app_id" content="1711898955707825" />
        <meta property="fb:pages" content="395143205624" />
        <meta property="og:site_name" content="Cgv.vn" />
        <meta property="og:type" content="website" />
        <meta property="og:title"
              content="CGV Cinemas Vietnam | Thông tin - Lịch chiếu - Hệ thống rạp chiếu phim đẳng cấp CGV Cinemas Việt Nam" />
        <meta property="og:description"
              content="Trải nghiệm điện ảnh chất lượng nhất tại cụm rạp CGV trên toàn quốc. Trang thông tin tổng hợp lịch chiếu, trailers phim mới nhất tại CGV Cinemas Việt Nam." />

        <link rel="canonical" href="https://www.cgv.vn/en/" />
        <meta name="robots" content="INDEX,FOLLOW" />
        <meta name="google-site-verification" content="UEWWiNkGp-8XEvn-Ya15ciNeBKn3WECih18dJ5ZRUlY" />
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
    </head>

    <body class=" cms-index-index cms-home">
        <!-- Google Tag Manager (noscript) -->
        <noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-MSDTZ2C" height="0" width="0"
                          style="display:none;visibility:hidden"></iframe></noscript>
        <!-- End Google Tag Manager (noscript) -->
        <!-- BEGIN GOOGLE ANALYTICS CODE -->
        <script type="text/javascript">
            //<![CDATA[
            var _gaq = _gaq || [];

            _gaq.push(['_setAccount', '55803327']);

            _gaq.push(['_trackPageview']);

            (function () {
                var ga = document.createElement('script');
                ga.type = 'text/javascript';
                ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(ga, s);
            })();
            //]]>
        </script>
        <!-- END GOOGLE ANALYTICS CODE -->

        <div class="wrapper">
            <noscript>
            <div class="global-site-notice noscript">
                <div class="notice-inner">
                    <p>
                        <strong>JavaScript seems to be disabled in your browser.</strong><br />
                        You must have JavaScript enabled in your browser to utilize the functionality of this website.
                    </p>
                </div>
            </div>
            </noscript>
            <div class="page">
                <div class="mtw_banner_top">
                    <div class="mtw_banner_top_content">
                        <script type='text/javascript'>
                            //<![CDATA[
                            var m3_u = (location.protocol == 'https:' ? 'https://advserver.cgv.vn/www/delivery/ajs.php' : 'http://advserver.cgv.vn/www/delivery/ajs.php');
                            var m3_r = Math.floor(Math.random() * 99999999999);
                            if (!document.MAX_used)
                                document.MAX_used = ',';
                            document.write("<scr" + "ipt type='text/javascript' src='" + m3_u);
                            document.write("?zoneid=2");
                            document.write('&amp;cb=' + m3_r);
                            if (document.MAX_used != ',')
                                document.write("&amp;exclude=" + document.MAX_used);
                            document.write(document.charset ? '&amp;charset=' + document.charset : (document.characterSet ? '&amp;charset=' + document.characterSet : ''));
                            document.write("&amp;loc=" + escape(window.location));
                            if (document.referrer)
                                document.write("&amp;referer=" + escape(document.referrer));
                            if (document.context)
                                document.write("&context=" + escape(document.context));
                            if (document.mmm_fo)
                                document.write("&amp;mmm_fo=1");
                            document.write("'><\/scr" + "ipt>");
                            //]]>
                        </script><noscript><a href='http://advserver.cgv.vn/www/delivery/ck.php?n=a42fb781&amp;cb=INSERT_RANDOM_NUMBER_HERE'
                                              target='_blank'><img
                                src='http://advserver.cgv.vn/www/delivery/avw.php?zoneid=2&amp;cb=INSERT_RANDOM_NUMBER_HERE&amp;n=a42fb781'
                                border='0' alt='' /></a></noscript>
                    </div>

                    <script type='text/javascript'>
                        //<![CDATA[
                        $j(document).ready(function () {
                            $j(".mtw_banner_top_content").mouseup(function () {
                                var src_data = $j(this).find('embed').attr('flashvars');
                                if (src_data) {
                                    var url = src_data.split('=');
                                    window.open(decodeURIComponent(url[2]), '_blank');
                                }
                            });
                        });
                        //]]>
                    </script>
                </div>
                <!--[if IE 8]>
        <style>
            .mtw_banner_left,.mtw_banner_right {
                display:none;
            }
        </style>
    <![endif]-->
                <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
                    <div class="main-container col1-layout">
                        <div class="main">
                            <div class="col-main">
                                <div class="std">
                                    <p>
                                    <div class="widget widget-static-block">
                                        <div class="sect-person">
                                            <ul>
                                                <li><a class="theater" href="https://www.cgv.vn/en/cinox/site/">cgv theater</a>
                                                </li>
                                                <li><a class="now-sh" href="https://www.cgv.vn/en/movies/now-showing.html/">now
                                                        showing</a></li>
                                                <li><a class="special"
                                                       href="https://www.cgv.vn/en/theaters/special/gold-class">cgv special</a>
                                                </li>
                                                <li><a class="event" href="https://www.cgv.vn/en/du-an-xay-dung-rap-cgv/">cgv
                                                        under construction</a></li>
                                                <li><a class="ticket required-login" href="https://www.cgv.vn/en/contacts/">my
                                                        ticket info</a></li>
                                                <li><a class="dc" href="https://www.cgv.vn/en/newsoffer/">discount info</a></li>
                                                <li><a class="login-header"
                                                       href="https://www.cgv.vn/en/customer/account/create/">create account
                                                        quick</a></li>
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

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c13">C13</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/1/2/1200x1800_1.jpg"
                                                                                             alt="THE FATHER" />
                                                <input type="hidden" value="movie-trailer-3368">
                                                <div class="feature_film_content">
                                                    <h3>THE FATHER</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/bo-gia.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21001400');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/uVa1lTvmVhs?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c16">C16</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/m/a/main_poster_seobok_15_1.jpg"
                                                                                             alt="SEOBOK" />
                                                <input type="hidden" value="movie-trailer-3203">
                                                <div class="feature_film_content">
                                                    <h3>SEOBOK</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/nguoi-nhan-ban.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21004600');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/u7KeKpV3FQA?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c13">C13</span>
                                                <img class="product-img"
                                                     src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/c/o/conan_24_-_main_poster_1__1.jpg"
                                                     alt="DETECTIVE CONAN: THE SCARLET BULLET" />
                                                <input type="hidden" value="movie-trailer-3603">
                                                <div class="feature_film_content">
                                                    <h3>DETECTIVE CONAN: THE SCARLET BULLET</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/conan-vien-dan-do.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21004900');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/lOq4F7tLpxU?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c13">C13</span>
                                                <img class="product-img"
                                                     src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster-the-last-warrior_1__1.jpg"
                                                     alt="THE LAST WARRIOR: ROOT OF EVIL" />
                                                <input type="hidden" value="movie-trailer-3653">
                                                <div class="feature_film_content">
                                                    <h3>THE LAST WARRIOR: ROOT OF EVIL</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/chien-binh-cuoi-cung.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21005700');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/8CeTSmoMGm8?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c13">C13</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/g/o/godzilla_vs_1__1.jpg"
                                                                                             alt="GODZILLA VS. KONG" />
                                                <input type="hidden" value="movie-trailer-3478">
                                                <div class="feature_film_content">
                                                    <h3>GODZILLA VS. KONG</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/godzilla-kong.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21003100');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/yFpuUGFS1Kg?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c18">C18</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/m/o/mortal_kombat_-_vn_-_payoff_poster_1_1__1.jpg"
                                                                                             alt="MORTAL KOMBAT" />
                                                <input type="hidden" value="movie-trailer-3523">
                                                <div class="feature_film_content">
                                                    <h3>MORTAL KOMBAT</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/mortal-kombat.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21004200');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/Eu9G8nO5-Ug?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c18">C18</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/b/t/btdq_main_poster_1.jpg"
                                                                                             alt="EVIL EXPELLER " />
                                                <input type="hidden" value="movie-trailer-3543">
                                                <div class="feature_film_content">
                                                    <h3>EVIL EXPELLER </h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/evil-expeller.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21004400');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/OuIxS_LlnQs?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-p">p</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/r/s/rsz_main_poster_cncc_1.jpg"
                                                                                             alt="PAWN" />
                                                <input type="hidden" value="movie-trailer-3023">
                                                <div class="feature_film_content">
                                                    <h3>PAWN</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/cuc-no-hoa-cuc-cung.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21006100');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/fZa5Cz4GJlY?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c18">C18</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/t/e/teaser_poster_1_1__1.jpg"
                                                                                             alt="PALM SPRINGS" />
                                                <input type="hidden" value="movie-trailer-3528">
                                                <div class="feature_film_content">
                                                    <h3>PALM SPRINGS</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/palm-springs.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21006200');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/99VIiRZw8P0?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c16">C16</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/m/a/main-poster_ms1_1.jpg"
                                                                                             alt="MY SPY " />
                                                <input type="hidden" value="movie-trailer-2900">
                                                <div class="feature_film_content">
                                                    <h3>MY SPY </h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/diep-vien-sieu-lay.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21006300');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/jiHzd87NpNM?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-p">p</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/m/a/main_poster_mtb_1__1.jpg"
                                                                                             alt="MAYA THE BEE 3: THE GOLDEN ORB" />
                                                <input type="hidden" value="movie-trailer-3588">
                                                <div class="feature_film_content">
                                                    <h3>MAYA THE BEE 3: THE GOLDEN ORB</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/maya-the-bee-3.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21005100');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/tQceO8GpWNU?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="poster-film film-lists item">
                                                <span class="nmovie-rating nmovie-rating-c18">C18</span>
                                                <span class="events events-49k"></span> <img class="product-img"
                                                                                             src="https://www.cgv.vn/media/catalog/product/cache/3/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/b/o/boss_level_-_payoff_poster_1__1.jpg"
                                                                                             alt="BOSS LEVEL" />
                                                <input type="hidden" value="movie-trailer-3508">
                                                <div class="feature_film_content">
                                                    <h3>BOSS LEVEL</h3>
                                                    <a title="View Details" class="button"
                                                       href="https://www.cgv.vn/en/boss-level.html">View Details</a>
                                                    <button type="button" title="Booking" class="button btn-booking"
                                                            onclick="Quickbooking('21005400');"><span><span>Booking</span></span></button>
                                                </div>
                                                <div class="play-button">
                                                    <span><span>Play</span></span>
                                                    <div style="display:none">
                                                        <span
                                                            class='movie-trailer'>https://www.youtube.com/embed/6LnHog3E59U?rel=0&showinfo=0&autoplay=1</span>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                        <span class="feature_slide_show_prev">
                                            <<< /span>
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

                                <style type="text/css">
                                    #cboxLoadedContent .quick-booking>.tabs-cgv-movie-view-date>* {
                                        padding: 20px;
                                        margin: 0px;
                                    }

                                    .slideshow-containe-movier .poster-film {
                                        top: 5px !important
                                    }
                                </style>

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
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/c/scb_cgv_240x201.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/n/9/n95_240x201.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/s/a/sacombank-cgv-240x201_1.png" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/s/hsbc_platinum-cgv_digital-poster_240x201px.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happy-new-year-240x201.png" />
                                                            </a>
                                                        </li>

                                                    </ul>
                                                    <span class="slide_home_event_prev newsoffers_prev">
                                                        <<< /span>
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
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/u/2/u22_240x201_1.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/h/a/happywednesday240x201_2.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/u/culture-240_1_1.jpg" />
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#">
                                                                <img
                                                                    src="https://www.cgv.vn/media/banner/cache/3/b58515f018eb873dafa430b6f9ae0c1e/c/g/cgv-crm-team-membership-launch-240x201_1.jpg" />
                                                            </a>
                                                        </li>

                                                    </ul>
                                                    <span class="slide_home_event_prev membercgv_prev">
                                                        <<< /span>
                                                        <span class="slide_home_event_next membercgv_next">>></span>
                                                </div>
                                            </div>
                                        </dd>


                                        <script type="text/javascript">
                                            $j(window).bind("load", function () {
                                                var width = $j(window).width();
                                                if (width >= 979) {
                                                    reinitCycle2(4);
                                                } else if (width >= 770) {
                                                    reinitCycle2(3);
                                                } else if (width >= 479) {
                                                    reinitCycle2(2);
                                                } else {
                                                    reinitCycle2(1);
                                                }
                                            });

                                            $j(window).on('resize', function () {
                                                var width = $j(window).width();
                                                if (width >= 979) {
                                                    reinitCycle2(4);
                                                } else if (width >= 770) {
                                                    reinitCycle2(3);
                                                } else if (width >= 479) {
                                                    reinitCycle2(2);
                                                } else {
                                                    reinitCycle2(1);
                                                }
                                            });

                                            function reinitCycle2(visibleSlides) {
                                                try {
                                                    $j('.newsoffers').cycle('destroy');
                                                    $j('.newsoffers').cycle({
                                                        "carouselSlideDimension": "240px",
                                                        "carouselVisible": visibleSlides,
                                                        "fx": "carousel",
                                                        "timeout": 0,
                                                        "next": ".newsoffers_next",
                                                        "prev": ".newsoffers_prev",
                                                        "slideActiveClass": "active",
                                                        "slides": "li",
                                                        "allowWrap": false,
                                                    });
                                                    $j('.membercgv').cycle('destroy');
                                                    $j('.membercgv').cycle({
                                                        "carouselSlideDimension": "240px",
                                                        "carouselVisible": visibleSlides,
                                                        "fx": "carousel",
                                                        "timeout": 0,
                                                        "next": ".membercgv_next",
                                                        "prev": ".membercgv_prev",
                                                        "slideActiveClass": "active",
                                                        "slides": "li",
                                                        "allowWrap": false,
                                                    });
                                                } catch (err) {
                                                    console.log(err.message);
                                                }
                                            }
                                        </script>
                                    </dl>
                                </div>
                                <div class="home-promotion-card">
                                    <ul class="promos">
                                        <li class="col-ad">
                                            <div class="format-border"><a
                                                    href="https://www.cgv.vn/en/newsoffer/dream-party-package/"><img alt=""
                                                                                                                 src="https://www.cgv.vn/media/wysiwyg/packages/214x245.jpg" /></a></div>
                                        </li>
                                        <li class="col-hd">
                                            <div class="format-border"><a
                                                    href="https://www.cgv.vn/default/newsoffer/u22-vn/"><img
                                                        src="https://www.cgv.vn/media/wysiwyg/2021/U22_WEB_496x247.jpg" /></a>
                                            </div>
                                        </li>
                                        <li class="col-ad">
                                            <div class="format-border"><a
                                                    href="https://www.cgv.vn/default/newsoffer/hall-rental-cgv/"
                                                    target="_blank"><img
                                                        src="https://www.cgv.vn/media/wysiwyg/2021/CGV-DIGITAL-HALL-RENTAL-214x245.png" /></a>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
                </body>

                </html>