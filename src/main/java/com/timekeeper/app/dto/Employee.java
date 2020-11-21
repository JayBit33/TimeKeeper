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
    private int id;
    private String firstName;
    private String lastName;
    private double wage;

    /**
     * Combines first and last name to generate full name
     * @return Sring
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
