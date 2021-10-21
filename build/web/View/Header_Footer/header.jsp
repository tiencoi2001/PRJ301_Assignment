<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="header-language-background">
    <div class="header-container">
        <div class="header-language-right">
            <div class="header-career mn-career">
                <p>
                    <a href="#">Careers </a>
                </p>
            </div>
            <div class="header-career mn-newsoffer">
                <p>
                    <a href="#">News & Offers </a>
                </p>
            </div>
            <div class="header-career mn-myticket">
                <p>
                    <a href="#">My Tickets </a>
                </p>
            </div>
            <c:if test="${sessionScope.user == null}">
                <div class="header-top-account">
                    <div class="account-header-wrapper mn-login">
                        <a href="login" class="topskip-link skip-account">
                            <span class="label">Account</span>
                        </a>
                    </div>
                </div>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <div class="header-top-account">			
                    <div class="account-header-wrapper mn-login">
                        <p class="logout-msg"><a href="dashbroad" title="My Account">Welcome, ${sessionScope.user.name}!</a> <a href="logout" title="Log Out">Log Out</a></p>
                    </div>
                </div>	
            </c:if>
        </div>
    </div>
</div>
<header id="header" class="page-header">
    <div class="page-header-container">
        <a class="logo" href="home">
            <img src="https://www.cgv.vn/skin/frontend/cgv/default/images/cgvlogo.png" alt="CGV Cinemas"
                 class="large" />
            <img src="https://www.cgv.vn/skin/frontend/cgv/default/images/cgvlogo-small.png"
                 alt="CGV Cinemas" class="small" />
        </a>
        <!-- Skip Links -->
        <div class="skip-links">
            <a href="#header-nav" class="skip-link skip-nav">
                <span class="icon"></span>
                <span class="label">Menu</span>
            </a>

            <a href="#" class="skip-myticket">
                <span class="icon"></span>
            </a>
            <div class="account-cart-wrapper">
                <a href="#" data-target-element="#header-account"
                   class="skip-link skip-account">
                    <span class="icon"></span>
                    <span class="label">Account</span>
                </a>
            </div>
        </div>
        <!-- Navigation -->
        <div id="header-nav" class="skip-content">
            <nav id="nav">
                <ol class="nav-primary">
                    <li class="level0 nav-1 first last parent"><a href="#"
                                                                  class="level0 has-children">Movies</a>
                        <ul class="level0"> 
                            <li class="level1 nav-1-1 first"><a
                                    href="showing" class="level1 ">Now Showing</a></li>
                            <li class="level1 nav-1-2 last"><a
                                    href="coming"
                                    class="level1 ">Coming Soon</a></li>
                        </ul>
                    </li>
                    <li class="level0 nav-2 parent first last">
                        <a class="level0 has-children" href="#">Theaters</a>
                        <ul class="level0">
                            <li class="level1 nav-3-1 last">
                                <a class="level1" href="#">All CGV Cinemas</a>
                            </li>
                            <li class="level1 nav-3-2 last">
                                <a class="level1"
                                   href="#">Special Cinemas</a>
                            </li>
                            <li class="level1 nav-3-3 last">
                                <a class="level1" href="#">Opening soon</a>
                            </li>
                        </ul>
                    </li>

                    <li class="level0 nav-4 parent first last">
                        <a class="level0 has-children" href="#">Membership</a>
                        <ul class="level0">
                            <li class="level1 nav-4-2 first"> 
                                <a class="level1" href="#">My
                                    CGV</a>
                            </li>
                            <li class="level1 nav-4-3 last">
                                <a class="level1" href="#">Member
                                    Benefits</a>
                            </li>
                        </ul>
                    </li>

                    <li class="level0 nav-5 parent first last">
                        <a class="level0 has-children" href="#">Cultureplex</a>
                        <ul class="level0">
                            <li class="level1 nav-5-1">
                                <a class="level1"
                                   href="#">Online
                                    Store</a>
                            </li>
                            <li class="level1 nav-5-1">
                                <a class="level1" href="#">Group Sales</a>
                            </li>
                            <li class="level1 nav-5-1">
                                <a class="level1" href="#">e-CGV</a>
                            </li>
                            <li class="level1 nav-5-1">
                                <a target="bank" class="level1"
                                   href="#">CGV Restaurant</a>
                            </li>
                            <li class="level1 nav-5-1">
                                <a class="level1" href="#">Gift Card</a>
                            </li>
                        </ul>
                    </li>
                    <li class="level0 nav-6 last">
                        <a class="level0" href="#">Careers</a>
                    </li>
                    <li class="level0 nav-6 last">
                        <a class="level0" href="#">News & Offers</a>
                    </li>
                </ol>
            </nav>

        </div>
        <!-- Search -->
        <div id="header-search" class="skip-content">

            <div class="header-search-left">
                <p class="kenhcine"><a href="#" target="_blank"><img
                            alt="Cine Channel"
                            src="https://www.cgv.vn/media/wysiwyg/2019/AUG/kenhcine.gif" /></a></p>
            </div>
            <div class="header-search-right">
                <p><a href="#"><img alt=""
                                    src="https://www.cgv.vn/media/wysiwyg/news-offers/buy_tickets.png" /></a></p>
            </div>
        </div>
        <!-- Account -->
        <div id="header-account" class="skip-content">
            <div class="links">
                <ul>
                    <li class="first"><a href="#"
                                         title="My Account">My Account</a></li>
                    <li><a href="#" title="My Cart"
                           class="top-link-cart">My Cart</a></li>
                    <li><a href="#" title="Checkout"
                           class="top-link-checkout">Checkout</a></li>
                    <li><a href="#"
                           title="Register">Register</a></li>
                    <li class=" last"><a
                            href="#"
                            title="Log In">Log In</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>