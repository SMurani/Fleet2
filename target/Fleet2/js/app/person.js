var person = {
	list2: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./person/action", true);
		ajax.send();
	},
	list: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./listUser", true);
		ajax.send();
	},
	/*add: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./company/addPerson.jsp", true);
		ajax.send();
	},*/
	add: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./car/addUser.jsp", true);
		ajax.send();
	},

	save: function(){
		var thisInstance = this;
		var ajax = new XMLHttpRequest();


		var fname = document.getElementById('regfname').value;
		var lname = document.getElementById('reglname').value;
		var id = document.getElementById('regid').value;
		var username = document.getElementById('regusername').value;
		var password = document.getElementById('regpassword').value;
		var confpass = document.getElementById('regconfirmpass').value;

		var params = 'fname=' + encodeURIComponent(fname)
			+ '&lname=' + encodeURIComponent(lname)
			+ '&id=' + encodeURIComponent(id)
			+ '&username=' + encodeURIComponent(username)
			+ '&password=' + encodeURIComponent(password);




		if (password == confpass){

			ajax.onreadystatechange = function(){

				if(ajax.readyState == 4){
					if(ajax.status == 200){

						document.getElementById('register-ajax-content').innerHTML = ajax.responseText;
					}
				}
			}

			ajax.open("POST", "./person/action/add", true);
			ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
			ajax.send(params);

		}
		else{
			document.getElementById('register-ajax-content').innerHTML = "Password does not match";

		}


	},
	tryLogin: function(){
		var thisInstance = this;
		var ajax = new XMLHttpRequest();


		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;

		var params = 'username=' + encodeURIComponent(username)
			+ '&password=' + encodeURIComponent(password);



		ajax.onreadystatechange = function(){

			if(ajax.readyState<4)
				document.getElementById('ajax-form-content').innerHTML = "<img src='images/people/25x25/1.jpg' width='20px' height='20px'/> Processing...";

			if(ajax.readyState == 4){
				if(ajax.status == 200){

					document.getElementById('login-ajax-content').innerHTML = ajax.responseText;

				}
			}
		}

		ajax.open("POST", "./welcome", true);
		ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
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
		alert("Delete this Record?");
		ajax.open("DELETE", "./listUser/?id="+id, true);
		ajax.send();
	}
}




