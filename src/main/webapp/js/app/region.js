var region = App.extend(App.Cmp, {
		modelId:'region',
		httpUrl: './region',
		responseTarget: 'ajax-content',
		model:[{
			id:'region-name',
			label:'Region Name',
			name:'regionName',
			type:'text',
			placeholder:'name of region',
			required:'required'

		},{
			id:'region-manager ',
			label:'Region Manager ',
			name:'regionManager',
			type:'text',
			placeholder:'region manager',
			required:'required'
		},{
			id:'region-town',
			label:'Town of Operation',
			name:'regionTown',
			type:'text',
			placeholder:'town',
			required:'required'
		}, {
		id : 'region-cost',
		label : 'Region Description',
		name : 'regionDescription',
		placeholder:'Describe region here..',
		type : 'textarea',
		required : 'required'
	}, {
			id:'region-id',
			label:'',
			name:'id',
			hidden:'true',
			type:'hidden',

		}],
		removeRecord: true
	});


/*(function(){

	region.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './driver',
		updateTarget : function(resp) {
			var options = [];
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.name,
					value: el.id
				});
			});

			region.model[3].options = options;
			region.model[4].options = options;



		}
	})
})();*/


