package com.timekeeper.app.dto;

import java.util.UUID;
import lombok.Data;
import com.timekeeper.app.dto.enums.PayStructure;

import javax.persistence.*;

@Entity
@Table(name="employees")
public @Data class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int employeeId;
    private String firstName;
    private String lastName;
    private double wage;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
