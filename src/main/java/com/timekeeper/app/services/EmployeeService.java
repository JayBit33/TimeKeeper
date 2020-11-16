package com.timekeeper.app.services;

import com.timekeeper.app.dao.EmployeeSQLDAO;
import com.timekeeper.app.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeSQLDAO employeeDB = new EmployeeSQLDAO();

    @Override
    public void saveEmployee(Employee employee) {
        employeeDB.save(employee);
    }

    @Override
    public List<Employee> fetchAll() {
        List<Employee> employees = employeeDB.fetchAll();
        return employees;
    }

    @Override
    public Employee fetchEmployeeById(int id) {
        Employee employee = employeeDB.fetch(id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDB.delete(id);
    }
}
