package com.timekeeper.app;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.Payroll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

//    IEmployeeService employeeService;
    Employee employee;


    @Test
    void contextLoads() {
    }

    @Test
    void createEmployee() {
        givenEmployeeOnSignupPage();
        whenRequiredFieldsAreSubmitted();
        thenEmployeeAccountCreated();
    }

    private void givenEmployeeOnSignupPage() {
    }

    private void whenRequiredFieldsAreSubmitted() {
    }

    private void thenEmployeeAccountCreated() {
//        employee = employeeService.fetchById(132);
    }

}
