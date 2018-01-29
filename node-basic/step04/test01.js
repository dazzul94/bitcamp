var obj1 = new Object();
obj1.result = 0;
obj1.plus = function(value) {
    this.result += value;
}

var obj2 = {};
obj2.result = 0;
obj2.plus = function(value) {
    this.result += value;
}
obj2.plus(10);
obj2.plus(20);
console.log(obj2.result);
console.log("-----------------");


var obj3 = {result: 0, 
            plus : function(value) {this.result += value;}, 
            minus: function(value) {this.result -= value;}
            };
obj3.plus(10);
obj3.plus(20);
console.log(obj3.result);
console.log("-----------------");