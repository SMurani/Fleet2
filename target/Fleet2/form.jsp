<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link href="DatePicker/sa/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="DatePicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>

    <script>
        $( function() {
            $( "#datepicker" ).datepicker();
        } );
    </script>
</head>




<body>

<p>Date: <input type="text" id="datepicker"></p>



<%--
<div class="container">
    <form action="" class="form-horizontal"  role="form">
        <fieldset>
            <legend>Test</legend>
            <div class="form-group">
                <label for="dtp_input1" class="col-md-2 control-label">DateTime Picking</label>
                <div class="input-group date form_datetime col-md-5" data-date="1979-09-16T05:25:07Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="dtp_input1">
                    <input class="form-control" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
				<input type="hidden" id="dtp_input1" value="" /><br/>
            </div>
			<div class="form-group">
                <label for="dtp_input2" class="col-md-2 control-label">Date Picking</label>
                <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input class="form-control" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
				<input type="hidden" id="dtp_input2" value="" /><br/>
            </div>
			<div class="form-group">
                <label for="dtp_input3" class="col-md-2 control-label">Time Picking</label>
                <div class="input-group date form_time col-md-5" data-date="" data-date-format="hh:ii" data-link-field="dtp_input3" data-link-format="hh:ii">
                    <input class="form-control" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-time"></span></span>
                </div>
				<input type="hidden" id="dtp_input3" value="" /><br/>
            </div>
        </fieldset>
    </form>
</div>

<script type="text/javascript" src="DatePicker/sa/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="DatePicker/sa/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="DatePicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="DatePicker/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        //language:  'en',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
	$('.form_date').datetimepicker({
        language:  'en',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	$('.form_time').datetimepicker({
        language:  'en',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 1,
		minView: 0,
		maxView: 1,
		forceParse: 0
    });
</script>
--%>


<div id="bottom_pane_options">

    <%--request = file_get_contents("http://localhost:8080/Fleet2/service/*");
    jsonValues = json_decode($request,true);

    output = "<table>";
    $output .="<th>id</th><th>Date</th><th>Vehicle</th><th>Description</th><th>Comment</th><th>Service</th>";
    foreach ($jsonValues as $service) {
    $output .= "<tr><td>".$service["id"]."</td><td>".$service["serviceDate"]."</td>";
        $output .= "<td>".$service["serviceCar"]."</td><td>".$service["serviceOdometer"]."</td>";
        $output .= "<td>".$service["serviceComments"]."</td><td>".$service["serviceCompleted"]."</td></tr>";
    }
    $output .= "</table>";

    echo $output;--%>
    <button onclick="todaydate();">Try It</button>
    <div id="results"></div>
        <div id="results1"></div> <!-- Added div ! -->
</div>


<script>
    function todaydate() {
        var today_date=new Date();
        var myyear=today_date.getYear();
        var mymonth=today_date.getMonth() + 1;
        var mytoday=today_date.getDate();

        document.getElementById('results').innerHTML ="<h1>" + myyear + "/" + mymonth + "/" + mytoday + "</h1>"

        var form = 	"<div class='panel'>" +
                "<div class='panel-heading'>" +
                "<h1 class='panel-title'>Book a Car Online</h1>" +
                "</div>" +
                "<div class='panel-body container-fluid'>" +
                "<form autocomplete='off' method='post' action='#'>" +

                "<div class='form-group form-material floating'>" +
                "<label class='floating-label'>Name</label>" +
                "<input type='text' class='form-control' id='title' name='title' />" +
                "</div>" +

                "<div class='form-group form-material floating'>" +
                "<label class='floating-label'>Phoe No</label>" +
                "<input type='text' class='form-control' id='reportedby' name='reportedby' />" +
                "</div>" +

                "<div class='form-group form-material floating'>" +
                "<label class='floating-label'>Priority</label><br>" +
                "<select class='c-select' id='priority' name='priority'>" +
                "<option selected></option>" +
                "<option value='LOW'>LOW</option>" +
                "<option value='MEDIUM'>MEDIUM</option>" +
                "<option value='HIGH'>HIGH</option>" +
                "</select>" +

                "</div>" +
                "<div class='form-group form-material floating'>" +
                "<label class='floating-label'>Problem Description</label>" +
                "<textarea class='form-control'id='descr' name='descr' rows='3'></textarea>" +
                "</div>" +

                "</form>" +
                "<a class='btn btn-primary' onclick='savePerson();'>Report Problem</a>" +
                "</div>" +
                "</div>";

        document.getElementById('results').innerHTML ="<h1>" + form + "</h1>"

        var table="<table>";
        table += "<div class=\"text-right\">";
        table += "<a class=\"btn btn-success\"><i class=\"fa fa-plus fa-1x\" aria-hidden=\"true\">Add</i></a>";
        table += "</div>";
        table += "<tr>";
        table += "<td> Actions </td>";
        table += '</tr>';
        table+="</th>";
        table+="<th></th>";
        table+="<th></th></tr>";

        var jsonRecords = JSON.parse(resp);



        document.getElementById('results1').innerHTML ="<h1>" + table + "</h1>"





    }
</script>

</body>
</html>