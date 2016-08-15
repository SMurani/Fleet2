$(function() {

	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();

	var bindto = $('#calendar');


	function getMonth(bindto){
		var date = bindto.fullCalendar('getDate');
		var monthInt = date.month();
		var header = $('.page-header.calendar');
		var months = ['january', 'february', 'march', 'april', 'may', 'june', 'july', 'august', 'september', 'october', 'november', 'december'];
		
		$.each(months, function (idx, val) {
			$(header).removeClass(val);
		});
		
		$(header).addClass(months[monthInt]);
	}

    // page is now ready, initialize the calendar...
    bindto.fullCalendar({
        customButtons: {
        	myPrev: {
        		text: '',
        		icon: 'fa fa fa-angle-left',
	            click: function() {
	                bindto.fullCalendar('prev')
	            }
        	},
        	myNext: {
        		text: '',
        		icon: 'fa fa fa-angle-right',
	            click: function() {
	                bindto.fullCalendar('next')
	            }
        	}
        },
        // defaultDate: '2016-04-11',
        header: {
        	left: '',
        	center: 'myPrev, title, myNext',
        	right: ''
        },
		editable: true,
		selectable: true,
		eventLimit: true,
		select: function(start, end, allDay) {
			$('#createEventModal #start').val(start); // adding start date to the form
			$('#createEventModal #end').val(end); // adding end date to the form

			$('#createEventModal').modal('show');
		},
		viewRender: function (view, elem) {
			$('.dfc-popover').remove();

		},
		eventClick: function(calEvent, jsEvent, view) {
			if (!$(this).hasClass('event-clicked')) {
                $('.fc-event').removeClass('event-clicked');

                $(this).addClass('event-clicked');
            }

            console.log(calEvent);

            var elem = $(this);

	        // $('body').append(
         //        '<div class="dfcp-popover">' +
         //            '<div class="dfcp-header">' +
         //                moment(calEvent.start).format('dddd • D') +
         //                '<button type="button" class="close"><i class="ti-close"></i></button>' +
         //            '</div>' +

         //            '<div class="dfcp-body main-screen">' +
         //                '<p>' +
         //                    moment(calEvent.start).format('dddd, D YYYY, hh:mma') +
         //                '</p>' +
         //                '<p>' + calEvent.title + '</p>' +
         //                '<ul class="actions">' +
         //                    '<li><a href="#">More details</a></li>' +
         //                    '<li><a href="#" class="dfcp-event-action-edit">Edit event</a></li>' +
         //                    '<li><a href="#" class="dfcp-event-action-remove">Remove</a></li>' +
         //                '</ul>' +
         //            '</div>' +

         //            '<div class="dfcp-body remove-confirm">' +
         //                '<p>Are you sure to remove event?</p>' +
         //                '<div class="text-center">' +
         //                    '<button type="button" class="btn btn-rounded btn-sm remove-event">Yes</button>' +
         //                    '<button type="button" class="btn btn-rounded btn-sm btn-danger remove-popover">No</button>' +
         //                '</div>' +
         //            '</div>' +

         //            '<div class="dfcp-body edit-event">' +
         //                '<p>Edit event</p>' +
         //                '<div class="form-group">' +
         //                    '<div class="input-group date datetimepicker">' +
         //                        '<input type="text" class="form-control" />' +
         //                        '<span class="input-group-addon"><i class="fa fa-calendar"></i></span>' +
         //                    '</div>' +
         //                '</div>' +
         //                '<div class="form-group">' +
         //                    '<div class="input-group date datetimepicker-2">' +
         //                        '<input type="text" class="form-control" />' +
         //                        '<span class="input-group-addon"><i class="fa fa-clock-o"></i></span>' +
         //                    '</div>' +
         //                '</div>' +
         //                '<div class="form-group">' +
         //                    '<textarea class="form-control" rows="2">' + calEvent.title + '</textarea>' +
         //                '</div>' +
         //                '<div class="text-center">' +
         //                    '<button type="button" class="btn btn-rounded btn-sm">Save</button>' +
         //                    '<button type="button" class="btn btn-rounded btn-sm btn-danger remove-popover">Cancel</button>' +
         //                '</div>' +
         //            '</div>' +
         //        '</div>'
         //    );

         	$('body').append(
                '<div class="dfcp-popover">' +
                    '<div class="dfcp-header">' +
                        moment(calEvent.start).format('dddd • D') +
                        '<button type="button" class="close"><i class="ion-android-close"></i></button>' +
                    '</div>' +

                    '<div class="dfcp-body main-screen">' +
                        '<small>' + moment(calEvent.start).format('dddd, D YYYY, hh:mma') + '</small>' +
                        '<h4 class="m-t-0" data-toggle="tooltip" data-placement="top" title="Maximum candidates to this class" data-container="body">' + calEvent.title + ' <small class="label label-info">0/' + calEvent.max + '</small></h4>' +
                        '<p>' + calEvent.description + '</p>' +
                        '<hr>' +
                        '<ul class="actions">' +
                            '<li><a href="#">More details</a></li>' +
                            '<li><a href="#" class="dfcp-event-action-edit">Edit event</a></li>' +
                            '<li><a href="#" class="dfcp-event-action-remove">Remove</a></li>' +
                        '</ul>' +
                    '</div>' +

                    '<div class="dfcp-body remove-confirm">' +
                        '<p>Are you sure to remove event?</p>' +
                        '<div class="text-center">' +
                            '<button type="button" class="btn btn-rounded btn-sm remove-event">Yes</button>' +
                            '<button type="button" class="btn btn-rounded btn-sm btn-danger remove-popover">No</button>' +
                        '</div>' +
                    '</div>' +

                    '<div class="dfcp-body edit-event">' +
                        '<p>Edit event</p>' +
                        '<div class="form-group">' +
                            '<div class="input-group date datetimepicker">' +
                                '<input type="text" class="form-control" />' +
                                '<span class="input-group-addon"><i class="fa fa-calendar"></i></span>' +
                            '</div>' +
                        '</div>' +
                        '<div class="form-group">' +
                            '<div class="input-group date datetimepicker-2">' +
                                '<input type="text" class="form-control" />' +
                                '<span class="input-group-addon"><i class="fa fa-clock-o"></i></span>' +
                            '</div>' +
                        '</div>' +
                        '<div class="form-group">' +
                            '<textarea class="form-control" rows="2">' + calEvent.title + '</textarea>' +
                        '</div>' +
                        '<div class="text-center">' +
                            '<button type="button" class="btn btn-rounded btn-sm">Save</button>' +
                            '<button type="button" class="btn btn-rounded btn-sm btn-danger remove-popover">Cancel</button>' +
                        '</div>' +
                    '</div>' +
                '</div>'
            );

            // Positioning the popover
            function popoverPosition()
            {
                $('.dfcp-popover').css({
                    left: elem.offset().left + elem.outerWidth()/2,
                    top: elem.offset().top + elem.outerHeight()
                });
            }

            // Trigger position of popover
            popoverPosition();

            $(window).resize(function(){
               popoverPosition();
            });

            // Remove old popover
            if ($('.dfcp-popover').length > 1) {
                for (var i = 0; i < ($('.dfcp-popover').length - 1); i++) {
                    $('.dfcp-popover').eq(i).remove();
                }
            }

            // Datepicker init
            $('.dfcp-popover .datetimepicker').datetimepicker({
                widgetPositioning: {
                    horizontal: 'right'
                },
                icons: {
	    			next: 'fa fa-chevron-right',
	    			previous: 'fa fa-chevron-left',
	    			time: 'fa fa-clock-o',
		            date: 'fa fa-calendar',
		            up: 'fa fa-chevron-up',
		            down: 'fa fa-chevron-down',
		            today: 'fa fa-calendar-o',
		            clear: 'fa fa-bin',
		            close: 'fa fa-times'
	    		}
            });

            $('.dfcp-popover .datetimepicker-2').datetimepicker({
            	widgetPositioning: {
                    horizontal: 'right'
                },
                icons: {
	    			next: 'fa fa-chevron-right',
	    			previous: 'fa fa-chevron-left',
	    			time: 'fa fa-clock-o',
		            date: 'fa fa-calendar',
		            up: 'fa fa-chevron-up',
		            down: 'fa fa-chevron-down',
		            today: 'fa fa-calendar-o',
		            clear: 'fa fa-bin',
		            close: 'fa fa-times'
	    		},
	    		format: 'LT',
            });

            // Close buttons
            $('.dfcp-popover .close, .dfcp-popover .remove-popover').on('click', function(){
                $('.dfcp-popover').remove();
                $('.fc-event').removeClass('event-clicked');
            });

            // Actions link Edit Event
            $('.dfcp-event-action-edit').on('click', function(e){
                e.preventDefault();

                $('.dfcp-popover .main-screen').hide();
                $('.dfcp-popover .edit-event').show();
            });

            // Actions link Remove Event
            $('.dfcp-event-action-remove').on('click', function(e){
                e.preventDefault();

                $('.dfcp-popover .main-screen').hide();
                $('.dfcp-popover .remove-confirm').show();
            });

            // ON Remove COnfirmation if Yes remove the element by its ID
            $('.dfcp-popover .remove-event').on('click', function (e) {
            	e.preventDefault();

            	var eventID = calEvent._id;
            	if ( !eventID )
            		return false;

            	$('.dfcp-popover').remove();
                $('.fc-event').removeClass('event-clicked');
            	bindto.fullCalendar('removeEvents', calEvent._id);
            });
	    },
		events: [
			{
				title: 'All Day Event',
				start: new Date(y, m, 9),
				color: '#008aaf ',
				max: Math.floor(Math.random() * 45) + 10  ,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Long Event',
				start: new Date(y, m, d-5),
				end: new Date(y, m, d-3),
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Repeating Event',
				start: new Date(y, m, d+3, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d+10, 16, 0),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d, 10, 30),
				allDay: false,
				color: '#cc0a9b',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d-3, 10, 30),
				allDay: false,
				color: '#cc0a9b',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d-3, 10, 30),
				allDay: false,
				color: '#0070ab',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d-3, 10, 30),
				allDay: false,
				color: '#0070ab',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d-8, 10, 30),
				allDay: false,
				color: '#cc0a9b',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d-8, 10, 30),
				allDay: false,
				color: '#cc0a9b',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Lunch',
				start: new Date(y, m, d, 12, 0),
				end: new Date(y, m, d, 14, 0),
				allDay: false,
				color: '#cc0a9b',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Birthday Party',
				start: new Date(y, m, d+1, 19, 0),
				end: new Date(y, m, d+1, 22, 30),
				allDay: false,
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			},
			{
				title: 'Mandatory!',
				start: new Date(y, m, 22),
				color: '#d10011',
				max: Math.floor(Math.random() * 45) + 10,
				description: 'Lorem ipsum dolor sit amet, consectetur.'
			}
		]
	});

	bindto.find('.fc-body .fc-row').css('height', '160px');

    // Gethering form data when save button is clicked.
	$('#createEventModal').on('click', '#saveEvent', function () {
		var title = $('#eventTitle').val(); // Title of the event
		var start = $('#start').val(); // start date of the event
		var end = $('#end').val();  // end date of the event
		var eventData;

		if ( title !== 'undefined' )
		{
			eventData = {
				title: title,
				start: moment(start).format(),
				end: moment(end).format()
			};
			$(bindto).fullCalendar('renderEvent', eventData, true);
		}
		$('#createEventModal').modal('hide');
	});

	getMonth(bindto);
	
    if ( $('button.fc-myPrev-button').length > 0 )
    {
    	$('button.fc-myPrev-button').on('click', function (event) { getMonth(bindto); });
    }

    if ( $('button.fc-myNext-button').length > 0 )
    {
    	$('button.fc-myNext-button').on('click', function (event) { getMonth(bindto); });
    }

    if ( $('[calendar-todayview]').length > 0 )
    {
    	$('[calendar-todayview]').on('click', function (event) { bindto.fullCalendar('changeView', 'agendaDay'); getMonth(bindto); });
    }

    if ( $('[calendar-monthview]').length > 0 )
    {
    	$('[calendar-monthview]').on('click', function (event) { bindto.fullCalendar('changeView', 'month'); getMonth(bindto); bindto.find('.fc-body .fc-row').css('height', '160px'); });
    }

    if ( $('[calendar-weekview]').length > 0 )
    {
    	$('[calendar-weekview]').on('click', function (event) { bindto.fullCalendar('changeView', 'agendaWeek'); getMonth(bindto); });
    }

    if ( $('[calendar-dayview]').length > 0 )
    {
    	$('[calendar-dayview]').on('click', function (event) { bindto.fullCalendar('changeView', 'basicDay'); getMonth(bindto); });
    }

    if ( $('#secondary-calendar').length > 0 )
    {
    	$('#secondary-calendar').datetimepicker({
    		inline: true,
    		icons: {
    			next: 'fa fa-chevron-right',
    			previous: 'fa fa-chevron-left',
    			time: 'fa fa-clock-o',
	            date: 'fa fa-calendar',
	            up: 'fa fa-chevron-up',
	            down: 'fa fa-chevron-down',
	            today: 'fa fa-calendar-o',
	            clear: 'fa fa-bin',
	            close: 'fa fa-times'
    		},
    		format: 'DD/MM/YYYY'
    	});
    }
});
