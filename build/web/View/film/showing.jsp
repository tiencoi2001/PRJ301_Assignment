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
        <style>
            body{
                background-color: #FDFCF0 !important;
            }
        </style>
        <link href="${pageContext.request.contextPath}/css/listStyle.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <!-- Header-->
        <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
            <!-- Section-->
            <div class="main-container col1-layout">
                <div class="breadcrumbs" itemprop="breadcrumb">
                    <ul>
                        <li class="home">
                            <a href="home" title="Go to Home Page">Home</a>
                            <span>/ </span>
                        </li>
                        <li class="category5">
                            <strong>Now Showing</strong>
                        </li>
                    </ul>
                </div>
                <div class="main-container col1-layout">
                    <div class="main">            
                        <div class="col-main">
                            <div class="page-title category-title">
                                <h1>Now Showing</h1>
                                <div class="sub-category">
                                    <ul>
                                        <li>
                                            <a href="https://www.cgv.vn/default/movies/coming-soon-1.html">Coming Soon</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="dropdown-sub-category">
                                    <div id="myDropdown" class="dropdown-content">
                                        <a href="https://www.cgv.vn/default/movies/coming-soon-1.html">Coming Soon</a>
                                    </div>
                                </div>		
                            </div>
                            <div class="category-products cgv-movies">
                                <ul class="products-grid products-grid--max-4-col">
                                <c:forEach items="${requestScope.films}" var="f">
                                    <li class="film-lists item last">
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
                                              ">${f.note}</span>
                                        <div class="ribon position-1"></div>
                                        <div class="product-images">
                                            <a href="detail?id=${f.id}" class="product-image">
                                                <img class="card-image" src="${f.image}" alt="${f.name}" />
                                            </a>

                                            <div class="movie-technology">
                                            </div>
                                        </div>

                                        <div class="product-info">
                                            <h2 class="product-name"><a class="card-name" href="detail?id=${f.id}">${f.name}</a></h2>

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
                                                <button type="button" title="Booking" class="button btn-booking"><span><span>Booking</span></span></button>
                                            </li>
                                        </ul>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Footer-->
            <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>

