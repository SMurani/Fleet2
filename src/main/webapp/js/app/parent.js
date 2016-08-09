/**
 * Created by sammy on 7/20/16.
 */

/*
(function(){
    var elem = document.createElement("img");
    elem.setAttribute("src", "images/bus5.jpg");
    elem.setAttribute("height", "100%");
    elem.setAttribute("width", "100%");
    elem.setAttribute("alt", "Flower");
    document.getElementById("ajax-content").appendChild(elem);
    document.getElementById("ajax-content").style.padding = "";
})();
*/
(function(){
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


})();