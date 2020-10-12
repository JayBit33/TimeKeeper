package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public @Data class Payroll {
    private Employee employee;
    private String date;
    private double hoursWorked;
    private double amountPaid;

    /**
     * Sets the hours worked while making sure that a negative value cannot be set
     * @param hoursWorked A double that reflects the amount of hours worked
     */


    public void setHoursWorked(double hoursWorked){
        if (hoursWorked <0.0){
            hoursWorked = 0.0;
        }
        this.hoursWorked = hoursWorked;
    }

    /**
     * Returns the inputted double rounded to the inputted amount of places.
     *
     * @param value the double to be rounded
     * @param places the number of decimal places to be rounded to
     * @return an appropriately rounded double
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Calculates the amount an employee should be paid this pay cycle.
     * @return A double amount that reflects the amount an employee is to be paid for the current pay cycle
     */
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
