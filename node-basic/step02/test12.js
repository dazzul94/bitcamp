function play(a,b,fn) {
    fn(a,b);
}



play(1, 2, function plus(a,b) {
    console.log(a, '+', b, '=', a + b);
})
play(2, 5, function minus(a,b) {
    console.log(a, '-', b, '=', a - b);
})