package com.timekeeper.app.services;

import com.timekeeper.app.dao.PayrollSQLDAO;
import com.timekeeper.app.dto.Payroll;
import java.util.List;
import java.util.Optional;

/**
 * Service layer handles business logic
 */
public class PayrollService implements IPayrollService {
    PayrollSQLDAO payrollDB = new PayrollSQLDAO();

    /**
     * Calculated payroll and saves payroll record to persistence
     * @param payroll
     */
    public void savePayroll(Payroll payroll) {
        payroll.calculateAmountPaid();
        payrollDB.save(payroll);
    }

    /**
     * Gets all payroll records
     * @return List<Payroll>
     */
    public List<Payroll> fetchAll() {
        return payrollDB.fetchAll();
    }

    @Override
    public Optional<Payroll> fetchPayrollById(int id) {
        return payrollDB.fetch(id);
    }

    @Override
    public void deletePayroll(int id) {
        payrollDB.delete(id);
    }
}
