var jsonStr = '{"name":"홍길동","age":20,"tel":"111-1111"}'; //문자열은 항상 큰 따옴표

var obj  = JSON.parse(jsonStr);
console.log(obj.name);
console.log(obj.age);
console.log(obj.tel);
