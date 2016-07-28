/*
var company = {
		ajax: function(){
			
		},
		cmp: [{
			id: 'company-name',
			label: 'Client Name',
			name: 'name',
			type: 'text'
		},{
			id: 'company-regno',
			label: 'ID No',
			name: 'regNo',
			type: 'text'
		},{
			id: 'company-phone_no',
			label: 'Phone No',
			name: 'phoneNo',
			type: 'email'
		},{
			id: 'company-email',
			label: 'Email',
			name: 'email',
			type: 'email'
		},{
			id: 'company-town',
			label: 'City',
			name: 'town',
			type: 'text'
		},{
			id: 'company-country',
			label: 'Country',
			name: 'country',
			type: 'text'
		},{
			id: 'company-box',
			label: 'P.O BOX',
			name: 'box',
			type: 'text'
		},{
				id: 'company-id',
				name: 'id',
				hidden: true,
				type: 'hidden'
			}],
	
		list: function(){
	    	var ajax = new XMLHttpRequest();
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				document.getElementById('ajax-content').innerHTML = ajax.responseText;
	    			}
	    		}
	    	}
	    	
	    	ajax.open("GET", "./company/action", true);
	    	ajax.send();
	    	
			//this.ajax.get('./company/action').update('ajax-content');
		},
		add: function(){
			var me = this;
			var form = '<form>';
			
			me.cmp.forEach(function(el){
				form += '<div class="form-group">'
					  + '  <label>' + el.label + '</label>'
					  + '  <input type="' + el.type + '" name="' + el.name + '" class="form-control" id="' + el.id + '">'
					  + ' </div>';
			})


			
			
		  form +=  '</form>'
		  + '<a class="btn btn-success"  onclick="company.save()">Save</a>';
				
		  document.getElementById('ajax-content').innerHTML = form;
		  
		},
		submitForm: true,
		save: function(){
			var me = this;
	    	var ajax = new XMLHttpRequest();
	    	me.submitForm = true;
	    	
	    	var params = '';
	    	me.cmp.forEach(function(el){
	    		var val = document.getElementById(el.id).value;
	    		if(!val)
	    			me.submitForm = false;
	    			
	    		params += el.name +'=' + encodeURIComponent(val) + '&';
	    	});
	    	
	    	ajax.onreadystatechange = function(){
	    		
	    		if(ajax.readyState == 4){
	    			if(ajax.status == 200){
	    				me.list();
	    			}
	    		}
	    	}
	    	
	    	ajax.open("POST", "./company/action/", true);
	    	ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	    	
	    	if(me.submitForm)
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
	    	
	    	ajax.open("DELETE", "./company/action/?id="+id, true);
	    	ajax.send();
		}
}






/!*
var company = App.extend(App.Cmp, {
	modelId: 'company',
	httpUrl: './company',
	responseTarget: 'ajax-content',
	columnModel: ['name', 'regNo'],
	columnSeperator: ' - Registration #: ',
	model:[{
		id: 'company-name',
		label: 'Company Name',
		name: 'name',
		type: 'text',
		required: 'required'
	},{
		id: 'company-regno',
		label: 'Registration #',
		name: 'regNo',
		type: 'text',
		required: 'required'
	},{
		id: 'company-phone_no',
		label: 'Phone #',
		name: 'phoneNo',
		type: 'number',
		required: 'required'
	},{
		id: 'company-email',
		label: 'Email #',
		name: 'email',
		type: 'email',
		required: 'required'
	},{
		id: 'company-town',
		label: 'Town',
		name: 'town',
		type: 'text',
		required: 'required'
	},{
		id: 'company-country',
		label: 'Country',
		name: 'country',
		type: 'select',
		options: [
			{label: 'Kenya', value:'KEN'},
			{label: 'Uganda', value:'UG'},
			{label: 'Tanzania', value:'TZ'}
		]
	},{
		id: 'company-box',
		label: 'P.O BOX',
		name: 'box',
		type: 'text',
		required: 'required'
	},{
		id: 'company-id',
		label: '',
		name: 'id',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true

});

(function(){
	company.init();
})();*!/
*/

var company = App.extend(App.Cmp, {
	modelId: 'company',
	httpUrl: './company',
	responseTarget: 'ajax-content',
	columnModel: ['name', 'regNo'],
	columnSeperator: ' - Registration #: ',
	model:[{
		id: 'company-name',
		label: 'Company Name',
		name: 'name',
		type: 'text',
		required: 'required'
	},{
		id: 'company-regno',
		label: 'Registration #',
		name: 'regNo',
		type: 'text',
		required: 'required'
	},{
		id: 'company-phone_no',
		label: 'Phone #',
		name: 'phoneNo',
		type: 'number',
		required: 'required'
	},{
		id: 'company-email',
		label: 'Email #',
		name: 'email',
		type: 'email',
		required: 'required'
	},{
		id: 'company-town',
		label: 'Town',
		name: 'town',
		type: 'text',
		required: 'required'
	},{
		id: 'company-country',
		label: 'Country',
		name: 'country',
		type: 'select',
		options: [
			{label: 'Kenya', value:'KEN'},
			{label: 'Uganda', value:'UG'},
			{label: 'Tanzania', value:'TZ'}
		]
	},{
		id: 'company-box',
		label: 'P.O BOX',
		name: 'box',
		type: 'text',
		required: 'required'
	},{
		id: 'company-id',
		label: '',
		name: 'id',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true

});

/*
(function(){
	company.init();
})();*/
