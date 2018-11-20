import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from '../home/home.component';
import { EmployeeInfoComponent } from '../employee-info/employee-info.component';
import { EmployeeComponent } from '../employee/employee.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';
import { EmployeeListServiceComponent } from '../employee-list-service/employee-list-service.component';


const appRouters: Routes = [
    {path: 'home',component:HomeComponent},
    {path: 'employees',component:EmployeeInfoComponent},
    {path: 'employeeslist',component:EmployeeComponent},
    {path:'employeeslistService',component:EmployeeListServiceComponent},
    {path: '',redirectTo:'/home',pathMatch: 'full'},
    {path: '**',component:PageNotFoundComponent}
  ];


// @NgModule({
//   declarations: [],
//   imports: [
//     CommonModule
//   ]
// })


@NgModule({
  imports: [RouterModule.forRoot(appRouters)],
  exports: [RouterModule]
})

export class AppRoutingSModule { }
