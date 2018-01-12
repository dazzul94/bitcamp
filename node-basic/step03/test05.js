var obj = new Object();

obj.name = "홍길동";
obj.age = 20;
obj["home tel"] = "111-1111";
obj["office tel"] = "222-2222";
obj.plus = function(a,b) {
    console.log(a+ b)
}
obj.working = true;


console.log(obj.name)
console.log(obj['age'])
console.log(obj['home tel'])
console.log(obj['office tel'])
obj.plus(10,20);

