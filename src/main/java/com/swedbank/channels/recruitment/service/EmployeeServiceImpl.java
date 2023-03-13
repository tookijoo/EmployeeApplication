package com.swedbank.channels.recruitment.service;

import com.swedbank.channels.recruitment.model.Employee;
import com.swedbank.channels.recruitment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public List<Employee> findAllEmployees() {
    return toList(employeeRepository.findAll());
  }

  @Override
  public void saveEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

  private <T> List<T> toList(Iterable<T> iterable) {
    List<T> target = new ArrayList<>();
    iterable.forEach(target::add);
    return target;
  }
}
