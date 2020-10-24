package com.timekeeper.app.dao;

import com.timekeeper.app.dto.Employee;
import org.springframework.data.repository.CrudRepository;

// need to add following maven dependencies alt+enter
// spring-boot-starter-data-jpa - search for artifact
// mysql-connector-java - search for artifact
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
