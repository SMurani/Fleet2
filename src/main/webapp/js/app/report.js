/*
var report = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./report/action", true);
	    	ajax.send();
		},
		add: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./report/addReport.jsp", true);
	    	ajax.send();
		},
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    	var reportName = document.getElementById('report-name').value;
	    	var reportDescription = document.getElementById('report-descr').value;
	    	var reportManager = document.getElementById('report-namager').value;

	    	
	    	var params = 'reportName=' + encodeURIComponent(reportName)
	    				+ '&reportDescription=' + encodeURIComponent(reportDescription)

	    				+ '&reportManager=' + encodeURIComponent(reportManager);
	    	
	    	console.log(params);
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./report/action/add", true);
	    	ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	    	ajax.send(params);
		},
	remove: function(id){
		var me = this;
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					me.list();
				}
			}
		}

		ajax.open("DELETE", "./report/action/?id="+id, true);
		ajax.send();
	}
		
}


*/
var view = {
	list: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;


					var response = ajax.responseText;
					//console.log(response);
					var jsonRecords = JSON.parse(response);
					console.log(jsonRecords);

					if(jsonRecords == 0){
						alert("Currently there is no report to display");

					}else{



						var data = "<div class=\"panel\">";
						data+="<header class=\"panel-heading\">";
						data+="<h3 class=\"panel-title\"> Vehicle Service Report";
						data+="</h3>";
						data+="</header>";
						data+="<div class=\"panel-body\">";
						data+="<div class=\"table-responsive\">";
						data+="<table class=\"table table-hover dataTable table-striped\" border=\"1\" id=\"exampleFixedHeader\">";
						data+="<thead>";
						data+="<tr style='background-color:#26f5c1; color:white;'>";
						data+="<th>Vehicle</th>";
						data+="<th>Date</th>";
						data+="<th>Odometre Reading</th>";
						data+="<th>Service Completed</th>";
						data+="<th>Completed by</th>";
						data+="<th>Comments</th>";
						data+="</tr>";
						data+="</thead>";
						data+="<tbody>";

						for (var i in jsonRecords){
							var id = jsonRecords[i].id;
							data+="<tr>";
							data+="<td>"+jsonRecords[i].vehicle+"</td>";
							data+="<td>"+jsonRecords[i].serviceDate+"</td>";
							data+="<td>"+jsonRecords[i].serviceOdometer+"</td>";
							data+="<td>"+jsonRecords[i].serviceCompleted+"</td>";
							data+="<td>"+jsonRecords[i].vendorId+"</td>";
							data+="<td>"+jsonRecords[i].serviceComments+"</td>";
							data+="</tr>";

						}
						data+="</tbody>";
						data+="</table>";
						data+="</div><h4>This report will only be valid if signed by the Vehicle Maintainance manager</h4>";
						data+="</div> <h4>"+Date()+"</h4>";

						data+="</div><a class='btn btn-primary' onclick='view.printRep();'>Print</a>";


						document.getElementById('ajax-content').innerHTML = data;

					}

				}

			}
		}


		ajax.open("GET", "./service", true);
		ajax.send();

	},
	printRep: function(){
		var divContents = document.getElementById("ajax-content").innerHTML
		var printWindow = window.open('', '', 'height=700,width=800');
		printWindow.document.write('<html><head><title>A Report on Services</title>');
		printWindow.document.write('</head><body >');
		printWindow.document.write(divContents);
		printWindow.document.write('</body></html>');
		printWindow.document.close();
		printWindow.print();
	}
}