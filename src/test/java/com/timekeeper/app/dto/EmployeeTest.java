package com.timekeeper.app.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Junit test for Employee.java to ensure that lombok functions are imported properly.
class EmployeeTest
{
    Employee testEmployee;

    @Test
    void employeeConstructorGetSet()
    {
        givenEmployeeIsInitialized();
        whenIDIsSet(8675309);
        whenFirstNameIsSet("John");
        whenLastNameIsSet("Doe");
        whenWageIsSet(12.34);
        thenEmployeeVariablesAre(8675309, "John", "Doe", 12.34);
    }

    private void givenEmployeeIsInitialized()
    {
        testEmployee = new Employee();
    }

    private void whenIDIsSet(int id)
    {
        testEmployee.setId(id);
    }

    private void whenFirstNameIsSet(String firstName)
    {
        testEmployee.setFirstName(firstName);
    }

    private void whenLastNameIsSet(String lastName)
    {
        testEmployee.setLastName(lastName);
    }

    private void whenWageIsSet(double wage)
    {
        testEmployee.setWage(wage);
    }

    private void thenEmployeeVariablesAre(int id, String firstName, String lastName, double wage)
    {
        assertEquals(testEmployee.getId(), id);
        /* Separate Asserts for firstname/lastname for full coverage of Employee.java */
        assertEquals(testEmployee.getFirstName(), firstName);
        assertEquals(testEmployee.getLastName(), lastName);
        assertEquals(testEmployee.getWage(), wage);
        assertEquals(testEmployee.getFullName(), (firstName + " " + lastName));
    }
}