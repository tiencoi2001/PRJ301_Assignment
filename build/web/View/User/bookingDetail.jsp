<%-- 
    Document   : bookingDetail
    Created on : Oct 20, 2021, 4:06:25 PM
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

        <link href="${pageContext.request.contextPath}/css/bookingDetailStyle.css" rel="stylesheet" type="text/css">
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
                        <div class="my-account"><div class="page-title title-buttons">
                                <h1>Booking Number #696302230 - Complete</h1>
                            </div>
                            <div class="info-invoice-order">
                                <p class="order-date">Order Date: February 12, 2021</p>
                                <div class="col2-set order-info-box">
                                    <div class="col-1">
                                        <div class="box">
                                            <h2>Billing Address</h2>
                                            <div class="box-content">
                                                <address>Nguyễn Thị Minh Thảo<br/>

                                                    Hà Nội Quận Đống Đa<br />



                                                    Quận Đống Đa,  Hà Nội, 80000<br/>
                                                    Vietnam<br/>
                                                    T: 0886089019

                                                </address>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="cate-order-invoice">
                                <dl class="order-info">
                                    <dd>
                                        <ul id="order-info-tabs">
                                            <li class="current"><span class="orderinfo">Order Information</span></li>
                                        </ul>
                                        <script type="text/javascript">decorateGeneric($('order-info-tabs').select('LI'), ['first', 'last']);</script>
                                    </dd>
                                </dl>
                            </div>
                            <div class="order-items order-details">
                                <h2 class="table-caption">Items Ordered            </h2>

                                <table class="data-table linearize-table-large" id="my-orders-table" summary="Items Ordered">
                                    <col />
                                    <col width="1" />
                                    <col width="1" />
                                    <col width="1" />
                                    <col width="1" />
                                    <thead>
                                        <tr>
                                            <th class="a-center">Product</th>
                                            <th class="a-center">Showtimes</th>
                                            <th class="a-center">Ticket(s)</th>
                                            <th class="a-center">Concession(s)</th>
                                            <th class="a-center last">Subtotal </th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <td class="a-left">
                                                <h3 class="product-name">THẦN BỊP JACK CHỘT</h3>
                                            </td>

                                            <td class="a-left">

                                                <strong>CGV Vincom Thai Nguyen</strong>
                                                <p>Cinema 1</p>
                                                <p>12/02/2021</p>
                                                <p>From 20:00 ~ To 22:32</p>
                                            </td>

                                            <td class="a-left">


                                                <strong>VIP </strong>
                                                <p>K7,K6,K5,K4</p>
                                                <p><span class="price">₫332,000.00</span></p>
                                                <br/>
                                            </td>

                                            <td class="a-left">
                                            </td>

                                            <td class="a-right last">
                                                <span class="price">₫332,000.00</span>	</td>
                                        </tr>


                                        <tr class="grand_total">
                                            <td colspan="4" class="a-right">
                                                <strong>Grand Total</strong>
                                            </td>
                                            <td class="a-right">
                                                <strong><span class="price">₫332,000.00</span></strong>
                                            </td>
                                        </tr>
                                    </tfoot>
                                </table>
                                <script type="text/javascript">decorateTable('my-orders-table', {'tbody': ['odd', 'even'], 'tbody tr': ['first', 'last']})</script>

                                <div class="buttons-set">
                                    <p class="back-link"><a href="transactionHistory"><small>&laquo; </small>Back to My Orders</a></p>
                                </div>
                            </div></div>                </div>
                    <div class="col-left sidebar"></div>
                </div>
            </div>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>
