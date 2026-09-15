package com.anusha.Hewlett;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeControllerTest {

    @Test
    void testGetEmployees() {
        EmployeeManager employeeManager = mock(EmployeeManager.class);
        EmployeeController controller = new EmployeeController(employeeManager);
        Employees employees = new Employees();
        when(employeeManager.getEmployees()).thenReturn(employees);
        Employees result = controller.getEmployees();
        assertNotNull(result);
        assertEquals(employees, result);
    }

    @Test
    void testAddEmployee() {
        EmployeeManager employeeManager = mock(EmployeeManager.class);
        EmployeeController controller = new EmployeeController(employeeManager);
        Employee employee = new Employee(
                "Anusha",
                "K",
                104,
                "anusha@test.com",
                "Software Engineer"
        );
        controller.addEmployee(employee);
        verify(employeeManager).addEmployee(employee);
    }
}