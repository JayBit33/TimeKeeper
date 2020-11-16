package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public Employee save(Employee employee);
    public List<Employee> fetchAll();
    public Employee fetch(int id);
    public void delete(int id);
}
