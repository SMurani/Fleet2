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
	report: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./listUser/report", true);
		ajax.send();
	},


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
	add1: function(){
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					document.getElementById('ajax-content').innerHTML = ajax.responseText;
				}
			}
		}

		ajax.open("GET", "./morris.html", true);
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


		console.log(fname.length);



		if (!fname || fname.length==0) {
			document.getElementById('fname-ajax-content').innerHTML = "First name cannot be blank";
		}
		else if (!lname ||lname.length==0) {
			document.getElementById('lname-ajax-content').innerHTML = "Last name cannot be blank";
		}
		else if (id.length ==0) {
			document.getElementById('iname-ajax-content').innerHTML = "Id number cannot be blank";
		}
		else if (username.length ==0) {
			document.getElementById('uname-ajax-content').innerHTML = "username number cannot be blank";
		}
		else if (fname.length <=2){
			document.getElementById('fname-ajax-content').innerHTML = "Please enter a name that is more than 2 characters";
		}
		else if (password.length ==0){
			document.getElementById('ppname-ajax-content').innerHTML = "Password cannot be blank";
		}
		else if (password !=confpass){
			document.getElementById('pname-ajax-content').innerHTML = "password does not match";
		}
		else if ((password == confpass) && (password.length >0)){

			ajax.onreadystatechange = function(){

				if(ajax.readyState == 4){
					if(ajax.status == 200){
						window.location="login.jsp";
						

						document.getElementById('successful-ajax-content').innerHTML = ajax.responseText;
					}
				}
			}

			ajax.open("POST", "./person/action/add", true);
			ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
			ajax.send(params);

		}
		else{
			document.getElementById('register-ajax-content').innerHTML = "An error occured, please input your details again";

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

			/*if(ajax.readyState<4)
				document.getElementById('ajax-form-content').innerHTML = "<img src='images/people/25x25/1.jpg' width='20px' height='20px'/> Processing...";
*/
			if(ajax.readyState == 4){
				if(ajax.status == 200){

					document.getElementById('login-ajax-content').innerHTML = ajax.responseText;

				}
			}
		}

		ajax.open("POST", "./autostars", true);
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
	},
	update: function(id){
		var me = this;
		var ajax = new XMLHttpRequest();

		ajax.onreadystatechange = function(){

			if(ajax.readyState == 4){
				if(ajax.status == 200){
					me.list();
				}
			}
		}
		alert("Approve this Customer?");
		ajax.open("GET", "./listUser/update?id="+id, true);
		ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		ajax.send();
	},


}







