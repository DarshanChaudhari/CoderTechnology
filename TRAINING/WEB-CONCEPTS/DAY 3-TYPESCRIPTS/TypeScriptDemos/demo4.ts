var num: number = 0;
var count: number = 0;



for (num = 0; num <=20; num++) {
    if (num % 2 == 0) {
        console.log(num);        
        continue;
    }
    count++;
}

console.log(count);