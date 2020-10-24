package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public @Data class Payroll {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int payrollId;
    private Employee employee;
    private String date;
    private double hoursWorked;
    private double amountPaid;

    public double calculateAmountPaid() {
        if (this.employee.getPayType() == PayStructure.HOURLY) {
            this.setAmountPaid(hoursWorked * employee.getWage());
            return hoursWorked * employee.getWage();
        } else {
            // employee is salary worker and paid bi-weekly
            this.setAmountPaid(employee.getWage() / 24);
            return employee.getWage() / 24;
        }
    }
}
