var arr = [10,20,30,40]
for (var i in arr) {
console.log(arr[i]);
}

console.log("kkkkkkkkkkkkkkkkkkkkk")
for (var value of arr) {
    console.log(value)
}
console.log("1111111111111111111")
arr.forEach(function(value,index){
    console.log(value,index)
});