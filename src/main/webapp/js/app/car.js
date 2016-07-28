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
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	
	    	/*var carName = document.getElementById('car-name').value;
	    	var carDescription = document.getElementById('car-descr').value;
	    	var carOwner = document.getElementById('car-owner').value;

			var params = 'carName=' + encodeURIComponent(carName)
				+ '&carDescription=' + encodeURIComponent(carDescription)

				+ '&carOwner=' + encodeURIComponent(carOwner);

			console.log(params);*/

			var carName = document.getElementById('inputVehicle1').value;
			var carVIN = document.getElementById('inputVehicle2').value;
			var carType = document.getElementById('inputVehicle3').value;
			var carYear = document.getElementById('inputVehicle4').value;
			var carMake = document.getElementById('inputVehicle5').value;
			var carModel = document.getElementById('inputVehicle6').value;
			var carLicence = document.getElementById('inputVehicle7').value;
			var carRegistrationTown = document.getElementById('inputVehicle8').value;
			console.log(document.getElementById('inputVehicle9'));
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

		ajax.open("DELETE", "./car/action/?id="+id, true);
		ajax.send();
	}

		
}



/* form += '<div class="form-group">'
               // + '<div class="input-group" id="' + el.id + '_div">'
                + '<label class="col-sm-2 control-label" id="'+ el.id +'"> ' + el.label + '</label>';


                *//*<div class="form-group">
                            <label for="inputVehicle4" class="col-sm-2 control-label">Vehicle Assigned</label>
                            <div class="col-sm-10">
                                <select class="form-control" id="inputVehicle4">
                                    <option>Kaligraph</option>
                                    <option>UnityReloaded</option>
                                    <option>Uzito</option>
                                    <option>Bazukka</option>
                                    <option>Street Waker</option>
                                    <option>Catalyst</option>
                                </select>
                            </div>
                        </div>*//*


            if (el.type == 'select' && el.options) {
                form+='<div class="form-group col-sm-8">'
                form += '<select class="form-control" name="' + el.name
                    + '" id="' + el.id + '">';
                el.options.forEach(function(opt) {
                    form += '<option value=' + opt.value + '>' + opt.label
                        + '</option>'
                });
                form += '</select>';
                form+='</div>';
            } else
                *//*form += '<div id="errorM"></div><input type="' + el.type
                    + '" name="' + el.name + '" class="form-control" id="'
                    + el.id + '" <label id="messageErr"></label>'

            form += '</div>';*//*

            form +='<div class="col-sm-8" id="errorM">'
                 +'<input type="'+ el.type +'" name="' + el.name + '" class="form-control" id="'+ el.id +'" >'
            form+='</div>';
            form+='</div>';

        })*/
