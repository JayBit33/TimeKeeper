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

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
