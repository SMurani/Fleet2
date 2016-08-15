<%--
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

    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <!-- start:font awesome v4.1.0 -->
    <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css">
    <!-- start:bootstrap reset -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap-reset.css">


    <script type="text/javascript" src= "https://cdn.jsdelivr.net/momentjs/2.14.1/moment.min.js"></script>

    <link href="js/datetimepicker.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/datetimepicker.min.js"></script>

</head>

<body class="red-bg">
<div  class="text-center loginscreen animated fadeInDown">

    <h3 class="logo-name">Account not Activated</h3>

</div>

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div>

        <h2>Wait for your accounts to be Activated</h2>




        <p class="m-t"> <small>EasyFleet &copy; 2016</small> </p>
    </div>
</div>







</body>


</html>
--%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>Wait</title>

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



        <form class="form-login"  id="login-form" action="${pageContext.request.contextPath}/welcome" method="post" role="form" style="display: block;">
            <h2 class="form-login-heading">Oops!! Account not activated</h2>
            <div class="login-wrap">


                        Seems like your account is not yet activated<br/>
                        We have received your registration details and EasyFleet team is <br>
                        working to activate you.<br>
                        <br>
                        Log in Latter




                </div>

    </div>



        </form>

    </div>cd
</div>







<%-- <script src="js/login.js"></script>--%>




<!-- js placed at the end of the document so the pages load faster -->
<script src="1assets/js/jquery.js"></script>
<script src="1assets/js/bootstrap.min.js"></script>

<!--BACKSTRETCH-->
<!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
<script type="text/javascript" src="1assets/js/jquery.backstretch.min.js"></script>
<script>
    $.backstretch("1assets/img/login-bg.jpg", {speed: 500});
</script>


</body>

</html>

