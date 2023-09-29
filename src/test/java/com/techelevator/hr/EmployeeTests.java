package com.techelevator.hr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class EmployeeTests {
    private Employee employee;
    private Map<String, Double> servicesRendered;

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }
    public void EmployeeDiscount(){
        Employee employee = new Employee("Michael", "Myers");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Sitting", 100.00);
    }

}
