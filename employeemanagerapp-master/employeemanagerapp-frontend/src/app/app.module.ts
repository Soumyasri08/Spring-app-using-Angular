import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EmployeeService } from './employee.service';
import { HttpClientModule } from '@angular/common/http';import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent
  ],
  //importing all the required modules
  imports: [
    BrowserModule,
    HttpClientModule, FormsModule
  ],
  //we are letting know the app about employeeservice by setting it as provider or root
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
