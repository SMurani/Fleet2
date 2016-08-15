var booking = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./booking", true);
	    	ajax.send();
		},
	UserBook: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./booking/UserBook", true);
		ajax.send();
	},
	report: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./booking/report", true);
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
	    	


			ajax.open("GET", "./booking1/addBooking.jsp", true);
	    	ajax.send();
		},

	saveBook: function(){
		var me = this;
		var ajax = new XMLHttpRequest();

		var bookFrom = document.getElementById('inputVehicle1').value;
		var bookTo = document.getElementById('inputVehicle2').value;
		var bookDriver = document.getElementById('inputVehicle3').value;
		var bookPurpose = document.getElementById('inputVehicle4').value;
		var bookComments = document.getElementById('inputVehicle5').value;
		var phoneNumber = document.getElementById('inputVehicle6').value;



		var params = 'bookFrom=' + encodeURIComponent(bookFrom)
			+ '&bookTo=' + encodeURIComponent(bookTo)
			+ '&bookDriver=' + encodeURIComponent(bookDriver)
			+ '&bookPurpose=' + encodeURIComponent(bookPurpose)
			+ '&phoneNumber=' + encodeURIComponent(phoneNumber)

			+ '&bookComments=' + encodeURIComponent(bookComments);

		console.log(params);

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					me.UserBook();
				}
			}
		}


		ajax.open("POST", "./booking/", true);
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

		ajax.open("DELETE", "./booking/?id="+id, true);
		ajax.send();
	},
	update: function(id){
		var me = this;
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					me.list();
				}
			}
		}
		alert("Approve this Booking?");
		ajax.open("GET", "./booking/update?id="+id, true);
		ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		ajax.send();
	}
		
}


