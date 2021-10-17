<%-- 
    Document   : register
    Created on : Oct 8, 2021, 12:56:41 AM
    Author     : Vu Duc Tien
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<link href="${pageContext.request.contextPath}/css/registerStyle.css" rel="stylesheet" type="text/css">
<!------ Include the above in your HEAD tag ---------->
<html>
    <body>
        <div>
            <!-- Header-->
            <jsp:include page="../Header_Footer/header.jsp"></jsp:include>
                <div class="container">
                    <form class="form-horizontal" role="form" action="register" method="POST">
                        <h2>Registration</h2>
                        <div class="form-group">
                            <label for="name" class="col-sm-3 control-label">Name*</label>
                            <div class="col-sm-9">
                                <input name="name" type="text" id="name" placeholder="Name" class="form-control" autofocus>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="phone" class="col-sm-3 control-label">Phone number*</label>
                            <div class="col-sm-9">
                                <input name="phone" type="text" id="phoneNumber" placeholder="Phone number" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-sm-3 control-label">Email*</label>
                            <div class="col-sm-9">
                                <input name= "email" type="email" id="email" placeholder="Email" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-3 control-label">Password*</label>
                            <div class="col-sm-9">
                                <input name="pass" type="password" id="password" placeholder="Password" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                            <div class="col-sm-9">
                                <input name="dob" type="date" id="birthDate" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Gender</label>
                            <div class="col-sm-6">
                                <div class="row">
                                    <div class="col-sm-4">
                                        <label class="radio-inline">
                                            <input name="gender" type="radio" id="maleRadio" value="Male">Male
                                        </label>
                                    </div>
                                    <div class="col-sm-4">
                                        <label class="radio-inline">
                                            <input name="gender" type="radio" id="femaleRadio" value="Female">Female
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div> 
                        <div class="form-group">
                            <label for="address" class="col-sm-3 control-label">Address*</label>
                            <div class="col-sm-9">
                                <input name="address" type="text" id="address" placeholder="Address" class="form-control">
                            </div>
                        </div><!-- /.form-group -->
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </form>
                </div>
                <!-- Footer-->
            <jsp:include page="../Header_Footer/footer.jsp"></jsp:include>
        </div>
    </body>
</html>