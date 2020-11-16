package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Payroll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends CrudRepository<Payroll, Integer> {
}
