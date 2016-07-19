var client = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./client/action", true);
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
	    	
	    	ajax.open("GET", "./client/addClient.jsp", true);
	    	ajax.send();
		},
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    	/*var clientName = document.getElementById('client-name').value;
	    	var clientDescription = document.getElementById('client-descr').value;
	    	var clientManager = document.getElementById('client-namager').value;

	    	
	    	var params = 'clientName=' + encodeURIComponent(clientName)
	    				+ '&clientDescription=' + encodeURIComponent(clientDescription)

	    				+ '&clientManager=' + encodeURIComponent(clientManager);
	    	
	    	console.log(params);*/

			var clientName = document.getElementById('inputVehicle1').value;
			var clientId = document.getElementById('inputVehicle2').value;
			var clientPhoneNo = document.getElementById('inputVehicle3').value;
			var clientEmail = document.getElementById('inputVehicle4').value;
			var clientCity = document.getElementById('inputVehicle5').value;
			var clientCountry = document.getElementById('inputVehicle6').value;
			var clientBox = document.getElementById('inputVehicle7').value;

			var params = 'clientName=' + encodeURIComponent(clientName)
				+ '&clientId=' + encodeURIComponent(clientId)
				+ '&clientPhoneNo=' + encodeURIComponent(clientPhoneNo)
				+ '&clientEmail=' + encodeURIComponent(clientEmail)
				+ '&clientCity=' + encodeURIComponent(clientCity)
				+ '&clientCountry=' + encodeURIComponent(clientCountry)
				+ '&clientBox=' + encodeURIComponent(clientBox);

			console.log(params);


			ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./client/action/add", true);
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

		ajax.open("DELETE", "./client/action/?id="+id, true);
		ajax.send();
	}
		
}


