"use strict"

var f1 = function(){
    console.log("f1()....")
};
var f2 = function(){
    console.log("f2()...")
};
var f3 = () => {
    console.log("f3()...")
};

f1()
f2()
f3()
console.log("----------------------")

function play(a,b,fn) {
    fn(a,b);
}



play(1, 2, (a,b) => {
    console.log(a, '+', b, '=', a + b);
})
play(2, 5, (a,b) => {
    console.log(a, '-', b, '=', a - b);
})