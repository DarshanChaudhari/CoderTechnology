import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/Employee';
import { EmployeeType, EmployeeEnum } from '../model/EmployeeEnum';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  name = "Employee Information";
  FirstName = "Darshan";
  LastName = "Chaudhari";
  Gender = "Male";
  Age = "30";

  // If condition
  ShowFaculty:boolean=true;
  Faculty:string = "Sandeep Soni";

// Creating Arrays
  Subjects:string[] = ["MS.NET","JAVA","SHAREPOINT"];

 employees :any[]  = [
    {
      Code : 'emp101',
      Name : "Rashmi",
      Gender : 'Female',
      AnnualSalary : 5500,
      DateofBirth : '9/6/1985'
       },
       {
        Code : 'emp102',
        Name : "Anushka",
        Gender : 'Female',
        AnnualSalary : 5500,
        DateofBirth : '9/6/1985'
        },
        {
          Code : 'emp103',
          Name : "Parth",
          Gender : 'Male',
          AnnualSalary : 5500.95,
          DateofBirth : '9/6/1982'
        }
  ];
  
  constructor() { }
  //Function
  myConcat ():string {
    return this.FirstName + " " + this.LastName;
  }

  ngOnInit() {
  }

  // creating an object
    emp : Employee= new Employee(101,"Darshan",1000000);

    
      enumEmployees = [
        new EmployeeEnum(1,"E1",10000,EmployeeType.Daily),
        new EmployeeEnum(2,"E2",10000,EmployeeType.Permanent),
        new EmployeeEnum(3,"E3",10000,EmployeeType.Retired),
        new EmployeeEnum(4,"E3",10000,EmployeeType.Contract)
      ]

      selectedEmployee = this.enumEmployees[0];
    

}
