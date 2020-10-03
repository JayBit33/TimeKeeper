package com.timekeeper.app.controllers;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.Payroll;
import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import com.timekeeper.app.services.IPayrollService;
import com.timekeeper.app.services.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Handles REST endpoints and UI events
 * Responds to User actions
 */
@Controller
public class TimeKeeperController {

    PayrollService payrollService = new PayrollService();

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/employee-login")
    public String employeeLogin() {
        return "employee-login";
    }

    @RequestMapping("/supervisor-login")
    public String supervisorLogin() {
        return "supervisor-login";
    }

    @RequestMapping("/employee-view")
    public String employeeView(Model model) {
        Employee emp = new Employee();
        emp.setFirstName("Jay");
        emp.setLastName("Coder");
        emp.setWage(18.00);
        emp.setPayType(PayStructure.HOURLY);


        Payroll payroll = new Payroll();
        payroll.setEmployee(emp);
        LocalDate today = LocalDate.now();
        payroll.setDate(String.valueOf(Date.valueOf(today)));

        model.addAttribute(emp);
        model.addAttribute(payroll);
        model.addAttribute(payrollService);
        return "employee-view";
    }

    @RequestMapping("/supervisor-view")
    public String supervisorView() {
        return "supervisor-view";
    }

    @RequestMapping("/submitPayroll")
    public String submitPayroll(Payroll payroll) {
        try {
            payrollService.savePayroll(payroll);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "employee-view";
    }




    // All Routes from here down are for example reference. NOT PART OF PROJECT
    @GetMapping("/employee")
    public ResponseEntity fetchAllEmployees() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/employee/{id}/")
    public ResponseEntity fetchEmployeeById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PostMapping(value="/employee", consumes="application/json", produces = "application/json")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employee;
    }

    @DeleteMapping("/employee/{id}/")
    public ResponseEntity deleteEmployee(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("validJson")
    public ResponseEntity validJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity response = new ResponseEntity("{ name: Spring API}", headers, HttpStatus.OK);
        return  response;
    }




    // Automatic JSON conversion from java object
    @RequestMapping("/jsonObject")
    @ResponseBody
    public Employee getEmployeeObject() {
        Employee employee = new Employee();
        employee.setFirstName("Jayda");
        employee.setLastName("Coder");
        employee.setUuid(UUID.randomUUID());
        employee.setPayType(PayStructure.SALARY);
        employee.setWage(100000.00);
        return employee;
    }

    // turn JSON into a Java object for us
    @PostMapping(value="/CreateEmployee", consumes = "application/json", produces = "application/json")
    public Employee CreateEmployee(@RequestBody Employee employee) {
        return employee;
    }
}
