//자바스크립트로 서버 만들기
const http = require('http');
const server = http.createServer(function(req, resp) {
    resp.writeHead('200', {
        'Content-Type' : 'text/html;charset=UTF-8',
        'Access-Control-Allow-Origin' : '*'
    });
    resp.write('<p style="background-color:gray;color:white;">자바100기</p>');
    resp.end();
});
server.listen(8888, function() {
    console.log("서버 실행중...");
});