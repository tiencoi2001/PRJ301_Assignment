<%-- 
    Document   : payment
    Created on : Nov 1, 2021, 4:52:32 PM
    Author     : Vu Duc Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Payment</title>
        <link rel="canonical" href="https://www.cgv.vn/default/cinemas/booking/tickets/site/044/seq/6165530/dy/20211027" />
        <link rel="shortcut icon" href="https://www.cgv.vn/media/favicon/default/cgvcinemas-vietnam-favicon.ico" type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/base/default/aw_blog/css/style.css" media="all" />
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
        <script type="text/javascript" src="https://www.cgv.vn/js/varien/weee.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/modernizr.custom.min.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/selectivizr.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/matchMedia.addListener.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/enquire.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/cgv.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/app.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.min.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.swipe.min.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/jquery.cycle2.carousel.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/slideshow.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/lib/imagesloaded.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/scripts.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/minicart.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/default/js/jquery.colorbox.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/catalogevent.js"></script>
        <script type="text/javascript" src="https://www.cgv.vn/skin/frontend/cgv/enterprise/js/enterprise/wishlist.js"></script>
        <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Raleway:300,400,500,700,600" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/enterprise/css/enterprise.css" media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/styles.css" media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/colorbox.css" media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/madisonisland.css" media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/g-erp-cgv.css" media="all" />
        <link rel="stylesheet" type="text/css" href="https://www.cgv.vn/skin/frontend/cgv/default/css/custom-cgv.css" media="all" />
        <meta name="viewport" content="initial-scale=1.0, width=device-width" />
        <script src='//cdnt.netcoresmartech.com/smartechclient.js'></script>
        <script src="https://www.gstatic.com/firebasejs/8.2.1/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.2.1/firebase-messaging.js"></script>
        <script src='https://www.cgv.vn/mto.js'></script>
        <link href="${pageContext.request.contextPath}/css/paymentStyle.css" rel="stylesheet" type="text/css">
    </head>
    <body class="cinox-sales-payment">
        <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
            <div class="page">
                <div class="main-container col1-layout">
                    <div class="main">            
                        <div class="col-main">
                            <div class="page-title">
                                <h1>Payment</h1>
                            </div>
                            <div class="col2">																		
                                <div class="col-2 width-30">		
                                    <div id="cart-sidebar" class="cart-sidebar">
                                        <div id="cart-items" class="cart-items">
                                            <table class="data-table">
                                                <thead>
                                                    <tr>
                                                        <td colspan="2">Total Payment</td>
                                                    </tr>
                                                </thead>

                                                <tbody>
                                                    <tr>
                                                        <td>STD</td>
                                                        <td><span class="price">₫${requestScope.chair.price}.00</span></td>
                                                </tr>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <td colspan="2"><span class="price">₫${requestScope.chair.price}.00</span></td>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                    <div id="chosen-payment" class="chosen-payment">
                                        <table class="data-table">
                                            <thead>
                                                <tr>
                                                    <td colspan="2">Payment </td>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <td colspan="2"><span class="price">₫${requestScope.chair.price}.00</span></td>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="content-bottom cgv-bottom">
                            <div class="payment-content-format">
                                <div class="format-bg-seatmap-top"><p>background</p></div>
                                <div class="film-info-ticket">
                                    <div class="film-cart-info" style="margin: 0 5%">
                                        <div class="film-image">
                                            <img src="${requestScope.film.image}" alt="${requestScope.film.name}"> 
                                        </div>
                                        <div class="film-info">
                                            <h2 class="product-name">${requestScope.film.name}</h2>
                                            <span class="film-attribute">2D</span>
                                            <span class="film-grade">${requestScope.film.note}</span>
                                        </div>
                                        <div class="film-session">					
                                            <span class="film-session-site">
                                                <label>Theater</label>CGV Vincom Thai Nguyen</span>						
                                            <span class="film-session-date">
                                                <label>Showtimes</label>${requestScope.trf.slot}, ${requestScope.trf.date}</span>
                                            <span class="film-session-screen">
                                                <label>Screen</label>${requestScope.trf.roomName}</span>
                                            <span class="film-session-seats">
                                                <label>Seats</label>
                                                <span>STD : ${requestScope.chair.name}</span>
                                            </span>
                                        </div>

                                        <div class="select-seats">
                                            <span class="seats-subtotal">
                                                <label>Ticket Price</label>
                                                <span class="pricedata"><span class="price">₫${requestScope.chair.price}.00</span></span>
                                            </span>
                                            <span class="session-grandtotal">
                                                <label>Total</label>
                                                <span class="lastprice"><span class="price">₫${requestScope.chair.price}.00</span></span>
                                            </span>
                                        </div>
                                    </div>

                                    <div class="ticket-process-right">
                                        <form action="finishBooking" method="POST">
                                            <input type="hidden" name="filmID" value="${requestScope.trf.filmID}"/>
                                            <input type="hidden" name="roomID" value="${requestScope.trf.roomID}"/>
                                            <input type="hidden" name="timeID" value="${requestScope.trf.timeID}"/>
                                            <input type="hidden" name="date" value="${requestScope.trf.date}"/>
                                            <input type="hidden" name="chairID" value="${requestScope.chair.chairID}"/>
                                            <input type="hidden" name="type" value="${requestScope.chair.type}"/>
                                            <input type="hidden" name="price" value="${requestScope.chair.price}"/>
                                            <button type="submit" title="Proceed to Checkout" class="button btn-proceed-checkout btn-checkout" name="process">
                                                <span><span>Proceed tocheckout</span></span>
                                            </button>
                                        </form>
                                    </div>
                                </div>

                                <div class="format-bg-seatmap-bottom"><p>background</p></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>
