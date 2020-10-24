package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.Payroll;
import org.springframework.data.repository.CrudRepository;

public interface PayrollRepository extends CrudRepository<Payroll, Integer> {

}
