var num = 0;
var count = 0;
var counter = 0;
for (num = 0; num <= 20; num++) {
    if (num % 2 == 0) {
        console.log(num);
        counter++;
        console.log(counter);
        continue;
    }
    count++;
}
console.log(count);
