package com.timekeeper.app.services;

import com.timekeeper.app.dto.Payroll;

import java.util.ArrayList;

/**
 * Service layer handles business logic
 */
public class PayrollService implements IPayrollService {
    // temparary to hold saved payroll.
    public ArrayList<Payroll> log = new ArrayList<>();

    public void savePayroll(Payroll payroll) {
        // Save to DB.
        payroll.calculateAmountPaid();
        log.add(payroll);
    }
}
