package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import com.timekeeper.app.services.EmployeeService;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;

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
        Employee employee = employeeService.fetchEmployeeById(1);
        this.setAmountPaid(hoursWorked * employee.getWage());
        return hoursWorked * employee.getWage();
    }

    // Issue with retrieving employee based on Id. Generates Employee Pay. All other properties are pulled from db.
    public String getAmountPaid() {
        return String.valueOf(String.format("%.2f", (Math.random() * (1744.89 - 689.92) + 689.92) + 1));
    }
    // Issue with retrieving employee based on Id. Generates Employee Name. All other properties are pulled from db.
    public String getName() {
        String[] names = {"Daniem Cormier", "Brittany Shore", "Jon Jones", "Jay Boseman", "Cindy Crawford", "Alicia Silverstone", "Brad Mentor", "Donald Trump"};
        Random rand = new Random();
        int index = rand.nextInt((7-1) + 1) + 1;
        return names[index];
    }
}
