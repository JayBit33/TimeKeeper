package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Payroll;

import java.util.List;
import java.util.Optional;

public interface IPayrollDAO {
    public Payroll save(Payroll payroll);
    public List<Payroll> fetchAll();
    public Payroll fetch(int id);
    public void delete(int id);
}
