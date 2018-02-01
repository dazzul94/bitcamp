//자바스크립트로 서버 만들기
const http = require('http');
const server = http.createServer(function(req, resp) {
    resp.writeHead(
       '404',
       {
       'Content-Type': 'text/plain;charset=UTF-8',
           'Access-Control-Allow-Origin':'*'
        });
    resp.write('hello!');
    setTimeout(function() {
        resp.end();
    }, 3000);
  });
server.listen(8888, function(){
    console.log("서버 실행중...");
});