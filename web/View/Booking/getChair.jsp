<%-- 
    Document   : getChair
    Created on : Oct 25, 2021, 2:52:43 AM
    Author     : Vu Duc Tien
--%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi" id="top" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Booking</title>
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
        <link href="${pageContext.request.contextPath}/css/bookingStyle.css" rel="stylesheet" type="text/css">
    </head>
    <body class=" cinemas-booking-tickets">
        <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
            <div class="main-container col1-layout">
                <div class="main">            
                    <div class="col-main">
                        <div class="booking-progress">
                            <div class="page-title">
                                <h1>Booking Online</h1>
                            </div>

                            <div class="top-content">
                                <ol class="products-list" id="products-list">
                                    <li class="item">
                                        <div class="product-shop">
                                            <div class="f-fix">
                                                <div class="product-primary">
                                                    <p>CGV Vincom Thai Nguyen | ${requestScope.schedule.roomName}</p>
                                                <p>${requestScope.schedule.date} ${requestScope.schedule.slot}</p>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ol>
                        </div>

                        <div class="main-content">
                            <ul class="progress">
                                <li class="booking-step">
                                    <label class="h1">People / Seats</label>

                                    <div class="ticketbox">
                                        <div class="screen"><span class="text-screen">Cinema</span></div>

                                        <div class="row">						
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>
                                            <div class="seat empty">Q88</div>                                                
                                        </div>									
                                        <div class="row">
                                            <div class="seat seat-standard active">A1</div>
                                            <div class="seat seat-standard active">A2</div>
                                            <div class="seat seat-standard active">A3</div>
                                            <div class="seat seat-standard active">A4</div>
                                            <div class="seat seat-standard active">A5</div>
                                            <div class="seat seat-standard active">A6</div>
                                            <div class="seat seat-standard active">A7</div>
                                            <div class="seat seat-standard active">A8</div>
                                            <div class="seat seat-standard active">A9</div>
                                            <div class="seat seat-standard active">A10</div>
                                        </div>
                                        <div class="row">
                                            <div class="seat seat-standard active">B1</div>
                                            <div class="seat seat-standard active">B2</div>
                                            <div class="seat seat-standard active">B3</div>
                                            <div class="seat seat-standard active">B4</div>
                                            <div class="seat seat-standard active">B5</div>
                                            <div class="seat seat-standard active">B6</div>
                                            <div class="seat seat-standard active">B7</div>
                                            <div class="seat seat-standard active">B8</div>
                                            <div class="seat seat-standard active">B9</div>
                                            <div class="seat seat-standard active">B10</div>
                                        </div>
                                        <div class="row">
                                            <div class="seat seat-standard active">C1</div>
                                            <div class="seat seat-standard active">C2</div>
                                            <div class="seat seat-standard active">C3</div>
                                            <div class="seat seat-standard active">C4</div>
                                            <div class="seat seat-standard active">C5</div>
                                            <div class="seat seat-standard active">C6</div>
                                            <div class="seat seat-standard active">C7</div>
                                            <div class="seat seat-standard active">C8</div>
                                            <div class="seat seat-standard active">C9</div>
                                            <div class="seat seat-standard active">C10</div>
                                        </div>	
                                        <div class="row">			
                                            <div class="seat seat-vipprime active">D1</div>
                                            <div class="seat seat-vipprime active">D2</div>
                                            <div class="seat seat-vipprime active">D3</div>
                                            <div class="seat seat-vipprime active">D4</div>
                                            <div class="seat seat-vipprime active">D5</div>
                                            <div class="seat seat-vipprime active">D6</div>
                                            <div class="seat seat-vipprime active">D7</div>
                                            <div class="seat seat-vipprime active">D8</div>
                                            <div class="seat seat-vipprime active">D9</div>
                                            <div class="seat seat-vipprime active">D10</div>
                                        </div>	
                                        <div class="row">			
                                            <div class="seat seat-vipprime active">E1</div>
                                            <div class="seat seat-vipprime active">E2</div>
                                            <div class="seat seat-vipprime active">E3</div>
                                            <div class="seat seat-vipprime active">E4</div>
                                            <div class="seat seat-vipprime active">E5</div>
                                            <div class="seat seat-vipprime active">E6</div>
                                            <div class="seat seat-vipprime active">E7</div>
                                            <div class="seat seat-vipprime active">E8</div>
                                            <div class="seat seat-vipprime active">E9</div>
                                            <div class="seat seat-vipprime active">E10</div>
                                        </div>	
                                        <div class="row">			
                                            <div class="seat seat-vipprime active">F1</div>
                                            <div class="seat seat-vipprime active">F2</div>
                                            <div class="seat seat-vipprime active">F3</div>
                                            <div class="seat seat-vipprime active">F4</div>
                                            <div class="seat seat-vipprime active">F5</div>
                                            <div class="seat seat-vipprime active">F6</div>
                                            <div class="seat seat-vipprime active">F7</div>
                                            <div class="seat seat-vipprime active">F8</div>
                                            <div class="seat seat-vipprime active">F9</div>
                                            <div class="seat seat-vipprime active">F10</div>
                                        </div>
                                        <div class="row">				
                                            <div class="seat seat-vipprime active">G1</div>
                                            <div class="seat seat-vipprime active">G2</div>
                                            <div class="seat seat-vipprime active">G3</div>
                                            <div class="seat seat-vipprime active">G4</div>
                                            <div class="seat seat-vipprime active">G5</div>
                                            <div class="seat seat-vipprime active">G6</div>
                                            <div class="seat seat-vipprime active">G7</div>
                                            <div class="seat seat-vipprime active">G8</div>
                                            <div class="seat seat-vipprime active">G9</div>
                                            <div class="seat seat-vipprime active">G10</div>
                                        </div>	
                                        <div class="row">			
                                            <div class="seat seat-vipprime active">H1</div>
                                            <div class="seat seat-vipprime active">H2</div>
                                            <div class="seat seat-vipprime active">H3</div>
                                            <div class="seat seat-vipprime active">H4</div>
                                            <div class="seat seat-vipprime active">H5</div>
                                            <div class="seat seat-vipprime active">H6</div>
                                            <div class="seat seat-vipprime active">H7</div>
                                            <div class="seat seat-vipprime active">H8</div>
                                            <div class="seat seat-vipprime active">H9</div>
                                            <div class="seat seat-vipprime active">H10</div>
                                        </div>	
                                        <div class="row">				
                                            <div class="seat seat-vipprime active">I1</div>
                                            <div class="seat seat-vipprime active">I2</div>
                                            <div class="seat seat-vipprime active">I3</div>
                                            <div class="seat seat-vipprime active">I4</div>
                                            <div class="seat seat-vipprime active">I5</div>
                                            <div class="seat seat-vipprime active">I6</div>
                                            <div class="seat seat-vipprime active">I7</div>
                                            <div class="seat seat-vipprime active">I8</div>
                                            <div class="seat seat-vipprime active">I9</div>
                                            <div class="seat seat-vipprime active">I10</div>
                                        </div>	
                                    </div>
                                </li>
                            </ul>
                        </div>

                                            <div class="bottom-content">
                            <div class="format-bg-top"></div>

                            <div class="minicart-wrapper" style="margin-left: 10%">
                                <ul>
                                    <li class="item first" xmlns="http://www.w3.org/1999/html">
                                        <div class="product-details">
                                            <table class="info-wrapper">
                                                <colgroup>
                                                    <col width="40%"/>
                                                    <col/>
                                                </colgroup>
                                                <tbody>
                                                    <tr>
                                                        <td>
                                                            <img src="${requestScope.film.image}" alt="${requestScope.film.name}" />
                                                        </td>									
                                                        <td>
                                                            <table class="info-wrapper">
                                                                <tr><td class="label">${requestScope.film.name}</td></tr>
                                                                <tr><td class="label">2D</td></tr>
                                                                <tr><td class="label">${requestScope.film.note}</td></tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </li>

                                    <li class="item" xmlns="http://www.w3.org/1999/html">
                                        <div class="product-details">
                                            <table class="info-wrapper">							
                                                <tbody>
                                                    <tr>
                                                        <td class="label">Theater</td>
                                                        <td>CGV Vincom Thai Nguyen</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="label">Showtime</td>
                                                        <td>
                                                            ${requestScope.schedule.slot}, ${requestScope.schedule.date}</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="label">Screen</td>
                                                        <td>${requestScope.schedule.roomName}</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </li>

                                    <li class="item" xmlns="http://www.w3.org/1999/html">
                                        <div class="product-details">
                                            <form action="payment" method="POST">
                                                <input type="hidden" name="id" value="${requestScope.id}"/>
                                                <input type="hidden" name="date" value="${requestScope.date}"/>
                                                <input type="hidden" name="slot" value="${requestScope.slot}"/>
                                                <label>Select chair:</label><select name="chairID">
                                                    <c:forEach items="${requestScope.chairs}" var="chair">
                                                        <option value="${chair.chairID}">${chair.name}</option>
                                                    </c:forEach>
                                                </select>
                                                <button type="submit" title="Book" class="button btn-booking">
                                                    <span><span>Book</span></span>
                                                </button>
                                            </form>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="format-bg-bottom"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
    </body>
</html>


