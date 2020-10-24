package com.timekeeper.app.dto;

import java.util.UUID;
import lombok.Data;
import com.timekeeper.app.dto.enums.PayStructure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int employeeId;
    private String firstName;
    private String lastName;
    private PayStructure payType;
    private double wage; // can be set to annual salary or hourly wage.

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
