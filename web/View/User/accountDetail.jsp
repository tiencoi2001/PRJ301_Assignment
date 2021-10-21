<%-- 
    Document   : accountDetail
    Created on : Oct 19, 2021, 11:21:57 PM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        
        <link href="${pageContext.request.contextPath}/css/accountDetailStyle.css" rel="stylesheet" type="text/css">
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
                                    <li class="current"><a href="accountDetail">ACCOUTNT DETAILS</a></li>
                                    <li ><a href="#">MEMBERSHIP CARD</a></li>
                                    <li ><a href="#">POINT</a></li>
                                    <li ><a href="#">GIFT CARD</a></li>
                                    <li ><a href="#">Voucher</a></li>
                                    <li ><a href="#">Coupon</a></li>
                                    <li class="last"><a href="transactionsHistory">TRANSACTIONS HISTORY</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-main">
                        <div class="my-account"><div class="page-title">
                                <h1>Edit Account Detail</h1>
                            </div>
                            <form action="accountDetail" method="POST" autocomplete="off" id="form-validate" class="scaffold-form cgv-edit-account" enctype="multipart/form-data">
                                <div class="fieldset edit-account-my-cgv">
                                    <input type="hidden" name="oldphone" id="oldphone" value="${requestScope.accountDetail.phone}" />
                                <input type="hidden" name="oldemail" id="oldemail" value="${requestScope.accountDetail.email}" />
                                    <ul class="form-list edit-info-cgv-left">
                                        <li class="fields">
                                            <div class="customer-name">
                                                <label for="fullname" class="required"><em>*</em>Name</label>
                                                <div class="input-box">
                                                    <input type="text" id="fullname" name="name" value="${requestScope.accountDetail.name}" title="" placeholder="" maxlength="255" class="input-text required-entry"  />
                                                </div>
                                            </div>
                                        </li>
                                        <li class="fields phone_user">
                                            <label for="telephone" class="required"><em>*</em>Telephone</label>
                                            <div class="input-box">
                                                <input type="tel" autocapitalize="off" autocorrect="off" name="phone" id="telephone" value="${requestScope.accountDetail.phone}" title="Phone Number" class="input-text validate-mobile required-entry" />
                                            </div>
                                        </li>
                                        <li >
                                            <label for="gender" class="required"><em>*</em>Gender</label>
                                            <div class="input-box">
                                                <input type="radio" name="gender" value="Male" ${requestScope.accountDetail.gender ? "checked=\"checked\"":""}>Male
                                                <input type="radio" name="gender" value="Female" ${!requestScope.accountDetail.gender ? "checked=\"checked\"":""}>Female
                                            </div>
                                        </li>
                                        <li>					<label for="month">Date of Birth</label>
                                            <div class="input-box customer-dob">${requestScope.accountDetail.dob}</div>
                                        </li>
                                        <li>
                                            <label for="email" class="required"><em>*</em>Email Address</label>
                                            <div class="input-box">${requestScope.accountDetail.email}</div>
                                        </li>
                                    </ul>						
                                    <ul class="form-list edit-info-cgv-right">
                                        <li class="wide">
                                            <label for="street_1" class="required"><em>*</em>Address</label>
                                            <div class="input-box">
                                                <input type="text" name="address" value="${requestScope.accountDetail.address}" title="Address" id="street_1" class="input-text  required-entry" />
                                            </div>
                                        </li>			
                                        <li>
                                            <label for="current_password" class="required"><em>*</em>Password</label>
                                            <div class="input-box">
                                                <input type="text" class="input-text no-display" name="dummy" id="dummy" />
                                                <input type="password" title="Current Password" class="input-text required-entry" name="password" id="current_password" />
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="cgv-option-info">
                                    <h3>Optional Information</h3>		
                                </div>
                                <div class="my-cgv-withdraw-save">
                                    <div class="buttons-set cgv-edit-btn">
                                        <button type="submit" title="Save" class="button"><span><span>Save</span></span></button>
                                    </div>
                                </div>
                                <p class="required">* Required field</p>
                                <span id="error-validate"></span>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>
