package com.anusha.Hewlett;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeManager {

    private Employees employees;

    public EmployeeManager() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(
                new Employee(
                        "Anusha",
                        "K",
                        101,
                        "anusha@example.com",
                        "Software Engineer"
                )
        );
        employeeList.add(
                new Employee(
                        "Rahul",
                        "Kumar",
                        102,
                        "rahul@example.com",
                        "Backend Developer"
                )
        );

        employeeList.add(
                new Employee(
                        "Priya",
                        "Sharma",
                        103,
                        "priya@example.com",
                        "Software Engineer"
                )
        );

        employees = new Employees();
        employees.setEmployees(employeeList);
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}