package com.timekeeper.app.services;

import com.timekeeper.app.dto.Employee;

import java.util.List;

public interface IEmployeeService {
    public void saveEmployee(Employee employee);
    public List<Employee> fetchAll();
    public Employee fetchEmployeeById(int id);
    public void deleteEmployee(int id);
}
