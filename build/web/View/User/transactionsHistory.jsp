<%-- 
    Document   : transactionsHistory
    Created on : Oct 20, 2021, 12:08:07 AM
    Author     : Vu Duc Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>CGV Cinemas Vietnam</title>
        <meta name="robots" content="INDEX,FOLLOW" />
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
        <script type="text/javascript" src="https://www.cgv.vn/js/mage/captcha.js"></script>
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

        <link href="${pageContext.request.contextPath}/css/transactionHistory.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
            <div class="main-container col2-left-layout">
                <div class="main">
                    <div class="col-left sidebar col-left-first"><div class="block block-account">
                            <div class="block-title">
                                <strong><span>MY CGV</span></strong>
                            </div>
                            <div class="block-content">
                                <ul>
                                    <li ><a href="dashbroad">DASHBOARD</a></li>
                                    <li ><a href="accountDetail">ACCOUTNT DETAILS</a></li>
                                    <li ><a href="#">MEMBERSHIP CARD</a></li>
                                    <li ><a href="#">POINT</a></li>
                                    <li ><a href="#">GIFT CARD</a></li>
                                    <li ><a href="#">Voucher</a></li>
                                    <li ><a href="#">Coupon</a></li>
                                    <li class="current last"><a href="transactionsHistory">TRANSACTIONS HISTORY</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-main">
                        <div class="my-account"><div class="page-title">
                                <h1>Transactions history</h1>
                            </div>
                            <ul class="list-my-order" id="list-my-order">
                                <li class="list-my-order-detail">
                                    <div class="col2-set">
                                        <p class="status-order">
                                            <label>Booking Number : 696302230</label>
                                            <em>(Status : Complete)</em>				
                                            <em><img class="channel-icon" src="https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png" /></em>
                                        </p>

                                        <div class="col-1">
                                            <img src="https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/t/a/tazza-oneeyedjack__main_poster_1__2.jpg" alt="TAZZA: ONE EYED JACK" />
                                        </div>

                                        <div class="col-2">
                                            <p>TAZZA: ONE EYED JACK</p>
                                            <span class="icon-rating-movie icon-C18">C18</span>
                                            <p>12/02/2021</p>
                                            <p>From 20:00 PM ~ To 22:32 PM</p>
                                            <p>CGV Vincom Thai Nguyen</p>
                                            <p>
                                                Cinema 1						(K7, K6, K5, K4)					</p>
                                            <p><strong>₫332,000.00</strong></p>
                                            <div class="area-view-order">
                                                <button class="view-order" onclick="window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/56656238/'">
                                                    <span><span>View</span></span>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li class="list-my-order-detail">
                                    <div class="col2-set">
                                        <p class="status-order">
                                            <label>Booking Number : 667455864</label>
                                            <em>(Status : Complete)</em>				
                                            <em><img class="channel-icon" src="https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png" /></em>
                                        </p>

                                        <div class="col-1">
                                            <img src="https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/r/s/rsz_em_l__c_a_em-official_poster-_kc_08012021_2.jpg" alt="‘EM’ LÀ CỦA EM " />
                                        </div>

                                        <div class="col-2">
                                            <p>‘EM’ LÀ CỦA EM </p>
                                            <span class="icon-rating-movie icon-C16">C16</span>
                                            <p>17/01/2021</p>
                                            <p>From 13:15 PM ~ To 15:16 PM</p>
                                            <p>CGV Aeon Long Bien</p>
                                            <p>
                                                Cinema 2						(F7, F6)					</p>
                                            <p><strong>₫240,000.00</strong></p>
                                            <div class="area-view-order">
                                                <button class="view-order" onclick="window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/56277713/'">
                                                    <span><span>View</span></span>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li class="list-my-order-detail">
                                    <div class="col2-set">
                                        <p class="status-order">
                                            <label>Booking Number : 514184788</label>
                                            <em>(Status : Complete)</em>				
                                            <em><img class="channel-icon" src="https://www.cgv.vn/skin/frontend/cgv/default/images/bg-cgv/homepage_red.png" /></em>
                                        </p>

                                        <div class="col-1">
                                            <img src="https://www.cgv.vn/media/catalog/product/cache/3/thumbnail/160x237/2e2b8cd282892c71872b9e67d2cb5039/t/t/ttm_main-poster_2__2.jpg" alt="TIEC TRANG MAU" />
                                        </div>

                                        <div class="col-2">
                                            <p>TIEC TRANG MAU</p>
                                            <span class="icon-rating-movie icon-C18">C18</span>
                                            <p>07/12/2020</p>
                                            <p>From 19:50 PM ~ To 22:06 PM</p>
                                            <p>CGV Vincom D Capitale</p>
                                            <p>
                                                Cinema 5						(D3, D4)					</p>
                                            <p><strong>₫90,000.00</strong></p>
                                            <div class="area-view-order">
                                                <button class="view-order" onclick="window.location.href = 'https://www.cgv.vn/en/sales/order/view/order_id/54308083/'">
                                                    <span><span>View</span></span>
                                                </button>
                                            </div>
                                        </div>
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
