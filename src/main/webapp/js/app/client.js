var client = App.extend(App.Cmp, {
		modelId:'client',
		httpUrl: './client',
		responseTarget: 'ajax-content',
		model:[{
			id:'client-name',
			label:'Client Name',
			name:'clientName',
			type:'text',
			placeholder:'name of client',
			required:'required'

		},{
			id:'client-idNumber ',
			label:'ID/Registration No ',
			name:'clientReg',
			type:'text',
			placeholder:'client ID No',
			required:'required'
		},{
			id: 'client-phone_no',
			label: 'Phone ',
			name: 'phoneNo',
			type: 'number',
			required: 'required'
		},{
			id: 'client-email',
			label: 'Email',
			name: 'email',
			type: 'email',
			placeholder:'email address',
			required: 'required'
		},{
			id: 'client-town',
			label: 'Town',
			name: 'town',
			type: 'text',
			required: 'required'
		},{
			id: 'client-country',
			label: 'Country',
			name: 'country',
			type: 'select',
			options: [
				{label: 'Kenya', value:'KEN'},
				{label: 'Uganda', value:'UG'},
				{label: 'Tanzania', value:'TZ'}
			]
		},{
			id: 'client-box',
			label: 'P.O BOX',
			name: 'box',
			type: 'text',
			placeholder:'Box No',
			required: 'required'
		}, {
			id: 'client-description',
			label: 'Comments',
			name: 'clientDescription',
			placeholder:'Enter a short description about client',
			type: 'textarea'

		},{
			id:'client-id',
			label:'',
			name:'id',
			hidden:'true',
			type:'hidden',

		}],
		removeRecord: true
	});





