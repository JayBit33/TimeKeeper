package com.timekeeper.app.dto;

import com.timekeeper.app.dto.enums.PayFrequency;
import lombok.Data;

import java.util.Date;

public @Data class Payroll {
    private Employee employee;
    private PayFrequency frequency;
    private Date date;
    private double amountPaid;
}
