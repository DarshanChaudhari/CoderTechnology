import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

@Injectable()
export class EmpserviceService {

  constructor(private http: HttpClient) {       
  }

  getEmployeeList() {
    return this.http.get('http://localhost:8080/Spring_300_MVC_JPA_REST_Ng/hr/emps');
  }

}
