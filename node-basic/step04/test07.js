"use strict"
function play(nickname, spec) {
    console.log("자동차명= ", spec.model);
    console.log("cc= ", spec.cc);
    spec.run();
}
var car = {
    model : "소나타",
    cc : 1998,
    run : function() {
        console.log("달린다");
    }
};
play("붕붕이", car);

play("방방", {
    model : '티코',
    cc : 800,
    run : function() {
        console.log("부릉~~~~~~");
    }
})
