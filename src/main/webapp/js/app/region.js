var region = {
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./region/action", true);
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
	    	
	    	ajax.open("GET", "./region/addRegion.jsp", true);
	    	ajax.send();
		},
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    	var regionName = document.getElementById('region-name').value;
	    	var regionDescription = document.getElementById('region-descr').value;
	    	var regionManager = document.getElementById('region-namager').value;

	    	
	    	var params = 'regionName=' + encodeURIComponent(regionName)
	    				+ '&regionDescription=' + encodeURIComponent(regionDescription)

	    				+ '&regionManager=' + encodeURIComponent(regionManager);
	    	
	    	console.log(params);
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./region/action/add", true);
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

		ajax.open("DELETE", "./region/action/?id="+id, true);
		ajax.send();
	}
		
}


