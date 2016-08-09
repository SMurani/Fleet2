/*angular.module("app", ["chart.js"]).controller("LineCtrl", function ($scope) {

	$scope.labels = ["January", "February", "March", "April", "May", "June", "July"];
	$scope.series = ['Series A', 'Series B'];
	$scope.data = [
		[65, 59, 80, 81, 56, 55, 40],
		[28, 48, 40, 19, 86, 27, 90]
	];
	$scope.onClick = function (points, evt) {
		console.log(points, evt);
	};
	$scope.datasetOverride = [{ yAxisID: 'y-axis-1' }, { yAxisID: 'y-axis-2' }];
	$scope.options = {
		scales: {
			yAxes: [
				{
					id: 'y-axis-1',
					type: 'linear',
					display: true,
					position: 'left'
				},
				{
					id: 'y-axis-2',
					type: 'linear',
					display: true,
					position: 'right'
				}
			]
		}
	};
});*/


/*
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


*/


