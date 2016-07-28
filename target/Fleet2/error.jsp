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

    <h3 class="logo-name">Error</h3>

</div>

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div>

        <h2>An error Occured</h2>




        <p class="m-t"> <small>EasyFleet &copy; 2016</small> </p>
    </div>
</div>

<div class="container">
    <div class='col-md-5'>
      <form role="form" method="post" action= "./fileUpload" enctype="multipart/form-data" >
      		<div class="form group">
      			<input type="text" class="form-control" id="event_name" id="ename" name="event_name"   placeholder="Enter Event Name" required>


                         </br>
			<input type="text" class="form-control" id="venue" name="event_venue" placeholder="Enter your venue" required>
				</br>
 <div><input type="number" class="form-control" id="nts"  name="number_of_tickets" placeholder="Number of Tickets Available" required>
            <span id="st" class="text-danger">

            </span></div></br>

            <div class="form-group">
                <div class='input-group date' id='datetimepicker2'>
                    <input type='text' class="form-control" name="start_date_time" id="start" placeholder="Select the date and time below"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
              <div class="form-group">
                <div class='input-group date' id='datetimepicker3'>
                    <input type='text' class="form-control" name="end_date_time" placeholder="Select the end date and time below" id="end" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>

                </div>
            </div>



        <script type="text/javascript">
            $(function () {
                $('#datetimepicker2').datetimepicker({
                    locale: 'en',

                });
            });
        </script>

 <script type="text/javascript">
            $(function () {
                $('#datetimepicker3').datetimepicker({
                    locale: 'en',


                });
            });
        </script>




<div><span id="sdate" class="text-danger"></span></div>
        <br>
        <div class="form-group form-inline text-left">
      			<label for="inputfile">Select an image
      				<input type="file" id="inputfile" name="event_image" required></label>

      			</div>
      				<button type = "submit" class="btn btn-lg btn-info"  id="submita" name="submit"  >Submit</a>
      			      	</form>



<script src="js/jquery-2.1.1.js"></script>
<script src="js/bootstrap.min.js"></script>






 <div class="col-lg-12">
    <h4>Register new Vehicle Details</h4>
    <form class="form-horizontal" enctype="multipart/form-data" method="POST" action="./fileUpload">

            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle Name*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle1" name="carName" placeholder="vehicle nickname" required="">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle13"  class="col-sm-2 control-label">Owner</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle13" name="carOwner" placeholder="Vehicle Owner">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2"  class="col-sm-2 control-label">VIN/SN</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle2" name="carVIN" placeholder="Vehicle Identification No">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3"  class="col-sm-2 control-label">Type</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle3" placeholder="vehicle type e.g. Bus">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" name="carYear" class="col-sm-2 control-label">Year</label>
            <div class="col-sm-8">
                <input type="date" class="form-control" id="inputVehicle4" placeholder="Vehicle manufactured year">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle5" name="carMake" class="col-sm-2 control-label">Make</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle5" placeholder="e.g Toyota">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6" name="carModel" class="col-sm-2 control-label">Model</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle6" placeholder="e.g Salon">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle7" name="carLicence" class="col-sm-2 control-label">Licence Plate</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle7" placeholder="e.g KBL 557H">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle8" name="carRegistrationTown" class="col-sm-2 control-label">Registration Town</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle8" placeholder="e.g Nairobi">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle10" name="carColor" class="col-sm-2 control-label">Vehicle Color</label>
            <div class="col-sm-8">
                <input type="text" name="carType" class="form-control" id="inputVehicle10" placeholder="e.g Red">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle11" name="carMSRP" class="col-sm-2 control-label">MSRP</label>
            <div class="col-sm-8 input-group">
                <span class="input-group-addon">$$</span>
                <input type="text" class="form-control" placeholder="Manufacturer Suggested Resale Price" id="inputVehicle11" required="">
            </div>
        </div>
       <%-- <div class="form-group">
            <label for="inputVehicle12" name="carType" class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-8">
                <input type="textarea" class="form-control" id="inputVehicle12" placeholder="Manufacturer Suggested Resele Price">
            </div>
        </div>--%>
<h4>Additional Details</h4>
        <div class="form-group">
            <label for="inputVehicle12" name="carComments" class="col-sm-2 control-label">Comment:</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" id="inputVehicle12"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle9" name="carPhoto" class="col-sm-2 control-label">Photo</label>
            <div class="col-sm-8">
                <input type="file"  id="inputVehicle9" >
            </div>
        </div>


<div class="col-lg-12">
<button type="submit" class="btn btn-success pull-right" ">Save</button>
</div>


    </form>
</div>

</div>





</body>


</html>
