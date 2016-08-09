<%--<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Line Chart Test</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/1.0.2/Chart.min.js"></script>
    <script language="JavaScript">

    function displayLineChart() {
        var data = {
            labels: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
            datasets: [
                {
                    label: "Prime and Fibonacci",
                    fillColor: "rgba(220,220,220,0.2)",
                    strokeColor: "rgba(220,220,220,1)",
                    pointColor: "rgba(220,220,220,1)",
                    pointStrokeColor: "#fff",
                    pointHighlightFill: "#fff",
                    pointHighlightStroke: "rgba(220,220,220,1)",
                    data: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
                },
                {
                    label: "My Second dataset",
                    fillColor: "rgba(151,187,205,0.2)",
                    strokeColor: "rgba(151,187,205,1)",
                    pointColor: "rgba(151,187,205,1)",
                    pointStrokeColor: "#fff",
                    pointHighlightFill: "#fff",
                    pointHighlightStroke: "rgba(151,187,205,1)",
                    data: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
                }
            ]
        };
        var ctx = document.getElementById("lineChart").getContext("2d");
        var options = { };
        var lineChart = new Chart(ctx).Line(data, options);


    }
    </script>
</head>
<body onload="displayLineChart();">
<div class="box">
    <canvas id="lineChart" height="400" width="400"></canvas>
</div>
</body>
</html>--%>


     <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css">
     <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
     <script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>

<p>This is the Donut Page</p>
<p>The data from servlet: ${personBean.countUsers()}</p>
<div class="row cards" id="dashboard-tour-stats">
    <div class="col-md-3 col-sm-6 col-xs-6">
        <!-- Widget Dashboard -->
        <div class="widget widget-dashboard widget-info">
            <div class="row">
                <div class="col-sm-4 hidden-xs  text-center">
                    <i class="fa fa-group fa-fw fa-4x"></i>
                </div>
                <div class="col-sm-8 col-xs-12">
                    <span class="text-uppercase">sessions today</span>
                    <h2>557k+</h2>

                </div>
            </div>
            <div class="separator bottom"></div>
            <div class="row">
                <div class="col-sm-6 col-xs-12 border right">
                    <span class="text-uppercase">% bounce rate</span>
                    <h4>28.45%</h4>
                </div>
                <div class="col-sm-6 col-xs-12">
                    <span class="text-uppercase">pages/session</span>
                    <h4>4.50</h4>
                </div>
            </div>
        </div>
        <!-- // Widget Dashboard -->
    </div>
    <div class="col-md-3 col-sm-6 col-xs-6">
        <!-- Widget Dashboard -->
        <div class="widget widget-dashboard widget-success">
            <div class="row">
                <div class="col-sm-4 hidden-xs text-center">
                    <i class="fa fa-money fa-fw fa-4x"></i>
                </div>
                <div class="col-sm-8 col-xs-12">
                    <span class="text-uppercase">today's earnings</span>
                    <h2>&euro;1,234</h2>

                </div>
            </div>
            <div class="separator bottom"></div>
            <div class="row">
                <div class="col-sm-6 col-xs-12 border right">
                    <span class="text-uppercase">last week</span>
                    <h4>&euro;23,456</h4>
                </div>
                <div class="col-sm-6 col-xs-12">
                    <span class="text-uppercase">last month</span>
                    <h4>&euro;234,567</h4>
                </div>
            </div>
        </div>
        <!-- // Widget Dashboard -->
    </div>
    <div class="col-md-3 col-sm-6 col-xs-6">
        <!-- Widget Dashboard -->
        <div class="widget widget-dashboard widget-danger">
            <div class="row">
                <div class="col-sm-4 hidden-xs text-center">
                    <i class="fa fa-shopping-cart fa-fw fa-4x"></i>
                </div>
                <div class="col-sm-8 col-xs-12 text-right">
                    <span class="text-uppercase">new orders today</span>
                    <h2>567</h2>
                </div>
            </div>
            <div class="separator bottom"></div>
            <div class="row">
                <div class="col-xs-9 text-center reset margin padding left right">
                        <span class="btn btn-outline btn-inverse btn-block text-uppercase clearfix">
                            view orders
                            <i class="fa fa-arrow-circle-o-right pull-right"></i>
                        </span>
                </div>
            </div>
        </div>
        <!-- // Widget Dashboard -->
    </div>
    <div class="col-md-3 col-sm-6 col-xs-6">
        <!-- Widget Dashboard -->
        <div class="widget widget-dashboard widget-primary">
            <div class="row">
                <div class="col-sm-4 hidden-xs text-center">
                    <i class="fa fa-envelope-o fa-fw fa-4x"></i>
                </div>
                <div class="col-sm-8 col-xs-12 text-right">
                    <span class="text-uppercase">messages today</span>
                    <h2>789</h2>
                </div>
            </div>
            <div class="separator bottom"></div>
            <div class="row">
                <div class="col-xs-9 text-center reset margin padding left right">
                        <span class="btn btn-outline btn-danger btn-block text-uppercase clearfix">
                            view messages
                            <i class="fa fa-arrow-circle-o-right pull-right"></i>
                        </span>
                </div>
            </div>
        </div>
        <!-- // Widget Dashboard -->
    </div>
</div>
<div id="myfirstchart" style="height: 250px;"></div>
<div id="donut-example"></div>
<script>
    new Morris.Line({

        element: 'myfirstchart',
        // Chart data records -- each entry in this array corresponds to a point on
        // the chart.
        data: [
            { year: '2008', value: 20 },
            { year: '2009', value: 10 },
            { year: '2010', value: 5 },
            { year: '2011', value: 5 },
            { year: '2012', value: 20 }
        ],
        // The name of the data record attribute that contains x-values.
        xkey: 'year',
        // A list of names of data record attributes that contain y-values.
        ykeys: ['value'],
        // Labels for the ykeys -- will be displayed when you hover over the
        // chart.
        labels: ['Value']
    });
</script>
<script>
    Morris.Donut({
        element: 'donut-example',
        data: [
            {label: "Download Sales", value: 12},
            {label: "In-Store Sales", value: 30},
            {label: "Mail-Order Sales", value: 20}
        ]
    });
</script>
