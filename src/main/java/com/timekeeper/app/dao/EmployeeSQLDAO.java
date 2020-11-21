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

    /**
     * Saves employee to db
     * @param employee
     * @return newly created employee
     */
    @Override
    public Employee save(Employee employee) {
        Employee createdEmployee = employeeRepository.save(employee);
        return createdEmployee;
    }

    /**
     * Retrieves all employees.
     * @return List<Employee>
     */
    @Override
    public List<Employee> fetchAll() {
        List<Employee> allEmployees = (List) employeeRepository.findAll();
        return allEmployees;
    }

    /**
     * Retrieves employee by id
     * @param id
     * @return Employee
     */
    @Override
    public Employee fetch(int id) {
        return employeeRepository.findById(id).get();
    }

    /**
     * Removes employee from database
     * @param id
     */
    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
