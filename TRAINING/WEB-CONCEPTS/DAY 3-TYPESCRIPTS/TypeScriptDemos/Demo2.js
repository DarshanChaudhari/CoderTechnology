var fname = "Darshan";
var score1 = 50;
var score2 = 42.50;
var sum = score1 + score2;
console.log("name is " + fname);
console.log("first score :" + score1);
console.log("second score :" + score2);
console.log("sum of the scores : " + sum);
var vname = "chaudhari";
console.log("value vname is :" + vname);
// The Variable stores a value of type string
var bname;
console.log("value bname is :" + bname);
//This variable is a string variable.The variable's value is set to // undefined by default.
var cname = "Darsh";
console.log("vale cname is : " + cname);
// The variable's type is infered from the data type of the value'
// Here, the variable is of the type string
var lname;
// The Variable's data type is any/ Its value is set to undefined by defualt;
console.log("value lname : " + lname);
//Example : Variable Scope
var global_num = 12; //global variable
var Employee = /** @class */ (function () {
    function Employee() {
        this.num_val = 12; //  class variable
    }
    Employee.prototype.storeNum = function () {
        var local_num = 14; //  Local variable
        console.log("Inside the class " + global_num);
        console.log("Inside the class " + local_num);
    };
    Employee.sval = 10; // static variable
    return Employee;
}());
console.log("Global num : " + global_num);
console.log(Employee.sval); // static variable
var obj = new Employee();
console.log("Global num : " + obj.num_val);
console.log("inside class 1 " + obj.storeNum());
