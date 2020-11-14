package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import com.timekeeper.app.services.EmployeeService;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="payroll_records")
public @Data class Payroll {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int payrollId;
    private int employeeId;
    private String date;
    private double hoursWorked;
    private double amountPaid;

    public double calculateAmountPaid() {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.fetchEmployeeById(this.employeeId);
        this.setAmountPaid(hoursWorked * employee.getWage());
        return hoursWorked * employee.getWage();
    }
}
