package com.swedbank.channels.recruitment.repository;

import com.swedbank.channels.recruitment.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
