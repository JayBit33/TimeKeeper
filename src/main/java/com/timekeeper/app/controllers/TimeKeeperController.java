package com.timekeeper.app.controllers;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.enums.PayStructure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
public class TimeKeeperController {

    @RequestMapping("/")
    public String index() {
        Employee employee = new Employee();
        employee.setFirstName("Justin");
        employee.setLastName("Coder");
        employee.setUuid(UUID.randomUUID());
        employee.setPayType(PayStructure.SALARY);
        employee.setWage(1000000.00);
        employee.setHoursWorkedThisPayPeriod(43);
        return "index";
    }

}
