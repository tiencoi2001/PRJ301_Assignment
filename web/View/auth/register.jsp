<%-- 
    Document   : register
    Created on : Oct 8, 2021, 12:56:41 AM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Login</title>
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

        <link href="${pageContext.request.contextPath}/css/registerStyle.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div>
            <!-- Header-->
            <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
                <div class="main-container col1-layout">
                    <div class="main">            
                        <div class="col-main">
                            <div class="account-wrap">
                                <div class="col2-set">
                                    <div class="cgv-login-register-form">
                                        <div class="r-login">
                                            <h2><span id="form-login-content"><a href="login">lOGIN</a></span><span id="form-register-content" class="active">REGISTER</span></h2>
                                            <div class="cgvfc form-register-content">
                                                <form class="cgv-signup-form" id="cgv-signup-form" action="register" method="POST">
                                                    <fieldset>
                                                        <label for="r-fname">Name<span>*</span></label>
                                                        <input type="text" name="register_fullname" class="input-text required-entry" placeholder="Name" autocomplete="off">

                                                        <label for="r-phone">Phone Number<span>*</span></label>
                                                        <input type="text" name="register_phone" class="input-text required-entry" placeholder="Phone number" autocomplete="off">

                                                        <label for="r-email">Email<span>*</span></label>
                                                        <input type="text" name="register_email" class="input-text required-entry" placeholder="Email" autocomplete="off">

                                                        <label for="r-password">Password<span>*</span></label>
                                                        <input type="password" name="register_password" class="input-text required-entry" placeholder="Password" autocomplete="new-password">

                                                        <label for="r-birthday">Date of birth<span>*</span></label>
                                                        <input type="date" name="register_dob" class="input-text required-entry" placeholder="Date of birth">
                                                        <label for="r-fname" class="gender-title"><span class="sp-gender">Gender</span><span>*</span>
                                                            <input type="radio" name="register_gender" id="male-gender" value="Male"> Male
                                                            <input type="radio" name="register_gender" id="female-gender" value="Female"> Female</label>
                                                        <label for="r-city">Address<span>*</span></label>
                                                        <input type="text" name="register_address" class="input-text required-entry" placeholder="Address" autocomplete="off">
                                                    </fieldset>
                                                    <input type="submit" id="cgv-btnsignup" value="REGISTER">
                                                </form>
                                            </div>
                                            <span id="error-validate"></span>
                                            <div id="correct" style="color:gray;"></div>
                                            <div id="seconds"></div>
                                        </div>            
                                        <div class="l-login">
                                            <div id="slider-container">
                                                <div class="mySlides fade">
                                                    <img src="https://www.cgv.vn/media/wysiwyg/2020/3.jpg" />
                                                </div>
                                                <div class="mySlides fade">
                                                    <img src="https://www.cgv.vn/media/wysiwyg/2020/1.jpg" />
                                                </div>
                                                <div class="mySlides fade">
                                                    <img src="https://www.cgv.vn/media/wysiwyg/2020/2.jpg" />
                                                </div>
                                            </div>
                                            <!-- The dots/circles -->
                                            <div class="cgv-dots">
                                                <span class="dot" onclick="currentSlide(0)"></span>
                                                <span class="dot" onclick="currentSlide(1)"></span>
                                                <span class="dot" onclick="currentSlide(2)"></span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div class="banner-login-page">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <script type="text/javascript" src="${pageContext.request.contextPath}/js/registerJS.js"></script>
                        </div>
                    </div>
                </div>
                <!-- Footer-->
            <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
        </div>
    </body>
</html>