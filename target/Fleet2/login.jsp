<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
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



            <form class="form-login"  id="login-form" action="${pageContext.request.contextPath}/autostars" method="post" role="form" style="display: block;">
		        <h2 class="form-login-heading">sign in now</h2>
		        <div class="login-wrap">

                    <input type="text" class="form-control" name="username" id="username" tabindex="1"  placeholder="Username" autofocus value="" required="">
		            <br>

                    <input type="password" class="form-control" name="password" id="password" tabindex="2"  placeholder="Password" required="">
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="#myModal"> Forgot Password?</a>
		
		                </span>
		            </label>
                    <button class="btn btn-theme btn-block"  name="login-submit" id="login-submit" type="submit"><i class="fa fa-lock"></i> SIGN IN</button>

                    <br>
                    <label id="login-ajax-content" class="text-danger"></label>



					<div class="registration">
		                Don't have an account yet?<br/>
		                <a class="" href="register.jsp">
		                    Create an account
		                </a>
		            </div>
		
		        </div>
		
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button">Submit</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
		      </form>	  	
	  	
	  	</div>
	  </div>



      <script src="js/app/person.js"></script>



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
