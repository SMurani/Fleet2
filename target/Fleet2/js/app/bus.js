var bus = App.extend(App.Cmp, {
		modelId:'bus',
		httpUrl: './bus',
		responseTarget: 'ajax-content',
		model:[{
			id:'bus-name',
			label:'Bus Name',
			name:'busName',
			type:'text',
			placeholder:'name of bus',
			required:'required'

		},{
			id:'bus-manager ',
			label:'Bus Manager ',
			name:'busManager',
			type:'text',
			placeholder:'bus manager',
			required:'required'
		},{
			id:'bus-town',
			label:'Town of Operation',
			name:'busTown',
			type:'text',
			placeholder:'town',
			required:'required'
		}, {
		id : 'bus-cost',
		label : 'Bus Description',
		name : 'busDescription',
		placeholder:'Describe bus here..',
		type : 'textarea',
		required : 'required'
	}, {
			id:'bus-id',
			label:'',
			name:'id',
			hidden:'true',
			type:'hidden',

		}],
		removeRecord: true
	});


(function(){

	bus.ajaxRequest.call({
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

			bus.model[3].options = options;
			bus.model[4].options = options;



		}
	})
})();


