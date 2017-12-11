window.onload = function() {
	/*
	 * document is the object that represents the current page a use is on
	 * 
	 * window is the object representing the entire browser
	 * The above function executes anything inside of it once the page is fully loaded.
	 */
	document.getElementById("para1").innerHTML = "ALTER VIA JAVASCRIPT";

	var e1 = document.getElementById("para1");

	//addEventListener("action",functionToBeInvoked,useCapturing) NOTE: if not included false by default
	e1.addEventListener("click", doStuff, false);
	//NOTE: don't add parentheses after the function name

	/*
	 * Event propogation is the occurence of nester actions each triggeringin a specific order
	 * Either from the othermost event first towards the innermost (capturing)
	 * Or executing the innermost first, and working outwards (bubbling)
	 */
	var d1 = document.getElementById("d1");
	var d2 = document.getElementById("d2");
	var d3 = document.getElementById("d3");

	d1.addEventListener("click", d1Click, false);
	d2.addEventListener("click", d2Click, false);
	d3.addEventListener("click", d3Click, false);
}

function doStuff() {
	window.alert("You clicked me!");
	//NOTE: Bad practice to debug using alert windows
}
function d1Click() { //event object is being passed in, but since we don't use it it's dropped
	window.alert("d1");
}
function d2Click(event) {
	window.alert("d2");
	event.stopPropagation();
}
function d3Click() {
	window.alert("d3");
}

function submitValues(){
	
	var num1 = document.getElementById("num1").value;
	var num2 = document.getElementById("num2").value;
	var counter = 0;
	
	
	
	var lazy1 = 0;
	var lazy2 = 0;
	if (num2 > num1){
		lazy1 = num1;
		lazy2 = num2;
	}
	else {
		lazy2 = num1;
		lazy1 = num2;
	}
	for (counter = lazy1 ;counter <= lazy2;counter++){
		var tableRow = document.createElement('tr');
		var tableData1 = document.createElement('td');
		var tableData2 = document.createElement('td');
		
		var td1 = document.createTextNode(counter);
		var td2;
		if (counter%3 == 0 && counter%5 == 0){
			td2 = document.createTextNode("fizzbuzz");
		}
		else if (counter%3 == 0 && counter%5 != 0){
			td2 = document.createTextNode("fizz");
		}
		else if (counter%5 == 0 && counter%3 != 0){
			td2 = document.createTextNode("buzz");
		}
		else{
			td2 = document.createTextNode(counter);
		}
	
	
		tableData1.appendChild(td1);
		tableData2.appendChild(td2);
		
		tableRow.appendChild(tableData1);
		tableRow.appendChild(tableData2);
		document.getElementById("myTable1").appendChild(tableRow);
		
		
	}
	
}
function submitName() {
	var formValue = document.getElementById("inputField").value;

	var tableRow = document.createElement('tr');
	var tableData1 = document.createElement('td');
	var tableData2 = document.createElement('td');
	var tableData3 = document.createElement('td');
	
	tableData3.innerHTML="<b id="+ idCount + " onclick='removeRow(" + id + ")'>X</b>";
	
	var td1 = document.createTextNode(idCount);
	var td2 = document.createTextNode(formValue);


	tableData1.appendChild(td1);
	tableData2.appendChild(td2);
	
	tableRow.appendChild(tableData1);
	tableRow.appendChild(tableData2);
	tableRow.appendChild(tableData3);

	document.getElementById("myTable").appendChild(tableRow);
	idCount++;
}

function removeRow(){
	document.getElementById("" + idCount).remove();
	/*
	 * DOM manipulation methods let us dynamically change our html on the spot.
	 * You can use these methods to traverse to any node in the dom.
	 * --for adding nodes:
	 * createElement -- create a specific tag node
	 * createTextNode -- create a non parsed string
	 * .innerHTML -- change a nodes innerHTML
	 * .parentNode -- move your cursor up one level
	 * .childNodes -- grab all children nodes, NOTE this returns an array of nodes
	 * 
	 * Reference:
	 * https://www.w3schools.com/jsref/dom_obj_all.asp
	 */
}

function triggerError(){
	/*
	 * Javascript does not have exceptions, it has errors
	 * There are 6 main errors
	 * EvalError = deprecated, replaced with SyntaxError
	 * RangeError = Input is out of declared range
	 * ReferenceError - Any time you reference an undeclared var
	 * SyntaxError - 
	 * TypeError - Illegal type conversion
	 * URIError - Illegal chars in URI
	 * 
	 */
	try {
		console.log(p++)
	}
	catch(container) {
		console.log(container.message);
	}
	finally{
		console.log("Finally Always Executes.");
	}
}

var idCount = 0;