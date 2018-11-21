import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { EmployeeComponent } from './employee/employee.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmployeeListServiceComponent } from './employee-list-service/employee-list-service.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { HttpServiceCallComponent } from './http-service-call/http-service-call.component';



const routes: Routes = [
  {path: 'home',component:HomeComponent},
  {path: 'employees',component:EmployeeInfoComponent},
  {path: 'employeeslist',component:EmployeeComponent},
  {path:'employeeslistService',component:EmployeeListServiceComponent},
  {path:'createmployee',component:CreateEmployeeComponent},
  {path:'HttpServiceCall',component:HttpServiceCallComponent},
  {path: '',redirectTo:'/home',pathMatch: 'full'},
  {path: '**',component:PageNotFoundComponent}
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
