function Calculator() {
    this.result = 0;
    this.plus = function(value) {
        this.result = this.result + value;
    }
    this.minus = function(value) {
        this.result = this.result - value;
    };
}

var c1 = new Calculator();

c1.plus(10);
c1.plus(20);
c1.plus(7);
console.log(c1.result);