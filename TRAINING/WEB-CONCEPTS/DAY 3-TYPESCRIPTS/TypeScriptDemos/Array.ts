function addNumbers(...nums: number[]) {
    var i:number;
    var sum: number = 0;
    

    for (i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    console.log("sum of the number ",sum)
}

addNumbers(1,2,3)
addNumbers(10,10,10,10,10,10)