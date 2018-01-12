"use strict"

function f1() {
    console.log('f1() ....')
}

var f2 = f1
var f3 = f2

var f4 = function() {
    console.log('f4().....')
}

f1 = f4

f1()
f2()
f3()
f4()