<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>EastFleet || Login Page</title>

    <!-- Bootstrap core CSS -->
    <link href="1assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="1assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="1assets/css/style.css" rel="stylesheet">
    <link href="1assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<!-- **********************************************************************************************************************************************************
MAIN CONTENT
*********************************************************************************************************************************************************** -->

<div id="login-page">
    <div class="container">



            <form class="form-login" id="validate2" action="#" method="post" role="form">
            <h2 class="form-login-heading">Sign up now</h2>
            <div class="login-wrap">

                <input type="text" class="form-control" name="username" id="regfname" tabindex="1"  placeholder="First Name" autofocus value="" required="">
                <label id="fname-ajax-content" class="text-danger"></label>
                <br>

                <input type="text" class="form-control" name="username" id="reglname" tabindex="1"  placeholder="Last Name" autofocus value="" required="">
                <label id="lname-ajax-content" class="text-danger"></label>
                <br>

                <input type="text" class="form-control" name="username" id="regid" tabindex="1"  placeholder="ID No/ Passport" autofocus value="" required="">
                <label id="iname-ajax-content" class="text-danger"></label>
                <br>

                <input type="email" class="form-control" name="username" id="email" tabindex="1"  placeholder="Email" autofocus value="" required="">
                <br>

                <input type="text" class="form-control" name="username" id="regusername" tabindex="1"  placeholder="Username" autofocus value="" required="">
                <label id="uname-ajax-content" class="text-danger"></label>
                <br>

                <input type="password" class="form-control" name="username" id="regpassword" tabindex="1"  placeholder="Password" autofocus value="" required="">
                <label id="ppname-ajax-content" class="text-danger" class="text-danger"></label>
                <br>


                <input type="password" class="form-control" name="password" id="regconfirmpass" tabindex="2"  placeholder="Confirm Password" required="">
                <label id="pname-ajax-content" class="text-danger"></label>
                <br>

                <%--<button class="btn btn-theme btn-block"  type="submit" onclick="person.save()"><i class="fa fa-lock"></i> REGISTER</button>--%>
                <div class="form-group">
                    <div class="row">
                        <div>

                            <a class="btn btn-theme btn-block" onclick="person.save()"><i class="fa fa-lock"></i> REGISTER</a>

                        </div>
                    </div>
                </div>
                <br>
                <label id="successful-ajax-content" class="text-danger"></label>
                <br>

                <div class="registration">
                     Have an account?<br/>
                    <a class="" href="login.jsp">
                        Login
                    </a>
                </div>

            </div>


        </form>

    </div>
</div>



<script src="js/app/person.js"></script>







<!-- js placed at the end of the document so the pages load faster -->
<script src="1assets/js/jquery.js"></script>
<script src="1assets/js/bootstrap.min.js"></script>

<script src="js3/plugins/jquery.validate/jquery.validate.min.js"></script>
<script src="js3/plugins/jquery.inputmask/jquery.inputmask.bundle.min.js"></script>
<script src="js3/demo/validation.js"></script>

<!--BACKSTRETCH-->
<!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
<script type="text/javascript" src="1assets/js/jquery.backstretch.min.js"></script>
<script>
    $.backstretch("1assets/img/slide4.jpg", {speed: 500});
</script>


</body>

</html>
