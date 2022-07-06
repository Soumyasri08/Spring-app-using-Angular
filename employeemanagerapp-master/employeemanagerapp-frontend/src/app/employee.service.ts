//The operations which stated here mirrors the operations in backend so that we can use all those function in our components.

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class EmployeeService {
  private apiServerUrl = environment.apiBaseUrl; //passing the baseurl from environment

  constructor(private http: HttpClient){}

  //Here the return type is array since we are requesting info of all the employees.
  // We are using get operation
  public getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/all`);
  }

  //Since we are adding an employee the operation we perform is post
  // Here we are performing operation on a single employee which is of type Employee(similar for put)
  public addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(`${this.apiServerUrl}/employee/add`, employee);
  }

  //Here we are updating the record of an already exsisting employee so it is PUT
  public updateEmployee(employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.apiServerUrl}/employee/update`, employee);
  }

  // Delete operation is done using 'id' which is of type 'number' and it doesn't return anything just a httpstatus, so 'void'
  public deleteEmployee(employeeId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/employee/delete/${employeeId}`);
  }
}
