/* ---------------------------------------------------------------------------*/
/* First Javascript app TETRIS */
/* width =10boxes        */
/* height=20boxes        */
/* ---------------------------------------------------------------------------*/
/* idで指定されてるテキストを書き換えるテスト */
document.getElementById("hello_text").textContent = "初めてのJavascript";

/*
var count = 0;
setInterval(function() {
	// 何回目かをカウント変数を増やしていく
	count++;
	document.getElementById("hello_text").textContent = "初めてのJavascript(" + count + ")";
  },1000);
*/

var td_array = document.getElementsByTagName("td");
var index = 0;
for (var row = 0; row < 20; row++) {
	for (var col = 0; col < 10; col++) {
//		td_array[index].textContent = index;
//		td_array[index].textContent = "[" + row + "," + col + "]";
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

