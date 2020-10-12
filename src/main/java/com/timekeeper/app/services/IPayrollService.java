package com.timekeeper.app.services;

import com.timekeeper.app.dto.Payroll;

import java.util.ArrayList;

public interface IPayrollService {

    public void savePayroll(Payroll payroll);

    public ArrayList<Payroll> fetchAll();
}
