# Employeemanagerapp

We have installed Node.js and in cmd to install angular cli run ' npm install -g @angular cli'

After installation of angular cli using npm (node package manager)
To create, build, and serve a new, basic Angular project on a development server, go to the parent directory of your new workspace and use the following commands

ng new employeemanagerapp
cd employeemanagerapp
ng serve

After running this command you will receive a link, run it on your browser and you can see your new application running.

Now whatever changes you make in your frontend code will reflect on the browser.


Note : Since the port of the backend(localhost:8080) and frontend (localhost:4200) are different we need to write a CORS configuration code
in the backend.(Using this config backend will allow a request from frontend even though the port is different)
