var arr1 = [];
console.log(arr1.length);
arr1[0] = 10;
arr1[1] = 20;
//자바 스크립트에서 의 배열은 가변적
console.log(arr1.length);

arr1[10] = 100;

console.log(arr1.length);

arr1[11] = "홍길동";
arr1[12] = true;
arr1[13] = {model: "소나타"};
arr1[14] = funtion(){console.log("Hello, world!")};
console.log(arr1);





















var arr2 = new Object();
console.log(arr2.length);