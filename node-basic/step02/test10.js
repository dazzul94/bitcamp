function play(a,b,fn) {
    fn(a,b);
}
function plus(a,b) {
    console.log(a, '+', b, '=', a + b);
}
function minus(a,b) {
    console.log(a, '-', b, '=', a - b);
}

play(1, 2, plus)
play(2, 5, minus)