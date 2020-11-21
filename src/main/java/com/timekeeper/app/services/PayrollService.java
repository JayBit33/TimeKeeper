package com.timekeeper.app.services;

import com.timekeeper.app.dao.PayrollSQLDAO;
import com.timekeeper.app.dto.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Service layer handles business logic
 */
@Component
public class PayrollService implements IPayrollService {
    @Autowired
    PayrollSQLDAO payrollDB = new PayrollSQLDAO();

    /**
     * Saves payroll record to database
     * @param payroll
     */
    @Override
    public void savePayroll(Payroll payroll) {
        payrollDB.save(payroll);
    }

    /**
     * Gets all payroll records
     * @return List<Payroll>
     */
    @Override
    public List<Payroll> fetchAll() {
        return payrollDB.fetchAll();
    }

    /**
     * Retrives single payroll record with id
     * @param id
     * @return Payroll
     */
    @Override
    public Payroll fetchPayrollById(int id) {
        return payrollDB.fetch(id);
    }

    /**
     * Removes payroll record
     * @param id
     */
    @Override
    public void deletePayroll(int id) {
        payrollDB.delete(id);
    }
}
