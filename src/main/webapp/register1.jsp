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
                <form class="m-t" id="validate2" action="#" method="post" role="form">


                   <%-- <div class="form-group">
                        <input type="text" name="fname" required="" id="regfname" tabindex="1" class="form-control" placeholder="First Name" value="">
                    </div>
                    <div class="form-group">
                        <input type="text" name="lname" required="" id="reglname" tabindex="1" class="form-control" placeholder="Last Name" value="">
                    </div>
                    <div class="form-group">
                        <input type="number" name="id" required="" id="regid" tabindex="1" class="form-control" placeholder="ID/Passport" value="">
                    </div>--%>

                    <div class="form-group">
                        <label>First Name:</label>
                        <input type="text" class="form-control" name="login" id="regfname" required="required">

                        <label id="fname-ajax-content" class="text-danger"></label>


                    </div>
                       <div class="form-group">
                           <label>Last Name:</label>
                           <input type="text" class="form-control" name="login" id="reglname">
                           <label id="lname-ajax-content" class="text-danger"></label>
                       </div>
                       <div class="form-group">
                           <label>Phone Number:</label>
                           <input type="text" class="form-control" name="login" id="regid">
                           <label id="iname-ajax-content" class="text-danger"></label>
                       </div>
                       <div class="form-group">
                           <label>E-mail:</label>
                           <input type="text" value="" name="email" class="form-control">
                       </div>

                       <div class="form-group">
                           <label>Username:</label>
                           <input type="text" class="form-control" name="login" id="regusername">
                           <label id="uname-ajax-content" class="text-danger"></label>
                       </div>
                       <div class="form-group">
                           <label>Password:</label>
                           <input type="password" class="form-control" name="password" id="regpassword">
                           <label id="ppname-ajax-content" class="text-danger" class="text-danger"></label>
                       </div>
                       <div class="form-group">
                           <label>Confirm Password:</label>
                           <input type="password" class="form-control"  id="regconfirmpass">
                           <label id="pname-ajax-content" class="text-danger"></label>

                       </div>
                    <label id="register-ajax-content"></label>

                      <%-- <div class="form-group">
                           <label class="strong">Phone Number</label>
                           <input type="text" id="inputmask-phone" class="form-control span8" placeholder="(123) 456-7890">
                           <span class="help-block">(254) 724-5737</span>
                           <div class="separator bottom"></div>
                       </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" class="form-control" name="password">
                    </div>
                    <div class="form-group">
                        <label>Confirm Password:</label>
                        <input type="password" class="form-control" name="re-password">
                    </div>
                    <div class="form-group">
                        <label>E-mail:</label>
                        <input type="text" value="" name="email" class="form-control">
                    </div>--%>



                   <%-- <div class="form-group">
                        <input type="email" class="form-control" required="" placeholder="Email">
                    </div>

                    <div class="form-group">
                        <input type="text" name="username" required="" id="regusername" tabindex="1" class="form-control" placeholder="Username" value="">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" required="" id="regpassword" tabindex="2" class="form-control" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="password" name="confpass" required="" id="regconfirmpass" tabindex="2" class="form-control" placeholder="Confirm Password"><br>
                        </label><label id="register-ajax-content"></label>
                    </div>--%>

                <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Agree the terms and policy </label></div>

                </div>

                <div class="form-group">
                    <div class="row">
                        <div>

                            <a class="btn btn-success block full-width m-b" onclick="person.save()">Register</a>

                        </div>
                    </div>
                </div>

                       <label id="successful-ajax-content" class="well col-sm-6 col-sm-offset-3" style="background-color:#fbf4eb; border: 0px"></label>

                <p class="text-muted text-center"><small>Already have an account?</small></p>

                       <div class="form-group">
                           <div class="row">
                               <div>
                                   <a class="btn btn-ptimary block full-width m-b" href="login.jsp">Login</a>

                               </div>
                           </div>
                       </div>


            </form>

           <%-- <form id="validate4" action="#" method="post" role="form">
                <div class="form-group">
                    <label>First Name: </label>
                    <input type="text" name="login" class="form-control" id="regfname">
                </div>
                <div class="form-group">
                    <label>Last Name: </label>
                    <input type="text" name="login" class="form-control" id="reglname">
                </div>
                <div class="form-group">
                    <label class="strong">Phone Number</label>
                    <input type="text" id="inputmask-phone" class="form-control span8" placeholder="(123) 456-7890">
                    <span class="help-block">(254) 724-5737</span>
                    <div class="separator bottom"></div>
                </div>
                <div class="form-group">
                    <label>Email Address: </label>
                    <input type="text" name="email" class="form-control">
                </div>
                <div class="form-group">
                    <label> Username: </label>
                    <input type="text" name="login" class="form-control">
                </div>

                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" class="form-control" name="password" id="password2">
                </div>
                <div class="form-group">
                    <label>Confirm Password:</label>
                    <input type="password" class="form-control" name="re-password">
                </div>


                <div class="panel-footer clearfix">
                    <div class="pull-right">
                        <button class="btn btn-success" type="submit" onclick="person.save()">Submit</button>
                    </div>
                </div>

            </form>



            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">

                            </div>
                            <div class="panel-body">
                                <form id="validate3">

                                    <div class="form-group">
                                        <input type="text" name="login" required="" id="regfname1" tabindex="1" class="form-control" placeholder="First Name" value="">
                                    </div>

                                    <div class="form-group">
                                        <label>Login:</label>
                                        <input type="text" class="form-control" name="login">
                                    </div>
                                    <div class="form-group">
                                        <label>Password:</label>
                                        <input type="password" class="form-control" name="password" id="password2">
                                    </div>
                                    <div class="form-group">
                                        <label>Confirm Password:</label>
                                        <input type="password" class="form-control" name="re-password">
                                    </div>
                                    <div class="form-group">
                                        <label>E-mail:</label>
                                        <input type="text" value="" name="email" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>Age:</label>
                                        <input type="text" class="form-control" name="age">
                                    </div>
                                    <div class="form-group">
                                        <label>Gender:</label>
                                        <div class="radio radio-info radio-inline">
                                            <input type="radio" id="inlineRadio1" value="option1" name="radioInline" checked="">
                                            <label for="inlineRadio1"> Male </label>
                                        </div>
                                        <div class="radio radio-info radio-inline">
                                            <input type="radio" id="inlineRadio1" value="option1" name="radioInline">
                                            <label for="inlineRadio1"> Female </label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="checkbox checkbox-info">
                                            <input id="checkbox4" type="checkbox">
                                            <label for="checkbox4">
                                                Please send me news
                                            </label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Date of birth:</label>
                                        <input type="text" class="form-control datepicker hasDatepicker" name="date" id="dp1391289236354">
                                    </div>

                            </div>
                            <div class="panel-footer clearfix">
                                <div class="pull-right">
                                    <button class="btn btn-success" type="submit">Submit</button>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <p class="m-t"> <small>EasyFleet &copy; 2016</small> </p>
        </div>
    </div>--%>

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

        <%--<script src="js3/plugins/jquery.validate/jquery.validate.min.js"></script>
        <script src="js3/plugins/jquery.inputmask/jquery.inputmask.bundle.min.js"></script>
        <script src="js3/demo/validation.js"></script>--%>



        <script src="js3/jquery-2.1.4.min.js"></script>


        <script src="../../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>




        <script src="js3/plugins/jquery.validate/jquery.validate.min.js"></script>
        <script src="js3/plugins/jquery.inputmask/jquery.inputmask.bundle.min.js"></script>
        <script src="js3/demo/validation.js"></script>
</body>

</html>
