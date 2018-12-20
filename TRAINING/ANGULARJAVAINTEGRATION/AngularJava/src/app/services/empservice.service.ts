import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from '../models/Employee';

@Injectable({
  providedIn: 'root'
})

@Injectable()
export class EmpserviceService {

  constructor(private http: HttpClient) {       
  }

  getEmployeeList() {
    return this.http.get("/Spring_300_MVC_JPA_REST_Ng/hr/emps");
    
  }

  addEmployee(emp:Employee) {
    return this.http.post("/Spring_300_MVC_JPA_REST_Ng/hr/emps/create",emp);
  }
}
