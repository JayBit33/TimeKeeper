package com.timekeeper.app.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// JUnit Test for Payroll.java
class PayrollTest
{
    Payroll testPayroll;

    @Test
    void payrollConstructorGetSet()
    {
        givenPayrollIsInitialized();
        whenPayrollIDIsSet(8675);
        whenEmployeeIDIsSet(309);
        whenDateIsSet("01/10/11");
        whenHoursWorkedIsSet(35.75);
        whenAmountPaidIsSet(56.78);
        thenAssertFieldsAre(8675, 309, "01/10/11", 35.75, 56.78);
    }

    private void givenPayrollIsInitialized()
    {
        testPayroll = new Payroll();
    }

    private void whenPayrollIDIsSet(int payrollID)
    {
        testPayroll.setPayrollId(payrollID);
    }

    private void whenEmployeeIDIsSet(int employeeID)
    {
        testPayroll.setEmployeeId(employeeID);
    }

    private void whenDateIsSet(String date)
    {
        testPayroll.setDate(date);
    }

    private void whenHoursWorkedIsSet(double hoursWorked)
    {
        testPayroll.setHoursWorked(hoursWorked);
    }

    private void whenAmountPaidIsSet(double amountPaid)
    {
        testPayroll.setAmountPaid(amountPaid);
    }

    private void thenAssertFieldsAre(int payrollID, int employeeID, String date, double hoursWorked, double amountPaid)
    {
        assertEquals(testPayroll.getPayrollId(), payrollID);
        assertEquals(testPayroll.getEmployeeId(), employeeID);
        assertEquals(testPayroll.getDate(), date);
        assertEquals(testPayroll.getHoursWorked(), hoursWorked);
        assertEquals(testPayroll.getAmountPaid(), amountPaid);
    }
}