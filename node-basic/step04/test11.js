var obj = {
        name : "홍길동",
        kor : 100,
        eng : 98,
        math : 38
}
for (var i in obj) { //객체인 경우 i 에는 index가 아니라 프로퍼티 명이 저장된다 .
console.log(obj[i]); //자바 스크립트에서의 프로퍼티는 객체의 변수?
}
