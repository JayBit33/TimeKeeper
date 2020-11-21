package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("payrollDAO")

public class PayrollSQLDAO implements IPayrollDAO {
    @Autowired
    PayrollRepository payrollRepository;

    /**
     * Saves payroll record in database table
     * @param payroll
     * @return Payroll
     */
    @Override
    public Payroll save(Payroll payroll) {
        Payroll createdPayroll = payrollRepository.save(payroll);
        return createdPayroll;
    }

    /**
     * Retrieves all payroll records
     * @return List<Payroll>
     */
    @Override
    public List<Payroll> fetchAll() {
        List<Payroll> allPayroll = (List) payrollRepository.findAll();
        return allPayroll;
    }

    /**
     * Retrives payroll records by unique id
     * @param id
     * @return Payroll object
     */
    @Override
    public Payroll fetch(int id) {
        return payrollRepository.findById(id).get();
    }

    /**
     * Removes record from database
     * @param id
     */
    @Override
    public void delete(int id) {
        payrollRepository.deleteById(id);
    }
}
