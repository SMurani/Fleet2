var service = App.extend(App.Cmp, {
		modelId:'service',
		httpUrl: './service',
		responseTarget: 'ajax-content',
		columnModel: ['serviceTo', 'serviceFrom'],
		columnSeperator: ' To ',
		model:[{
			id:'service-sender',
			label:'Date of Service',
			name:'serviceTo',
			type:'text',
			required:'required'
			
		},{
			id : 'service-route',
			label : 'Vehicle',
			name : 'route',
			type : 'select',
			options : [ {
				label : 'KBL 557H',
				value : 'KBL 557H'
			}, {
				label : 'KCD 234L',
				value : 'KCD 234L'
			}, {
				label : 'KCH 567J',
				value : 'KCH 567J'
			}, {
				label : 'KAC 456J',
				value : 'KAC 345J'
			} ]
		},{
			id:'service-recipient ',
			label:'Odometre Reading',
			name:'serviceFrom',
			type:'number',
			required:'required'
		},{
			id:'service-description',
			label:'Complete Service Task',
			name:'serviceDescription',
			type:'text',
			required:'required'
		}, /*{
			id: 'service-from',
			label: 'From',
			name: 'fromId',
			type: 'select',
			options:[],
			required: 'required'
		},{
			id: 'service-to',
			label: 'To',
			name: 'toId',
			type: 'select',
			options: [],
			required: 'required'
		},*/{
			id : 'service-route',
			label : 'Vendor',
			name : 'route',
			type : 'select',
			options : [ {
				label : 'Toyota Kenya',
				value : 'Toyota'
			}, {
				label : 'Orrient Kenya',
				value : 'Orrient'
			}, {
				label : 'Fast Mechanics',
				value : 'Fast Mech'
			}, {
				label : 'Nomads Wires',
				value : 'Nomads Wires'
			} ]
		}, {
		id : 'service-cost',
		label : 'Reference No',
		name : 'serviceCost',
		type : 'number',
		required : 'required'
	}, {
			id:'service-id',
			label:'',
			name:'id',
			hidden:'true',
			type:'hidden',
			
		}],
		removeRecord: true	
	});

/*
(function(){
	
	service.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './location',
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
			service.model[1].options = options;
			
			
			
		}
	})
})();*/
