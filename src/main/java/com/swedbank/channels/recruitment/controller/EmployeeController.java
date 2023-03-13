package com.swedbank.channels.recruitment.controller;

import com.swedbank.channels.recruitment.model.EmployeeFrom;
import com.swedbank.channels.recruitment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/")
  public String greeting(Model model) {
    model.addAttribute("employeeFrom", new EmployeeFrom());
    model.addAttribute("employees", employeeService.findAllEmployees());
    return "customerRegisterForm";
  }

  @PostMapping("/register")
  public String register(EmployeeFrom employeeForm) {
    employeeService.saveEmployee(employeeForm.toEmployee());
    return "redirect:";
  }
}
