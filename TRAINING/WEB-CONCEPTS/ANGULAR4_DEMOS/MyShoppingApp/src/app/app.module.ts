import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EmployeeComponent } from './employee/employee.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { EmpPipe } from './pipes/emp.pipe';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { Routes, RouterModule } from '@angular/router';
import { AppRoutingSModule } from './app-routing-s/app-routing-s.module';
import { EmpDataService } from './services/emp-data.service';
import { EmployeeListServiceComponent } from './employee-list-service/employee-list-service.component';



//  This is to used by app-routing.module.ts uncomment it will also work
// const appRouters: Routes = [
//   {path: 'home',component:HomeComponent},
//   {path: 'employees',component:EmployeeInfoComponent},
//   {path: 'employeeslist',component:EmployeeComponent},
//   {path: '',redirectTo:'/home',pathMatch: 'full'},
//   {path: '**',component:PageNotFoundComponent}
// ];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmployeeComponent,    
    ContactUsComponent, EmpPipe, EmployeeInfoComponent, PageNotFoundComponent, EmployeeListServiceComponent, EmployeeListServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //AppRoutingSModule
    // RouterModule.forRoot(appRouters)  for self app.module.ts uncomment this and comment uncomment line
  ],
  // Adding empdataservice in provider who is providing the services 
  providers: [EmpDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
