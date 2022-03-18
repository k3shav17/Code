package com.empl.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.empl.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
