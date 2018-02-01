//자바스크립트로 서버 만들기
const http = require('http');
const server = http.createServer(function(req, resp) {
    resp.writeHead('200', {
        'Content-Type' : 'text/application/json;charset=UTF-8',
        'Access-Control-Allow-Origin' : '*'
    });
    resp.write('{"message":"자바100기"}');
    resp.end();
});
server.listen(8888, function() {
    console.log("서버 실행중...");
});