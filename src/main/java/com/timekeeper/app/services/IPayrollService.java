package com.timekeeper.app.services;

import com.timekeeper.app.dto.Payroll;

import java.util.List;
import java.util.Optional;

public interface IPayrollService {

    public void savePayroll(Payroll payroll);
    public List<Payroll> fetchAll();
    public Payroll fetchPayrollById(int id);
    public void deletePayroll(int id);
}
