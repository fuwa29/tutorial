/* ===========================================================================*/
/* First Javascript app TETRIS */
/* width =10boxes        */
/* height=20boxes        */
/* ===========================================================================*/
/* idで指定されてるテキストを書き換えるテスト */
document.getElementById("hello_text").textContent = "初めてのJavascript";

/* ---------------------------------------------------------------------------*/
/* main function area */
/* ---------------------------------------------------------------------------*/
var count = 0;
var cells;
var msec = 1000;
setNumberToTable();
loadTable();
setInterval(function() {
	// 何回目かをカウント変数を増やしていく
	count++;
	document.getElementById("hello_text").textContent = "初めてのJavascript(" + count + ")";
	fallBlocks();
},msec);

/* ---------------------------------------------------------------------------*/
/* functon area */
/* ---------------------------------------------------------------------------*/
/*--- load table --- */
function loadTable() {
	cells = [];
	var td_array = document.getElementsByTagName("td");
	var index = 0;
	for(var row=0; row<20; row++) {
		cells[row] = [];
		for(var col=0; col<10; col++) {
			cells[row][col] = td_array[index];
			index++;
		}
	}
}

/*--- fall Blocks ---*/
function fallBlocks() {
	// last row number
	var lastrow_no = 19;

	// to empty last row
	for(var i=0; i<10; i++) {
		console.log(cells[lastrow_no][i])
		cells[lastrow_no][i].className = "";
	}
	// to empty last row - 1
	for(var row=lastrow_no-1; row>=0; row--) {
		for(var col=0; col<10; col++) {
			if(cells[row][col].className !== "") {
				cells[row+1][col].className = cells[row][col].className;
				cells[row][col].className = "";
			}
		}
	}
}

/*--- test function --- */
function setNumberToTable() {
	var td_array = document.getElementsByTagName("td");
	var index = 0;
	for (var row = 0; row < 20; row++) {
		for (var col = 0; col < 10; col++) {
	//		td_array[index].textContent = index;
			td_array[index].textContent = "[" + row + "," + col + "]";
			index++;
		}
	}

	for (var row = 0; row < 20; row++) {
		for (var col = 0; col < 10; col++) {
	//		td_array[index].textContent = index;
			td_array[index].textContent = "[" + row + "," + col + "]";
			index++;
		}
	}
}
