//listen to button click event, if user clicks button it will call sendValesToserver method
document.getElementById("submit_button").addEventListener("click", sendvaluesToServer);


function sendvaluesToServer() {
  //get first number input value	
  var firstElementValue=document.getElementById("id1").value;
  //get second number input value
  var secondElementValue=document.getElementById("id2").value;
  //calling xhr method to send values to server
  callXhr(Number.parseInt(firstElementValue),Number.parseInt(secondElementValue));
}

function callXhr(firstNumber, secondNumber){
	var xhr = new XMLHttpRequest();
	//method type{GET,POST} , "Method Url" 
	xhr.open("POST", '/addition', true);
	xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhr.onreadystatechange = function() { // Call a function when the state changes.
	    if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
	    	document.getElementById("output_id").innerHTML=xhr.responseText;
	    }
	};
	//params sending here
	xhr.send("firstNumber="+firstNumber+"&secondNumber="+secondNumber);
}


//document.getElementById('')