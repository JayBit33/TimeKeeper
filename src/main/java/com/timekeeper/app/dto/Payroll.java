package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public @Data class Payroll {
    private Employee employee;
    private String date;
    private double hoursWorked;
    private double amountPaid;


    /*
    *   Simple rounding method to insure that all monetary values set are to two decimal places.
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double calculateAmountPaid() {
        if (this.employee.getPayType() == PayStructure.HOURLY) {
            this.setAmountPaid(round(hoursWorked * employee.getWage(),2));
            return round(hoursWorked * employee.getWage(),2);
        } else {
            // employee is salary worker and paid bi-weekly
            this.setAmountPaid(round(employee.getWage() / 24,2));
            return round(employee.getWage() / 24,2);
        }
    }
}
