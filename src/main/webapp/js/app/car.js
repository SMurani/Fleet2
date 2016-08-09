var car = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./car/action", true);
	    	ajax.send();
		},
	
		listClient: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./clientaction", true);
		ajax.send();
	},
	myBookings: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./clientBooking", true);
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
	    	
	    	ajax.open("GET", "./car/addCar.jsp", true);
	    	ajax.send();
		},
	
	book: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./car/bookcar.jsp", true);
		ajax.send();
	},
	
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();

			var carName = document.getElementById('inputVehicle1').value;
			var carVIN = document.getElementById('inputVehicle2').value;
			var carType = document.getElementById('inputVehicle3').value;
			var carYear = document.getElementById('inputVehicle4').value;
			var carMake = document.getElementById('inputVehicle5').value;
			var carModel = document.getElementById('inputVehicle6').value;
			var carLicence = document.getElementById('inputVehicle7').value;
			var carRegistrationTown = document.getElementById('inputVehicle8').value;
			var carPhoto = document.getElementById('inputVehicle9').value;
			var carColor = document.getElementById('inputVehicle10').value;
			var carMSRP = document.getElementById('inputVehicle11').value;
			var carComments = document.getElementById('inputVehicle12').value;
			var carOwner = document.getElementById('inputVehicle13').value;


	    	var params = 'carName=' + encodeURIComponent(carName)
	    				+ '&carVIN=' + encodeURIComponent(carVIN)
						+ '&carType=' + encodeURIComponent(carType)
						+ '&carYear=' + encodeURIComponent(carYear)
						+ '&carMake=' + encodeURIComponent(carMake)
						+ '&carModel=' + encodeURIComponent(carModel)
						+ '&carLicence=' + encodeURIComponent(carLicence)
						+ '&carRegistrationTown=' + encodeURIComponent(carRegistrationTown)
						+ '&carPhoto=' + encodeURIComponent(carPhoto)
						+ '&carColor=' + encodeURIComponent(carColor)
						+ '&carMSRP=' + encodeURIComponent(carMSRP)
						+ '&carComments=' + encodeURIComponent(carComments)
	    				+ '&carOwner=' + encodeURIComponent(carOwner);
	    	
	    	console.log(params);
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./car/action/add", true);
	    	ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	    	ajax.send(params);
		},


	saveBook: function(){
		var me = this;
		var ajax = new XMLHttpRequest();

		var bookFrom = document.getElementById('inputVehicle1').value;
		var bookTo = document.getElementById('inputVehicle2').value;
		var bookDriver = document.getElementById('inputVehicle3').value;
		var bookPurpose = document.getElementById('inputVehicle4').value;
		var bookComments = document.getElementById('inputVehicle5').value;



		var params = 'bookFrom=' + encodeURIComponent(bookFrom)
			+ '&bookTo=' + encodeURIComponent(bookTo)
			+ '&bookDriver=' + encodeURIComponent(bookDriver)
			+ '&bookPurpose=' + encodeURIComponent(bookPurpose)

			+ '&bookComments=' + encodeURIComponent(bookComments);

		console.log(params);

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					me.myBookings();
				}
			}
		}


		ajax.open("POST", "./clientBooking/book", true);
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
		alert("Delete this Record?");
		ajax.open("DELETE", "./car/action/?id="+id, true);
		ajax.send();
	}

		
}


