//변수-호이스팅
result = f1(10, 20)
console.log(result)

var result

function f1(a, b) {
    return a + b
}
