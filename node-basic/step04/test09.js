function Calculator() {
    this.result = 0;
}

Calculator.prototype.plus = function(value) {
    this.result += value;
}
Calculator.prototype.minus = function(value) {
    this.result -= value;
}

var c1 = new Calculator();
c1.plus(10);

Calculator.abs = function(value) {
  return (value < 0) ? value * -1 : value;  
};
console.log(Calculator.abs(-100));
console.log(Calculator.abs(100));