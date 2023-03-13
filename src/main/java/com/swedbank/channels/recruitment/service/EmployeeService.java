package com.swedbank.channels.recruitment.service;

import com.swedbank.channels.recruitment.model.Employee;

import java.util.List;

public interface EmployeeService {
  List<Employee> findAllEmployees();

  void saveEmployee(Employee employee);
}
