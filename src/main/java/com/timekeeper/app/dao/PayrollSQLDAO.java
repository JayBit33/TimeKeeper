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

    @Override
    public Payroll save(Payroll payroll) {
        Payroll createdPayroll = payrollRepository.save(payroll);
        return createdPayroll;
    }

    @Override
    public List<Payroll> fetchAll() {
        List<Payroll> allPayroll = (List) payrollRepository.findAll();
        return allPayroll;
    }

    @Override
    public Payroll fetch(int id) {
        return payrollRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        payrollRepository.deleteById(id);
    }
}
