package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("employeeDAO")
public class EmployeeSQLDAO implements IEmployeeDAO {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        Employee createdEmployee = employeeRepository.save(employee);
        return createdEmployee;
    }

    @Override
    public List<Employee> fetchAll() {
        List<Employee> allEmployees = (List) employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public Employee fetch(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
