package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import lombok.Data;

import java.util.Date;

public @Data class Payroll {
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
