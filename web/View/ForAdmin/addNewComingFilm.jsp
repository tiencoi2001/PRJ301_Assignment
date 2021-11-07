<%-- 
    Document   : addNewComingFilm
    Created on : Nov 7, 2021, 12:56:55 AM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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

        <style>
            body{
                background-color: #FDFCF0 !important;
            }
        </style>
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
                                    <li ><a href="accountDetail">ACCOUNT DETAILS</a></li>
                                    <li ><a href="#">MEMBERSHIP CARD</a></li>
                                    <li ><a href="#">POINT</a></li>
                                    <li ><a href="#">GIFT CARD</a></li>
                                    <li ><a href="#">Voucher</a></li>
                                    <li ><a href="#">Coupon</a></li>
                                    <li ><a href="transactionsHistory">TRANSACTIONS HISTORY</a></li>
                                    <c:if test="${sessionScope.account.role}">
                                    <li ><a href="giveAdminRights">GIVE ADMIN RIGHTS</a></li>
                                    <li ><a href="removeAdminRights">REMOVE ADMIN RIGHTS</a></li>
                                    <li ><a href="updateNewShowingFilm">UPDATE NEW SHOWING FILM</a></li>
                                    <li class="current"><a href="addNewComingFilm">ADD NEW COMING FILM</a></li>
                                    </c:if>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-main">
                    <div class="my-account"><div class="page-title">
                            <h1>Add new showing film</h1>
                        </div>
                        <c:if test="${requestScope.isUpdate}">
                            <p style="background: #FFF0F0; color: #e71a0f; margin: 0 0 1.5em; padding: 1em 1em;">
                                Update success
                            </p>
                        </c:if>   
                        <form action="addNewComingFilm" method="POST">
                            <div class="fieldset edit-account-my-cgv">
                                <ul class="form-list edit-info-cgv-left">
                                    <li class="fields">
                                        <div>
                                            <label class="required"><em>*</em>Name</label>
                                            <div class="input-box">
                                                <input type="text" required="required" name="name">
                                            </div>
                                        </div>
                                    </li>
                                    <li class="fields">
                                        <div>
                                            <label class="required"><em>*</em>Director</label>
                                            <div class="input-box">
                                                <input type="text" required="required" name="director">
                                            </div>
                                        </div>
                                    </li>
                                    <li class="fields">
                                        <div>
                                            <label class="required"><em>*</em>Cast</label>
                                            <div class="input-box">
                                                <input type="text" required="required" name="cast">
                                            </div>
                                        </div>
                                    </li>
                                    <li class="fields">
                                        <div>
                                            <label class="required"><em>*</em>Genre</label>
                                            <div class="input-box">
                                                <input type="text" required="required" name="genre">
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                                <ul class="form-list edit-info-cgv-right">
                                    <li>
                                        <label class="required"><em>*</em>Language</label>
                                        <div class="input-box">
                                            <input type="text" required="required" name="language"/>
                                        </div>
                                    </li>
                                    <li>
                                        <label class="required"><em>*</em>Image</label>
                                        <div class="input-box">
                                            <input type="text" required="required" name="image"/>
                                        </div>
                                    </li>
                                    <li>
                                        <label class="required"><em>*</em>Detail</label>
                                        <div class="input-box">
                                            <textarea rows="4.5" required="required" name="detail"></textarea>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="cgv-option-info">
                                <h3></h3>		
                            </div>
                            <div class="my-cgv-withdraw-save">
                                <div class="buttons-set cgv-edit-btn">
                                    <button type="submit" title="Save" class="button"><span><span>Save</span></span></button>
                                </div>
                                <p class="required">* Required field</p>
                                <span id="error-validate"></span>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>
