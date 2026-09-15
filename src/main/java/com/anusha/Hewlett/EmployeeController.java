package com.anusha.Hewlett;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee){
         employeeManager.addEmployee(employee);
    }
}