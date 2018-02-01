//JSON : 자바스크립트의 객체 정보를 문자열로 표현하는 방법
var obj = {
    name: '홍길동',
    "age": 20,
    'tel': '1111-1111'
};
console.log(obj);

var jsonStr = '{"name":"홍길동","age":20,"tel":"111-1111"}'; //문자열은 항상 큰 따옴표

var jsonStr2 = JSON.stringify(obj);
console.log(jsonStr);
console.log(jsonStr2);

