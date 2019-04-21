/* sketch app */
window.addEventListener('load', function(){
    alert('loaded');

    var canvas = document.getElementById('canvas');
    // debug
    alert(canvas);

    canvas.width  = window.innerWidth  - 30;
    canvas.height = window.innerHeight - 30; 

    // 描画する線の色とか太さとかを指定
    var ctx = canvas.getContext('2d');
    ctx.lineWidth =5;            // 太さ
    ctx.strokeStyle = '#888888'; // 色指定

    var down = false;
    // canvas上でマウスボタンが押される
    canvas.addEventListener('mousedown', function (e) {
        down = true;
        ctx.beginPath();
        ctx.moveTo(e.clientX, e.clientY);
    }, false);

    // canvas上でマウスが動く
    window.addEventListener('mousemove', function (e) {
        if(!down) return;
        console.log(e.clientX, e.clientY);
        ctx.lineTo(e.clientX, e.clientY);
        ctx.stroke();
    }, false);

    // マウスボタンが離される
    window.addEventListener('mouseup', function (e) {
        if(!down) return;
        ctx.lineTo(e.clientX, e.clientY);
        ctx.stroke();
        ctx.closePath();
        down = false;
    }, false);

    // 色を変更するロジック
    var colors = document.getElementById('colors').childNodes;
    for (var i=0, color; color = colors[i]; i++){
        if(color.nodeName.toLowerCase() != 'div') continue;
        color.addEventListener('click', function(e) {
            var style = e.target.getAttribute('style');
            // debug
            alert(style);
            var color = style.match(/backbround: (#......)/);
            // debug
            alert(color);
            ctx.strokeStyle = color;
        })
    }

},false)