<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>EasyFleet | Login</title>

    <link href="loginCss/css/bootstrap.min.css" rel="stylesheet">
    <link href="loginCss/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="loginCss/css/animate.css" rel="stylesheet">
    <link href="loginCss/css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">
        <div  class="text-center loginscreen animated fadeInDown">

            <h3 class="logo-name">EasyFleet</h3>

        </div>

    <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>

            <h3>Welcome to EasyFleet</h3>

            <p>Login in</p>
            <%--<form class="m-t" role="form" action="http://webapplayers.com/inspinia_admin-v2.5/index.html">--%>
            <form id="login-form" action="${pageContext.request.contextPath}/welcome" method="post" role="form" style="display: block;">
                <div class="form-group">
                    <input type="text" class="form-control" name="username" id="username" tabindex="1"  placeholder="Username" value="" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" id="password" tabindex="2"  placeholder="Password" required="">
                </div>
               <%-- <button type="submit" class="btn btn-primary block full-width m-b">Login</button>--%>

                <div class="form-group">

                        <div >
                            <input type="submit" class="btn btn-primary block full-width m-b" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-register" value="Login">


                        </div>

                </div>
                <div id="login-ajax-content" class="well" style="background-color: #FFF; border: 0px">
                </div>

                <a href="#"><small>Forgot password?</small></a>
                <p class="text-muted text-center"><small>Do not have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.jsp">Create an account</a>
            </form>
            <p class="m-t"> <small>EasyFleet &copy; 2016</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>

        <script src="js/app/person.js"></script>



        <script src="js/login.js"></script>

</body>


<!-- Mirrored from webapplayers.com/inspinia_admin-v2.5/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 09 Jul 2016 07:59:25 GMT -->
</html>
