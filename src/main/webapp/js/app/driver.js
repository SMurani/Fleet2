var driver = App.extend(App.Cmp, {
	modelId:'driver',
	httpUrl: './driver',
	responseTarget: 'ajax-content',
	model:[{
		id:'driver-fname',
		label:'First Name',
		name:'fname',
		type:'text',
		placeholder:'name of driver',
		required:'required'

	},{
		id:'driver-lname',
		label:'Last Name',
		name:'lname',
		type:'text',
		placeholder:'name of driver',
		required:'required'

	},{
		id:'driver-idNumber ',
		label:'National ID No ',
		name:'idNumber',
		type:'text',
		placeholder:'driver ID No',
		required:'required'
	},{
		id: 'driver-vehicle',
		label: 'Vehicle',
		name: 'car',
		type: 'select',
		options: [
			{label: 'Caligraph', value:'Caligraph'},
			{label: 'Uzito', value:'Uzito'},
			{label: 'Lopha', value:'Lopha'},
			{label: 'Kifaru', value:'Kifaru'}
		],
		required: 'required'
	},{
		id: 'driver-region',
		label: 'Region of Operation',
		name: 'regionId',
		type: 'select',
		options:[],
		required: 'required'
	},{
		id: 'driver-phone_no',
		label: 'Phone ',
		name: 'phoneNo',
		type: 'number',
		required: 'required'
	},{
		id: 'driver-email',
		label: 'Email',
		name: 'email',
		type: 'email',
		placeholder:'email address',
		required: 'required'
	},{
		id: 'driver-town',
		label: 'Town',
		name: 'town',
		type: 'text',
		required: 'required'
	},{
		id: 'driver-country',
		label: 'Country',
		name: 'country',
		type: 'select',
		options: [
			{label: 'Kenya', value:'KEN'},
			{label: 'Uganda', value:'UG'},
			{label: 'Tanzania', value:'TZ'}
		]
	},{
		id: 'driver-box',
		label: 'P.O BOX',
		name: 'box',
		type: 'text',
		placeholder:'Box No',
		required: 'required'
	}, {
		id:'driver-id',
		label:'',
		name:'id',
		hidden:'true',
		type:'hidden',

	}],
	removeRecord: true
});

(function(){
	driver.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './region',
		updateTarget : function(resp) {
			var options = [];
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.regionName,
					value: el.regionName

				});
			});

			driver.model[4].options = options;
			console.log(options);


		}
	})
})();

/*(function(){
	driver.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './car/action/!*',
		updateTarget : function(resp) {
			var options = [];
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.name,
					value: el.id
				});
			});


			driver.model[3].options = options;
		}
	})
})();*/





/*
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


*/

/*
var driver = App.extend(App.Cmp, {
	modelId:'driver',
	httpUrl: './driver',
	responseTarget: 'ajax-content',
	model:[{
		id:'driver-name',
		label:'Driver Name',
		name:'driverName',
		type:'text',
		placeholder:'name of driver',
		required:'required'

	},{
		id:'driver-idNumber ',
		label:'ID/Registration No ',
		name:'driverReg',
		type:'text',
		placeholder:'driver ID No',
		required:'required'
	},{
		id: 'driver-phone_no',
		label: 'Phone ',
		name: 'phoneNo',
		type: 'number',
		required: 'required'
	},{
		id: 'driver-email',
		label: 'Email',
		name: 'email',
		type: 'email',
		placeholder:'email address',
		required: 'required'
	},{
		id: 'driver-town',
		label: 'Town',
		name: 'town',
		type: 'text',
		required: 'required'
	},{
		id: 'driver-country',
		label: 'Country',
		name: 'country',
		type: 'select',
		options: [
			{label: 'Kenya', value:'KEN'},
			{label: 'Uganda', value:'UG'},
			{label: 'Tanzania', value:'TZ'}
		]
	},{
		id: 'driver-box',
		label: 'P.O BOX',
		name: 'box',
		type: 'text',
		placeholder:'Box No',
		required: 'required'
	}, {
		id: 'driver-description',
		label: 'Comments',
		name: 'driverDescription',
		placeholder:'Enter a short description about driver',
		type: 'textarea'

	},{
		id:'driver-id',
		label:'',
		name:'id',
		hidden:'true',
		type:'hidden',

	}],
	removeRecord: true
});
*/






