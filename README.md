# HPE Software Engineering Job Simulation

This repository contains my work from the HPE Software Engineering Job Simulation on Forage.

## Tech Used

* Java
* Spring Boot
* REST API
* Maven
* JUnit
* Mockito

## Work Done

* Created an Employee class
* Created employee management classes
* Built a REST API using Spring Boot
* Added `GET /employees` to get employee details
* Added `POST /employees` to add a new employee
* Wrote unit tests for GET and POST using JUnit and Mockito

## Main Files

* `Employee.java`
* `Employees.java`
* `EmployeeManager.java`
* `EmployeeController.java`
* `RestServiceApplication.java`
* `EmployeeControllerTest.java`

## Run the Project

Build:

```bash
.\mvnw.cmd clean package
```

Run:

```bash
java -jar target\RestService-0.0.1-SNAPSHOT.jar
```

API:

```text
GET  /employees
POST /employees
```

## Simulation

HPE Software Engineering Job Simulation - Forage
