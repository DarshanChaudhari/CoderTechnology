import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from 'src/app/services/empservice.service';
import { Employee } from 'src/app/models/Employee';

@Component({
  selector: 'app-emplist',
  templateUrl: './emplist.component.html',
  styleUrls: ['./emplist.component.css']
})
export class EmplistComponent implements OnInit {
  emps:Employee[];


  constructor(private httpclientservice:EmpserviceService) { }

  ngOnInit() {
    this.getEmpList();
  }

  getEmpList() {
    return this.httpclientservice.getEmployeeList().subscribe(emps=> this.emps=<Employee[]>emps);
  }

}
