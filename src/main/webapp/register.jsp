<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>EasyFleet | Register</title>

    <link href="loginCss/css/bootstrap.min.css" rel="stylesheet">
    <link href="loginCss/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="loginCss/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="loginCss/css/animate.css" rel="stylesheet">
    <link href="loginCss/css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">
        <div  class="text-center loginscreen animated fadeInDown">

           <%-- <h6 class="logo-name">EasyFleet</h6>--%>

        </div>

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>

            <h3>Register to EasyFleet</h3>
            <p>Create account toexperience EasyFleet App</p>
           <%-- <form class="m-t" role="form" action="http://webapplayers.com/inspinia_admin-v2.5/login.html">--%>
                <form class="m-t" id="register-form" action="#" method="post" role="form">
<%--                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Name" required="">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="Email" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" required="">
                </div>--%>


                    <div class="form-group">
                        <input type="text" name="fname" required id="regfname" tabindex="1" class="form-control" placeholder="First Name" value="">
                    </div>
                    <div class="form-group">
                        <input type="text" name="lname" required id="reglname" tabindex="1" class="form-control" placeholder="Last Name" value="">
                    </div>
                    <div class="form-group">
                        <input type="number" name="id" required id="regid" tabindex="1" class="form-control" placeholder="ID/Passport" value="">
                    </div>

                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Email">
                    </div>

                    <div class="form-group">
                        <input type="text" name="username" required id="regusername" tabindex="1" class="form-control" placeholder="Username" value="">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" required id="regpassword" tabindex="2" class="form-control" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="password" name="confpass" required id="regconfirmpass" tabindex="2" class="form-control" placeholder="Confirm Password"><br>
                        </label><label id="register-ajax-content"></label>
                    </div>

                <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Agree the terms and policy </label></div>

                </div>
               <%-- <button type="submit" class="btn btn-primary block full-width m-b">Register</button>--%>

                <div class="form-group">
                    <div class="row">
                        <div>

                            <a class="btn btn-primary block full-width m-b" onclick="person.save()">Register</a>

                        </div>
                    </div>
                </div>

                <p class="text-muted text-center"><small>Already have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="login.jsp">Login</a>
                    <%--<div id="register-ajax-content" class="well col-sm-6 col-sm-offset-3" style="background-color: #FFF; border: 0px">


                    </div>--%>
            </form>
            <p class="m-t"> <small>EasyFleet &copy; 2016</small> </p>
        </div>
    </div>

        <script src="js/app/person.js"></script>


    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>
</body>

</html>
