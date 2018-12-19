import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { Routes } from '@angular/router';
import { EmplistComponent } from './components/emplist/emplist.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

const approutes: Routes =[
  
]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmplistComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
