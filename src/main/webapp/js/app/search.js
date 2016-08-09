/**
 * Created by sammy on 7/31/16.
 */
function getElById(el){
    return document.getElementById(el);
}

function formDisplay(form){
    var ajax = new XMLHttpRequest();
    ajax.onreadystatechange = function(){
        if(ajax.readyState<4){

            getElById('ajax-content').innerHTML = "Loading...";


        }

        if(ajax.readyState == 4){
            if(ajax.status == 200){
                getElById('ajax-content').innerHTML = form;
            }
        }
    }

    ajax.open("GET", './index.jsp', true);
    ajax.send();

}

function searchPerson(){

    var form = 	"<div class='panel'>" +

        "<div class='panel-heading'>" +
        "<h1 class='panel-title'>Search Drivers by ID</h1>" +
        "</div>" +
        "<div class='panel-body container-fluid'>" +
        "<form autocomplete='off' method='post' action='#'>" +

        "<div class='form-group form-material floating'>" +
        "<label class='floating-label'>Enter Driver By ID </label>" +
        "<input type='text' class='form-control col-sm-3' id='search' name='search' />" +
        "</div>" +
        "</form>" +
        "<a class='btn btn-primary' onclick='searchDriver();'>Search</a>" +
        "</div>" +
        "</div>";

    formDisplay(form);
}
//Dispaly Search Results

function search(){
    var context = this;
    context.ajaxRequest.call({
        httpMethod: 'GET',
        responseTarget: 'search',
        updateTarget: function (resp){
            var div = '<div class="container text-center"><p></p>'
                +'<form class="form-inline" role="form" action="./search" method="post">'
                +'	<label><h4>Search an event by:</h4></label>'
                +'<select class="form-control" name="searchvalue">'
                +'        	      <option value="Name">Name</option>'
                +'          	      <option value="Venue">Venue</option>'
                +'            	      <option value="Description">Description</option>'
                +'                   </select>'
                +'   <input type="text" class="form-control" name="parameter" placeholder="Enter search parameter: "/>'
                +'  <a class="btn btn-large btn-warning" onclick ="App.Cmp.submit()" name="search" ">SEARCH</a>'
                +'</form>'

                +'</div>'
            context.getEl('search').innerHTML =div;
        }
    })
    
}
function searchResults(uri){
    var ajax = new XMLHttpRequest();

    ajax.onreadystatechange = function(){
        if(ajax.readyState<4){

            getElById('ajax-content').innerHTML = "Loading...";
        }

        if(ajax.readyState == 4){
            if(ajax.status == 200){


            }
        }
    }
    ajax.open('GET', uri, true);
    ajax.send();
}


function viewPeople(){

    displayStaff('./search/*');

}
function searchDriver() {
    var me=this;
    var ajax=new XMLHttpRequest();

    var search=document.getElementById('search').value;

    
    var params = 'search=' + encodeURIComponent(search);
    console.log(params);


    var message = "Saved successfully!";
    save(params, "./search/*", message);


}



/*function searchTech(){
    var search = getElById('search').value;

    var params = 'search=' +encodeURIComponent(search);

    var message = "Saved successfully!";
    save(params, "./search/!*", message);
}*/

function save(params, uri, message){
    var ajax = new XMLHttpRequest();
    ajax.onreadystatechange = function(){
        if(ajax.readyState == 4){
            if(ajax.status == 200){
                var response = ajax.responseText;
                //console.log(response);
                var jsonRecords = JSON.parse(response);
                console.log(jsonRecords);

                if(jsonRecords == 0){
                    alert("Oops.Json less than 0");

                }else{

                   

                    var data = "<div class=\"panel\">";
                    data+="<header class=\"panel-heading\">";
                    data+="<h3 class=\"panel-title\">";
                    data+="Work List for "

                    for (var i in jsonRecords){
                        var id = jsonRecords[i].id;

                    }
                    data+="<h3 style='color:red;'>"+ jsonRecords[i].assign +"</h3>";
                    data+="</h3>";
                    data+="</header>";
                    data+="<div class=\"panel-body\">";
                    data+="<div class=\"table-responsive\">";
                    data+="<table class=\"table table-hover dataTable table-striped\" id=\"exampleFixedHeader\">";
                    data+="<thead>";
                    data+="<tr>";
                    data+="<th>Title</th>";
                    data+="<th>Trouble Description</th>";
                    data+="<th>Client Name</th>";
                    data+="<th>Ticket Status</th>";
                    data+="<th>Last Updated</th>";
                    data+="</tr>";
                    data+="</thead>";
                    data+="<tbody>";

                    for (var i in jsonRecords){
                        var id = jsonRecords[i].id;
                        data+="<tr>";
                        data+="<td>"+jsonRecords[i].fname+"</td>";
                        data+="<td>"+jsonRecords[i].lname+"</td>";
                        data+="<td>"+jsonRecords[i].reportedby+"</td>";
                        data+="<td>"+jsonRecords[i].status+"</td>";
                        data+="<td>"+jsonRecords[i].postdate+"</td>";
                        data+="</tr>";

                    }
                    data+="</tbody>";
                    data+="</table>";
                    data+="</div>";
                    data+="</div>";
                    data+="</div>";

                    getElById('ajax-content').innerHTML = data;

                }

            }
            else
                alert("Nothing to show ");
        }
    }
    ajax.open("POST", uri, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(params);
}
