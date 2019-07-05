

window.onload = function(){
    updateAmount();
}


function getTotalAmount(){
    let val = document.getElementById("id").value;
    
	  let xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		     document.getElementById("amount").value = xhttp.responseText;
		    }
	  }
	  xhttp.open("GET", "ajaxRequest?id=" + val, true);
	  xhttp.send(null);
}                   
             
function updateAmount(){
    document.getElementById("id").addEventListener('focusout', getTotalAmount)
}    