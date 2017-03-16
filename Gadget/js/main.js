
var busqueda = (function(){
	var boocksearch=function (){
	//console.log("this runnig");
	var search=document.getElementById("search").value;
	document.getElementById("results").innerHTML="";
	console.log(search);
	$.ajax({
		url: "https://www.googleapis.com/books/v1/volumes?q="+search+inauthor+":keyes&key=AIzaSyDBaKQEk2Qd9OTeGviWsRP6SEMtVK8u-x4",
		dataType: "json",
		success: function(data){
			//console.log(data);
			for (var i = 0; i < data.items.length; i++) {
				
				results.innerHTML += "<h2>" + data.items[i].volumeInfo.title 
				+ "</h2>";

			}
		},
		type:"GET"
	});
};
var boton= function(){
var boton =document.getElementById("button");
boton.addEventListener("click",boocksearch,false);
}



  


return{

"boton":boton

};



})();