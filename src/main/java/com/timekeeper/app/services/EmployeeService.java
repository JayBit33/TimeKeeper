package com.timekeeper.app.services;

import com.timekeeper.app.dao.EmployeeSQLDAO;
import com.timekeeper.app.dto.Employee;

import java.util.List;

public class EmployeeService implements IEmployeeService {
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
