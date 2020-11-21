package com.timekeeper.app.controllers;

import com.timekeeper.app.dto.Employee;
import com.timekeeper.app.dto.Payroll;
import com.timekeeper.app.dto.enums.PayFrequency;
import com.timekeeper.app.dto.enums.PayStructure;
import com.timekeeper.app.services.EmployeeService;
import com.timekeeper.app.services.IEmployeeService;
import com.timekeeper.app.services.IPayrollService;
import com.timekeeper.app.services.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles REST endpoints and UI events
 * Responds to User actions
 */
@Controller
public class TimeKeeperController {
    @Autowired
    IPayrollService payrollService;
    @Autowired
    IEmployeeService employeeService;

    /**
     * Route for homepage.
     * @param model
     * @return routes to index.html
     */
    @RequestMapping("/")
    public String index(Model model) {
        Payroll payroll = new Payroll();
        model.addAttribute("payroll", payroll);
        return "index";
    }

    /**
     * Route for payroll records.
     * @param model
     * @return routes to payroll.html
     */
    @RequestMapping("/payroll")
    public String payroll(Model model) {
        List<Payroll> payroll = payrollService.fetchAll();
        model.addAttribute("records", payroll);
        return "payroll";
    }

    /**
     * Post route to submit payroll record from home screen
     * @param payroll
     * @return redirects to payroll records page
     */
    @RequestMapping(value = "/submitPayroll", method=RequestMethod.POST)
    public String submitPayroll(Payroll payroll) {
        try {
            Employee employee = employeeService.fetchEmployeeById(payroll.getEmployeeId());
            payroll.setAmountPaid(payroll.getHoursWorked() * employee.getWage());
            payrollService.savePayroll(payroll);
            return "redirect:/payroll";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/payroll";
    }

    /**
     * Route for employee directory page
     * @param model
     * @return routes to employees.html
     */
    @RequestMapping("/employees")
    public String showEmployees(Model model) {
        List<Employee> employees = employeeService.fetchAll();
        int size = employees.size();
        model.addAttribute("employees", employees);
        model.addAttribute("numOfEmps",size);

        return "employees";
    }
}
