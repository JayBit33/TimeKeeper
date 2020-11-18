package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import com.timekeeper.app.services.EmployeeService;
import com.timekeeper.app.services.IEmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

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
}
