var driver = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./driver/action", true);
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
	    	
	    	ajax.open("GET", "./driver/addDriver.jsp", true);
	    	ajax.send();
		},
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    
			var driverFname = document.getElementById('inputVehicle1').value;
			var driverLname = document.getElementById('inputVehicle13').value;
			var driverIdNo = document.getElementById('inputVehicle2').value;
			var driverRegion = document.getElementById('inputVehicle3').value;
			var driverVehicle = document.getElementById('inputVehicle4').value;
			var driverPhoneNo = document.getElementById('inputVehicle5').value;
			var driverEmail = document.getElementById('inputVehicle6').value;
			var driverCity = document.getElementById('inputVehicle7').value;
			var driverCountry = document.getElementById('inputVehicle8').value;
			var driverBox = document.getElementById('inputVehicle9').value;


			var params = 'driverFname=' + encodeURIComponent(driverFname)
				+ '&driverLname=' + encodeURIComponent(driverLname)
				+ '&driverIdNo=' + encodeURIComponent(driverIdNo)
				+ '&driverRegion=' + encodeURIComponent(driverRegion)
				+ '&driverVehicle=' + encodeURIComponent(driverVehicle)
				+ '&driverPhoneNo=' + encodeURIComponent(driverPhoneNo)
				+ '&driverEmail=' + encodeURIComponent(driverEmail)
				+ '&driverCity=' + encodeURIComponent(driverCity)
				+ '&driverCountry=' + encodeURIComponent(driverCountry)
				+ '&driverBox=' + encodeURIComponent(driverBox);

			console.log(params);

	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./driver/action/add", true);
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

		ajax.open("DELETE", "./driver/action/?id="+id, true);
		ajax.send();
	}
		
}


