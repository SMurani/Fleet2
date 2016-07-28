var dispatch = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./dispatch/action", true);
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
	    	
	    	ajax.open("GET", "./dispatch/addDispatch.jsp", true);
	    	ajax.send();
		},
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    	/*var dispatchName = document.getElementById('dispatch-name').value;
	    	var dispatchDescription = document.getElementById('dispatch-descr').value;
	    	var dispatchManager = document.getElementById('dispatch-namager').value;

	    	
	    	var params = 'dispatchName=' + encodeURIComponent(dispatchName)
	    				+ '&dispatchDescription=' + encodeURIComponent(dispatchDescription)

	    				+ '&dispatchManager=' + encodeURIComponent(dispatchManager);
	    	
	    	console.log(params);*/

			var dipatchVehicle = document.getElementById('inputVehicle1').value;
			var dispatchClient = document.getElementById('inputVehicle2').value;
			var dispatchReturnDate = document.getElementById('inputVehicle3').value;
			var dispatchDoc = document.getElementById('inputVehicle4').value;
			var dispatchCommet = document.getElementById('inputVehicle5').value;

			var params = 'dipatchVehicle=' + encodeURIComponent(dipatchVehicle)
				+ '&dispatchClient=' + encodeURIComponent(dispatchClient)
				+ '&dispatchReturnDate=' + encodeURIComponent(dispatchReturnDate)
				+ '&dispatchDoc=' + encodeURIComponent(dispatchDoc)
				+ '&dispatchCommet=' + encodeURIComponent(dispatchCommet);

			console.log(params);
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./dispatch/action/add", true);
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

		ajax.open("DELETE", "./dispatch/action/?id="+id, true);
		ajax.send();
	}
		
}


