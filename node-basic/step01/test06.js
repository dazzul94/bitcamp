


"use strict"
var name = "홍길동"

function test() {
    var name2;
    
    name = "임꺽정"; //모듈변수(페이지변수)(글로벌변수)
    name2 = "유관순"; //로컬변수
}
test()
console.log(name)
console.long(name2)
   
