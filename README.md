# RMIT SEPT 2021 Major Project

Technologies used: ReactJS, SpringBoot, MySQL

Please ensure that all dependencies have been downloaded
 
## To run the application locally for development:
1) cd into FrontEnd/myfirstapp and run "docker build -f Dockerfile.mysql -t bookeroodb:latest ."
2) run the created MySQL image
3) cd into each and every microservices (loginmicroservices, bookservices, orderservices)
4) run "mvn -B -DskipTests clean package"
5) run "mvn spring-boot:run"
6) cd into FrontEnd/myfirstapp
7) run "npm install"
8) run "npm start"
