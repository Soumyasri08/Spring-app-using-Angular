# Spring-app-using-Angular

In this Project we are creating a basic web application using Spring boot and Angular
to manage the details of employees.

In this app we are performing operations like Create/add ,delete,update and search the employees.

we have used technologies like
 Front end - angular, javascript,typescript, Html , Css
Database - MySql and frameworks like Postman to perform post and get operations.
HTTPclient to make requests
Frameworks -> IntellIJ for backend and Node.js , angular cli for Frontend and Postman for Database



EXECUTION
-----------------

1. Initially for spring boot app go to Spring initializr and create a project by adding dependencies for web,spring boot and mysql driver and generate the maven project. Open this project in Intellij and write the code

2. Run the application class then the  spring boot starts working.
3.In MYSQL cli create a database for employee and re-run the spring application and you can find the port address.
4. To test the performance of our API we are using postman because browser cannot send request like POST and PUT install postman. After installation go to the postman and paste the port address we received after running our code in intellij, then perform put and post operations. In case of post operation go to body select raw and then change the file context to Json and give the required info and click send.
5.You can check whether data has been added or not using MYSQL cli.


6. Now for frontend install node.js cli after installation enter a comman "npm install -g @angular/cli" to install angular cli package
7.After successful installation enter "ng new employeemanagerapp"
8. Enter cd employeemanagerapp
9. Now for coding frontend install visual studio code and write the code
10. Click run and then go to terminal and enter ng serve make sure your backend is compiled and running
11. you will recieve the port address of the front end after succesfull installation

12. if you receive CORS configuration error go to backend employeeapplication.java class and enter the code for CORS stating the port address of front end so that frontend can send requests to the backend.

13.Now refresh the browser and you can see the app working.
