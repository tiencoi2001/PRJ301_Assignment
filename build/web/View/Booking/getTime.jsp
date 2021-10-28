<%-- 
    Document   : getTime
    Created on : Oct 25, 2021, 2:06:27 AM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" id="top" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Booking</title>
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
        <style>
            body{
                background-color: #FDFCF0 !important;
            }
        </style>
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
                        <li class="product">
                            <strong>${requestScope.film.name}</strong>
                    </li>
                </ul>
            </div>
            <div class="main">            
                <div class="col-main">
                    <div style="display: none;">array(0) {
                        }
                    </div>

                    <div id="messages_product_view"></div>
                    <div class="product-view">
                        <div class="product-essential">
                            <div class="page-title product-view">
                                <span class="h1">Booking</span>
                            </div>	

                            <div class="product-name-reponsive">
                                <h1>${requestScope.film.name}</h1>
                            </div>

                            <div class="product-img-box">		
                                <div class="product-image product-image-zoom">
                                    <div class="product-image-gallery">
                                        <img id="image-main"
                                             class="gallery-image visible"
                                             src="${requestScope.film.image}"
                                             alt="${requestScope.film.name}"
                                             title="${requestScope.film.name}" />
                                    </div>
                                </div>

                            </div>

                            <div class="product-shop">
                                <div class="product-name">
                                    <span class="h1">${requestScope.film.name}</span>
                                </div>

                                <!-- Build test -->
                                <div class="movie-director movie-info">
                                    <label>Director: </label>
                                    <div class="std">&nbsp ${requestScope.film.director}</div>
                                </div>			
                                <div class="movie-actress movie-info">
                                    <label>Cast:</label>
                                    <div class="std">&nbsp ${requestScope.film.starName}
                                    </div>
                                </div>			
                                <div class="movie-genre movie-info">
                                    <label>Genre: </label>
                                    <div class="std">&nbsp ${requestScope.film.genre}</div>
                                </div>
                                <div class="movie-release movie-info">
                                    <label>Release date: </label>
                                    <div class="std">&nbsp ${requestScope.film.premiere}</div>
                                </div>
                                <div class="movie-actress movie-info">
                                    <label>Running Time: </label>
                                    <c:if test="${requestScope.film.length != 0}">
                                        <div class="std">&nbsp ${requestScope.film.length}</div>
                                    </c:if>
                                </div>
                                <div class="movie-language movie-info">
                                    <label>Language: </label>
                                    <div class="std">&nbsp ${requestScope.film.language}</div>
                                </div>
                                <div class="movie-technology-icons">
                                    <c:if test="${requestScope.film.rated != null}">
                                        <span class="movie-rating-detail 
                                              <c:if test="${requestScope.film.note eq \"C18\"}">
                                                  c18
                                              </c:if>
                                              <c:if test="${requestScope.film.note eq \"C16\"}">
                                                  c16
                                              </c:if>
                                              <c:if test="${requestScope.film.note eq \"C13\"}">
                                                  c13
                                              </c:if>
                                              <c:if test="${requestScope.film.note eq \"P\"}">
                                                  p
                                              </c:if>
                                              ">Rated: ${requestScope.film.rated}
                                        </span>
                                    </c:if>
                                </div>
                                <div>
                                    <form action="booking_nextstep">
                                        Select time:<select name="slot">
                                            <c:forEach items="${requestScope.slots}" var="s">
                                                <option>${s}</option>
                                            </c:forEach>
                                        </select><br>
                                        <input type="hidden" name="date" value="${requestScope.selectedDate}">
                                        <input type="hidden" name="id" value="${requestScope.film.id}"/>
                                        <button type="submit" title="Booking" class="button btn-booking">
                                            <span><span>Next</span></span>
                                        </button>
                                    </form>
                                </div>
                            </div>
                            <div class="clearer"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer-->
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>
