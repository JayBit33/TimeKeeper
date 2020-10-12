package com.timekeeper.app.dto;

import java.util.UUID;
import lombok.Data;
import com.timekeeper.app.dto.enums.PayStructure;

public @Data class Employee {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private PayStructure payType;
    private double wage; // can be set to annual salary or hourly wage.


    /**
     * Sets the employee's wage after making sure the value isn't a negative number
     * @param wage A double that reflects the employee's wage.
     */
    public void setWage(double wage){
        if (wage<0.0){
        wage = 0.0;
        }
        this.wage = wage;
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
