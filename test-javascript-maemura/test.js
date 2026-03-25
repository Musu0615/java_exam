'use strict'
// 1
console.log('前村涼');

// 2
let firstName = 'Suzu';
let lastName = 'Maemura';
console.log(lastName +' ' + firstName);

// 3
let item1 = 200 * 3;
let item2 = 250 * 4;
let subtotal = 0;
let tax = 0;
let total = 0;
subtotal = item1 + item2;
tax = subtotal * 0.1;
total = subtotal + tax;

console.log('小計');
console.log(subtotal + '円');
console.log('消費税');
console.log(tax + '円');
console.log('合計金額');
console.log(total + '円');

// 4
let testScore = 101;
if(testScore >= 0 && testScore <= 79){
    console.log('追試です');
}
else if(testScore >= 80 && testScore <= 100){
    console.log('合格です');
}
else{
    console.log('存在しない点数です');
}

// 5
let number = 0;
for(let i = 1; i <= 100; i++){
    number = number + i
}
console.log(number);

// 6
function add(num1,  num2){
    return num1 + num2;
}

function sub(num1, num2){
    return num1 - num2;
}

function multi(num1, num2){
    return num1 * num2;
}

function div(num1, num2){
    return num1 / num2;
}

console.log('5 + 3 = ' + add(5, 3));
console.log('5 - 3 = ' + sub(5, 3));
console.log('5 * 3 = ' + multi(5, 3));
console.log('5 / 3 = ' + div(5, 3));
