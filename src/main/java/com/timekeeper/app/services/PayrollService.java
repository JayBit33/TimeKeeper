package com.timekeeper.app.services;

import com.timekeeper.app.dto.Payroll;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Service layer handles business logic
 */

@Component
public class PayrollService implements IPayrollService {
    // temporary to hold saved payroll.
    public ArrayList<Payroll> log = new ArrayList<>();

    public void savePayroll(Payroll payroll) {
        // Save to DB.
        payroll.calculateAmountPaid();
        log.add(payroll);
    }

    public ArrayList<Payroll> fetchAll() {
        return this.log;
    }
}
