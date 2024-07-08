package com.sunil.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.sunil.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
