<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from blacktie.co/demo/premium/dashgum/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 06 Jul 2016 04:32:26 GMT -->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link rel="shortcut icon" href="../../../../alvarez.is/demo/gridgum/dashgum/favicon.html">

    <title>Autostars Client</title>

    <!-- Bootstrap core CSS -->
    <link href="1assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="1assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="1assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="1assets/css/style.css" rel="stylesheet">
    <link href="1assets/css/style-responsive.css" rel="stylesheet">

    <script src="1assets/js/chart-master/Chart.js"></script>
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Section Starts Here -->
    <link href="1assets/js/advanced-datatable/media/css/demo_page.css" rel="stylesheet" />
    <link href="1assets/js/advanced-datatable/media/css/demo_table.css" rel="stylesheet" />
    <link rel="1assets" href="1assets/js/advanced-datatable/media/css/DT_bootstrap.css" />

    <style>
        table {
            counter-reset: rowNumber-1;
        }
        table tr {
            counter-increment: rowNumber;
        }
        table tr td:first-child::before {
            content: counter(rowNumber);
            min-width: 1em;
            margin-right: 0.5em;
        }
    </style>
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bgg" style="background-color: #00c5de">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="client.jsp" class="logo"><b>AUTOSTARS</b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
                <!--  notification start -->
                <ul class="nav top-menu">
                    <!-- settings start -->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <i class="fa fa-tasks"></i>
                            <span class="badge bg-theme">4</span>
                        </a>
                        <ul class="dropdown-menu extended tasks-bar">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 4 pending tasks</p>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">DashGum Admin Panel</div>
                                        <div class="percent">40%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Database Update</div>
                                        <div class="percent">60%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Product Development</div>
                                        <div class="percent">80%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Payments Sent</div>
                                        <div class="percent">70%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                                            <span class="sr-only">70% Complete (Important)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="external">
                                <a href="#">See All Tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- settings end -->
                    <!-- inbox dropdown start-->
                    <li id="header_inbox_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <i class="fa fa-envelope-o"></i>
                            <span class="badge bg-theme">5</span>
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 5 new messages</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="1assets/img/ui-zac.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Zac Snider</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                        Hi mate, how is everything?
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="1assets/img/ui-divya.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Divya Manian</span>
                                    <span class="time">40 mins.</span>
                                    </span>
                                    <span class="message">
                                     Hi, I need your help with this.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="1assets/img/ui-danro.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dan Rogers</span>
                                    <span class="time">2 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Love your new Dashboard.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="1assets/img/ui-sherman.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dj Sherman</span>
                                    <span class="time">4 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Please, answer asap.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">See all messages</a>
                            </li>
                        </ul>
                    </li>
                    <!-- inbox dropdown end -->
                </ul>
                <!--  notification end -->
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login.jsp">Logout</a></li>
            	</ul>
            </div>
          <div class="top-menu">
              <ul class="nav pull-right top-menu">
                  <li><h5 class="centered">
                      <%
                          if (request.getSession().getAttribute("user") != null) {
                              out.println(request.getSession()
                                      .getAttribute("user")
                                      .toString().toUpperCase());
                          }
                      %></h5></li>
              </ul>
          </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="1assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">
                      <%
                      if (request.getSession().getAttribute("user") != null) {
                      out.println(request.getSession()
                      .getAttribute("user")
                      .toString().toUpperCase());
                      }
                      %></h5>
              	  	
                  <li class="mt">
                      <a class="active" href="client.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="#"  onclick="car.listClient()">
                          <i class="fa fa-desktop"></i>
                          <span>Our Cars</span>
                      </a>

                  </li>

                  <li class="sub-menu">
                      <a href="#" onclick="car.myBookings()">
                          <i class="fa fa-cogs"></i>
                          <span>Book for a Car</span>
                      </a>

                  </li>
                  <li class="sub-menu">
                      <a href="#"  onclick="booking.UserBook()">
                          <i class="fa fa-book"></i>
                          <span>My Bookings</span>
                      </a>

                  </li>
                  <li class="sub-menu">
                      <a href="#" onclick="booking.report()">
                          <i class="fa fa-tasks"></i>
                          <span>My Profile</span>
                      </a>

                  </li>
                  <li class="sub-menu">
                      <a href="#" onclick="car.book()" >
                          <i class="fa fa-th"></i>
                          <span>Advanced Tables</span>
                      </a>

                  </li>
                  <li>
                      <a  href="inbox.html">
                          <i class="fa fa-envelope"></i>
                          <span>Mail </span>
                          <span class="label label-theme pull-right mail-info">2</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Charts</span>
                      </a>

                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;">
                          <i class="fa fa-comments-o"></i>
                          <span>Chat Room</span>
                      </a>

                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">

             <!-- <div class="row">
                  <div class="col-lg-12 main-chart">
                  

                  
                      
                      <div class="row mt">

                      	<div class="col-md-4 col-sm-4 mb">
                      		<div class="white-panel pn donut-chart">
                      			<div class="white-header">
						  			<h5>SERVER LOAD</h5>
                      			</div>
								<div class="row">
									<div class="col-sm-6 col-xs-6 goleft">
										<p><i class="fa fa-database"></i> 70%</p>
									</div>
	                      		</div>
								<canvas id="serverstatus01" height="120" width="120"></canvas>
								<script>
									var doughnutData = [
											{
												value: 70,
												color:"#68dff0"
											},
											{
												value : 30,
												color : "#fdfdfd"
											}
										];
										var myDoughnut = new Chart(document.getElementById("serverstatus01").getContext("2d")).Doughnut(doughnutData);
								</script>
	                      	</div><! &#45;&#45;/grey-panel &ndash;&gt;
                      	</div>&lt;!&ndash; /col-md-4&ndash;&gt;

                  </div>
                  </div>
                  </div>-->
					<div class="row col-md-12" style="height: 600px">



                            <div class="#" id="ajax-content">


						
					</div>
					

            </div>

              <div>

                  <h3><i class="fa fa-angle-right"></i> Advanced Table Example</h3>
                  <div class="row mb ml">

                      <!-- page start-->
                      <div class="content-panel">
                          <div class="adv-table">
                              <table cellpadding="0" cellspacing="0" border="0" class="display table table-bordered" id="hidden-table-info">
                                  <thead>
                                  <tr>
                                      <th>Rendering engine</th>
                                      <th>Browser</th>
                                      <th class="hidden-phone">Platform(s)</th>
                                      <th class="hidden-phone">Engine version</th>
                                      <th class="hidden-phone">CSS grade</th>
                                  </tr>
                                  </thead>
                                  <tbody>
                                  <tr class="gradeX">
                                      <td>Trident</td>
                                      <td>Internet
                                          Explorer 4.0</td>
                                      <td class="hidden-phone">Win 95+</td>
                                      <td class="center hidden-phone">4</td>
                                      <td class="center hidden-phone">X</td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>Trident</td>
                                      <td>Internet
                                          Explorer 5.0</td>
                                      <td class="hidden-phone">Win 95+</td>
                                      <td class="center hidden-phone">5</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Trident</td>
                                      <td>Internet
                                          Explorer 5.5</td>
                                      <td class="hidden-phone">Win 95+</td>
                                      <td class="center hidden-phone">5.5</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Trident</td>
                                      <td>Internet
                                          Explorer 6</td>
                                      <td class="hidden-phone">Win 98+</td>
                                      <td class="center hidden-phone">6</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Trident</td>
                                      <td>Internet Explorer 7</td>
                                      <td class="hidden-phone">Win XP SP2+</td>
                                      <td class="center hidden-phone">7</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Trident</td>
                                      <td>AOL browser (AOL desktop)</td>
                                      <td class="hidden-phone">Win XP</td>
                                      <td class="center hidden-phone">6</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Firefox 1.0</td>
                                      <td class="hidden-phone">Win 98+ / OSX.2+</td>
                                      <td class="center hidden-phone">1.7</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Firefox 1.5</td>
                                      <td class="hidden-phone">Win 98+ / OSX.2+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Firefox 2.0</td>
                                      <td class="hidden-phone">Win 98+ / OSX.2+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Firefox 3.0</td>
                                      <td class="hidden-phone">Win 2k+ / OSX.3+</td>
                                      <td class="center hidden-phone">1.9</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Camino 1.0</td>
                                      <td class="hidden-phone">OSX.2+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Camino 1.5</td>
                                      <td class="hidden-phone">OSX.3+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Netscape 7.2</td>
                                      <td class="hidden-phone">Win 95+ / Mac OS 8.6-9.2</td>
                                      <td class="center hidden-phone">1.7</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Netscape Browser 8</td>
                                      <td class="hidden-phone">Win 98SE+</td>
                                      <td class="center hidden-phone">1.7</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Netscape Navigator 9</td>
                                      <td class="hidden-phone">Win 98+ / OSX.2+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.0</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.1</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.1</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.2</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.2</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.3</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.3</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.4</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.4</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.5</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.5</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.6</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.6</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.7</td>
                                      <td class="hidden-phone">Win 98+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.7</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Mozilla 1.8</td>
                                      <td class="hidden-phone">Win 98+ / OSX.1+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Seamonkey 1.1</td>
                                      <td class="hidden-phone">Win 98+ / OSX.2+</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Gecko</td>
                                      <td>Epiphany 2.20</td>
                                      <td class="hidden-phone">Gnome</td>
                                      <td class="center hidden-phone">1.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>Safari 1.2</td>
                                      <td class="hidden-phone">OSX.3</td>
                                      <td class="center hidden-phone">125.5</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>Safari 1.3</td>
                                      <td class="hidden-phone">OSX.3</td>
                                      <td class="center hidden-phone">312.8</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>Safari 2.0</td>
                                      <td class="hidden-phone">OSX.4+</td>
                                      <td class="center hidden-phone">419.3</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>Safari 3.0</td>
                                      <td class="hidden-phone">OSX.4+</td>
                                      <td class="center hidden-phone">522.1</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>OmniWeb 5.5</td>
                                      <td class="hidden-phone">OSX.4+</td>
                                      <td class="center hidden-phone">420</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>iPod Touch / iPhone</td>
                                      <td class="hidden-phone">iPod</td>
                                      <td class="center hidden-phone">420.1</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Webkit</td>
                                      <td>S60</td>
                                      <td class="hidden-phone">S60</td>
                                      <td class="center hidden-phone">413</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 7.0</td>
                                      <td class="hidden-phone">Win 95+ / OSX.1+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 7.5</td>
                                      <td class="hidden-phone">Win 95+ / OSX.2+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 8.0</td>
                                      <td class="hidden-phone">Win 95+ / OSX.2+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 8.5</td>
                                      <td class="hidden-phone">Win 95+ / OSX.2+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 9.0</td>
                                      <td class="hidden-phone">Win 95+ / OSX.3+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 9.2</td>
                                      <td class="hidden-phone">Win 88+ / OSX.3+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera 9.5</td>
                                      <td class="hidden-phone">Win 88+ / OSX.3+</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Opera for Wii</td>
                                      <td class="hidden-phone">Wii</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Nokia N800</td>
                                      <td class="hidden-phone">N800</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Presto</td>
                                      <td>Nintendo DS browser</td>
                                      <td class="hidden-phone">Nintendo DS</td>
                                      <td class="center hidden-phone">8.5</td>
                                      <td class="center hidden-phone">C/A<sup>1</sup></td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>KHTML</td>
                                      <td>Konqureror 3.1</td>
                                      <td class="hidden-phone">KDE 3.1</td>
                                      <td class="center hidden-phone">3.1</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>KHTML</td>
                                      <td>Konqureror 3.3</td>
                                      <td class="hidden-phone">KDE 3.3</td>
                                      <td class="center hidden-phone">3.3</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>KHTML</td>
                                      <td>Konqureror 3.5</td>
                                      <td class="hidden-phone">KDE 3.5</td>
                                      <td class="center hidden-phone">3.5</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeX">
                                      <td>Tasman</td>
                                      <td>Internet Explorer 4.5</td>
                                      <td class="hidden-phone">Mac OS 8-9</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">X</td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>Tasman</td>
                                      <td>Internet Explorer 5.1</td>
                                      <td class="hidden-phone">Mac OS 7.6-9</td>
                                      <td class="center hidden-phone">1</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>Tasman</td>
                                      <td>Internet Explorer 5.2</td>
                                      <td class="hidden-phone">Mac OS 8-X</td>
                                      <td class="center hidden-phone">1</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Misc</td>
                                      <td>NetFront 3.1</td>
                                      <td>Embedded devices</td>
                                      <td class="center">-</td>
                                      <td class="center">C</td>
                                  </tr>
                                  <tr class="gradeA">
                                      <td>Misc</td>
                                      <td>NetFront 3.4</td>
                                      <td class="hidden-phone">Embedded devices</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">A</td>
                                  </tr>
                                  <tr class="gradeX">
                                      <td>Misc</td>
                                      <td>Dillo 0.8</td>
                                      <td class="hidden-phone">Embedded devices</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">X</td>
                                  </tr>
                                  <tr class="gradeX">
                                      <td>Misc</td>
                                      <td>Links</td>
                                      <td class="hidden-phone">Text only</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">X</td>
                                  </tr>
                                  <tr class="gradeX">
                                      <td>Misc</td>
                                      <td>Lynx</td>
                                      <td class="hidden-phone">Text only</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">X</td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>Misc</td>
                                      <td>IE Mobile</td>
                                      <td class="hidden-phone">Windows Mobile 6</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeC">
                                      <td>Misc</td>
                                      <td>PSP browser</td>
                                      <td class="hidden-phone">PSP</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">C</td>
                                  </tr>
                                  <tr class="gradeU">
                                      <td>Other browsers</td>
                                      <td>All others</td>
                                      <td class="hidden-phone">-</td>
                                      <td class="center hidden-phone">-</td>
                                      <td class="center hidden-phone">U</td>
                                  </tr>
                                  </tbody>
                              </table>
                          </div>
                      </div>
                      <!-- page end-->


                  </div><!-- /row -->

          </section>
      </section>

      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
              2016 - AutoStars
              <a href="#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

  <script src="js/app/base.app.js"></script>
  <script src="js/app/clientParent.js"></script>
  <script src="js/app/search.js"></script>
  <script src="js/app/booking.js"></script>

  <script src="js/app/report.js"></script>
  <script src="js/app/company.js"></script>
  <script src="js/app/vendor.js"></script>
  <script src="js/app/parcel.js"></script>
  <script src="js/app/service.js"></script>
  <script src="js/app/driver.js"></script>

  <script src="js/app/bus.js"></script>
  <script src="js/app/region.js"></script>


  <script src="js/app/dispatch.js"></script>
  <script src="js/app/car.js"></script>
  <script src="js/app/client.js"></script>


  <script src="js/app/person.js"></script>





    <!-- js placed at the end of the document so the pages load faster -->
    <script src="1assets/js/jquery.js"></script>
    <script src="1assets/js/jquery-1.8.3.min.js"></script>
    <script src="1assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="1assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="1assets/js/jquery.scrollTo.min.js"></script>
    <script src="1assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="1assets/js/jquery.sparkline.js"></script>


    <!--common script for all pages-->
    <script src="1assets/js/common-scripts.js"></script>
    
    <script type="text/javascript" src="1assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="1assets/js/gritter-conf.js"></script>



    <!--script for this page-->
    <script src="1assets/js/sparkline-chart.js"></script>
	<script src="1assets/js/zabuto_calendar.js"></script>

	



  <!-- <script src="assets/js/jquery.js"></script> -->
  <script type="text/javascript" language="javascript" src="1assets/js/advanced-datatable/media/js/jquery.js"></script>
  <script src="1assets/js/bootstrap.min.js"></script>
  <script class="include" type="text/javascript" src="1assets/js/jquery.dcjqaccordion.2.7.js"></script>
  <script src="1assets/js/jquery.scrollTo.min.js"></script>
  <script src="1assets/js/jquery.nicescroll.js" type="text/javascript"></script>

  <script type="text/javascript" language="javascript" src="1assets/js/advanced-datatable/media/js/jquery.dataTables.js"></script>
  <%--<script type="text/javascript" src="1assets/js/advanced-datatable/media/jsDT_bootstrap.html"></script>--%>








  <script type="text/javascript">
      /* Formating function for row details */
      function fnFormatDetails ( oTable, nTr )
      {
          var aData = oTable.fnGetData( nTr );
          var sOut = '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;">';
          sOut += '<tr><td>Rendering engine:</td><td>'+aData[1]+' '+aData[4]+'</td></tr>';
          sOut += '<tr><td>Link to source:</td><td>Could provide a link here</td></tr>';
          sOut += '<tr><td>Extra info:</td><td>And any further details here (images etc)</td></tr>';
          sOut += '</table>';

          return sOut;
      }

      $(document).ready(function() {
          /*
           * Insert a 'details' column to the table
           */
          var nCloneTh = document.createElement( 'th' );
          var nCloneTd = document.createElement( 'td' );
          nCloneTd.innerHTML = '<img src="1assets/js/advanced-datatable/examples/examples_support/details_open.png">';
          nCloneTd.className = "center";

          $('#hidden-table-info thead tr').each( function () {
              this.insertBefore( nCloneTh, this.childNodes[0] );
          } );

          $('#hidden-table-info tbody tr').each( function () {
              this.insertBefore(  nCloneTd.cloneNode( true ), this.childNodes[0] );
          } );

          /*
           * Initialse DataTables, with no sorting on the 'details' column
           */
          var oTable = $('#hidden-table-info').dataTable( {
              "aoColumnDefs": [
                  { "bSortable": false, "aTargets": [ 0 ] }
              ],
              "aaSorting": [[1, 'asc']]
          });

          /* Add event listener for opening and closing details
           * Note that the indicator for showing which row is open is not controlled by DataTables,
           * rather it is done here
           */
          $('#hidden-table-info tbody td img').live('click', function () {
              var nTr = $(this).parents('tr')[0];
              if ( oTable.fnIsOpen(nTr) )
              {
                  /* This row is already open - close it */
                  this.src = "1assets/js/advanced-datatable/examples/examples_support/details_open.png";
                  oTable.fnClose( nTr );
              }
              else
              {
                  /* Open this row */
                  this.src = "1assets/js/advanced-datatable/examples/examples_support/details_close.png";
                  oTable.fnOpen( nTr, fnFormatDetails(oTable, nTr), 'details' );
              }
          } );
      } );
  </script>
  

  </body>

</html>
