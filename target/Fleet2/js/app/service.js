var service = App.extend(App.Cmp, {
		modelId:'service',
		httpUrl: './service',
		responseTarget: 'ajax-content',

		model:[/*{
			id:'service-car',
			label:'Vehicle',
			name:'serviceCar',
			type: 'select',
            options:[],
            //required: 'required'
			
		},*/{
			id:'service-date ',
			label:'Date of Service',
			name:'serviceDate',
			type:'text',
			placeholder:'Date of Service',
			required:'required'
		},{
			id:'service-odometre',
			label:'Odometer Reading',
			name:'serviceOdometer',
			type:'number',
			required:'required',
			placeholder:'Odometre Reading',
		},
		{
		id : 'service-completed',
		label : 'Completed Service Task',
		name : 'serviceCompleted',
		type : 'text',
		required : 'required',
            placeholder:'Enter Service Completed'
	}, {
		id:'service-vendor',
		label:'Vendor',
		name:'vendorId',
		required:'required',
		type: 'select',
        options:[],
        required: 'required'
		
	},{
		id:'service-reference',
		label:'Referece',
		name:'serviceReference',
		required:'required',
		type:'text',
                placeholder:'Service Reference',
		
	},{
		id:'service-documents',
		label:'Documents',
		name:'serviceDocument',
		type:'file',

		
	},{
		id:'service-comments',
		label:'Comments',
		name:'serviceComments',
		type:'textarea',
                placeholder:'Enter Commets',
		
	},{
			id:'service-id',
			label:'',
			name:'id',
			hidden:'true',
			type:'hidden',

		}],
		removeRecord: true	
	});


(function(){
	
	service.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './vendor',
		updateTarget : function(resp) {
			var options = [];
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.name,
					value: el.name
				});
			});
			
			service.model[3].options = options;
			console.log(options);

			
			
			
		}
	})
})();
/*
(function(){

	service.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './car/action*/
/*',
		updateTarget : function(resp) {
			var options = [];
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.name,
					value: el.id
				});
			});

			service.model[0].options = options;




		}
	})
})();*/
