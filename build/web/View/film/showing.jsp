<%-- 
    Document   : home
    Created on : Oct 6, 2021, 11:18:21 PM
    Author     : Vu Duc Tien
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
    <body>
        <!-- Header-->
        <div class="container">
            <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
                <!-- Section-->
                <div class="category-products cgv-movies">
                    <ul class="products-grid products-grid--max-4-col">
                    <c:forEach items="${requestScope.films}" var="f">
                        <li class="film-lists item last">
                            <span class="nmovie-rating nmovie-rating-c18">f.note</span>
                            <div class="product-images">
                                <a href="https://www.cgv.vn/default/lat-mat-48h.html" class="product-image">
                                    <img src="${f.image}" alt="${f.name}" />
                                </a>

                                <div class="movie-technology">
                                </div>
                            </div>

                            <div class="product-info">
                                <h2 class="product-name"><a href="https://www.cgv.vn/default/lat-mat-48h.html">${f.name}</a></h2>

                                <div class="cgv-movie-info">
                                    <span class="cgv-info-bold">Thể loại: </span>
                                    <span class="cgv-info-normal">${f.genre}</span>
                                </div>

                                <div class="cgv-movie-info">
                                    <span class="cgv-info-bold">Thời lượng: </span>
                                    <span class="cgv-info-normal">${f.length}</span>
                                </div>

                                <div class="cgv-movie-info">
                                    <span class="cgv-info-bold">Khởi chiếu: </span>
                                    <span class="cgv-info-normal">${f.premiere}</span>
                                </div>
                            </div>

                            <ul class="add-to-links">
                                <li>
                                    <button type="button" title="Mua vé" class="button btn-booking">
                                        <span><span>Mua vé</span></span></button>
                                </li>
                            </ul>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            
            <!-- Footer-->
            <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>

