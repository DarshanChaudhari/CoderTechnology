import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { EmplistComponent } from './components/emplist/emplist.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'employeeslist',component:EmplistComponent},
  {path:'**',component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
