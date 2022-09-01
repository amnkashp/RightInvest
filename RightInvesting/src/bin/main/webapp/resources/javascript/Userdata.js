	var baseurl = "http://localhost:8080/RightInvesting/admin/userlist";
	function loadPersons(){
	
	//console.log(data);
	/*var text = "<table border='1'>"
  	for (var i in data) {
    text += "<tr><td>" + data[i].userId + "</td></tr>";	
  	}
  	console.log(text);
  		text += "</table>"
	*/
	   
	
        fetch(baseurl)
            .then(function (response) {
                return response.json();
            })
            .then(function (data) {
                appendData(data);
            })
            .catch(function (err) {
                console.log('error: ' + err);
            });
            
        function appendData(data) {
            var mainContainer = document.getElementById("user");
            for (var i = 0; i < data.length; i++) {
                var div = document.createElement("div");
                div.innerHTML = 'UserID: ' + data[i].userId;
                
                
                mainContainer.appendChild(div);
            }
        }
	
	//document.getElementById("user").innerHTML = 
}
console.log("String");
	window.onload = function(){
	loadPersons();
}



