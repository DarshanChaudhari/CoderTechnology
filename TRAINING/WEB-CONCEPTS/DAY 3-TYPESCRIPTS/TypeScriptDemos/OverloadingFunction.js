function disp_details(id, name, mail_id) {
    // console.log("ID is : ", id);
    // console.log("Name is :", name);
    if (mail_id != undefined)
        console.log("Email Id : ", mail_id);
    if (id != undefined)
        console.log("Id : ", id);
    if (name != undefined)
        console.log("Name : ", name);
}
disp_details(123, "darshan");
console.log("**************************************");
disp_details(111, "chaudhari", "dasrhan.chaudhari@gmail.com");
console.log("**************************************");
disp_details();
