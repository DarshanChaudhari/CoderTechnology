import { Component, OnInit } from '@angular/core';
import { EmpDataService } from '../services/emp-data.service';

@Component({
  selector: 'app-employee-list-service',
  templateUrl: './employee-list-service.component.html',
  styleUrls: ['./employee-list-service.component.css']
})
export class EmployeeListServiceComponent implements OnInit {
  employees :any[];

  constructor(private _employeeService: EmpDataService) { }
  
  ngOnInit() {
    this.getEmployeesfromEmpDataService();
  }

  getEmployeesfromEmpDataService(): void {
    this.employees = this._employeeService.getEmployees();
  }
}
