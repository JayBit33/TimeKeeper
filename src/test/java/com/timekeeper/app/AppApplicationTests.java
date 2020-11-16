package com.timekeeper.app;

import com.timekeeper.app.dto.Employee;

import org.junit.jupiter.api.Test;

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

    public void givenEmployeeOnSignupPage() {
    }

    private void whenRequiredFieldsAreSubmitted() {
    }

    private void thenEmployeeAccountCreated() {
//        employee = employeeService.fetchById(132);
    }

}
