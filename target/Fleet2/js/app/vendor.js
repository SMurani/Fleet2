var vendor = App.extend(App.Cmp, {
	modelId: 'vendor',
	httpUrl: './vendor',
	responseTarget: 'ajax-content',

	model:[{
		id: 'vendor-name',
		label: 'Vendor Name',
		name: 'name',
		type: 'text',
		placeholder:'name of vendor',
		required: 'required'
	},{
		id: 'vendor-speciality',
		label: 'Speciality',
		name: 'speciality',
		type: 'text',
		placeholder:'vendor speciality',
		required: 'required'
	},{
		id: 'vendor-phone_no',
		label: 'Phone',
		name: 'phoneNo',
		type: 'number',
		placeholder:'phone number',
		required: 'required'
	},{
		id: 'vendor-email',
		label: 'Email',
		name: 'email',
		type: 'email',
		placeholder:'email address',
		required: 'required'
	},{
		id: 'vendor-town',
		label: 'Town',
		name: 'town',
		type: 'text',
		placeholder:'town',
		required: 'required'
	},{
		id: 'vendor-country',
		label: 'Country',
		name: 'country',
		type: 'select',
		options: [
			{label: 'Kenya', value:'Kenya'},
			{label: 'Tanzania', value:'Tanzania'},
			{label: 'Dubai', value:'Dubai'},
			{label: 'Germany', value:'Germany'}
		]
	},{
		id: 'vendor-box',
		label: 'P.O BOX',
		name: 'box',
		type: 'text',
		placeholder:'P.O.BOX',
		required: 'required'
	},{
		id: 'vendor-id',
		label: '',
		name: 'id',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true

});