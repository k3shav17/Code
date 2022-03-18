package com.empl.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empl.dao.EmployeeRepository;
import com.empl.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;

	@GetMapping("/")
	public String homePage() {
		return "Welcome to Employee Managment system";
	}

	@PostMapping("/addempl") // Request URL to add an employee
	public ResponseEntity<Employee> addEmpl(@RequestBody Employee employee) {

		employeeRepo.save(employee);
		return new ResponseEntity<>(employee, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/getall") // Request URL to get all the employees
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@GetMapping("/empl/{id}") // Request URL to get a specific employee with id.
	public Optional<Employee> gettingEmplById(@PathVariable int id) {
		return employeeRepo.findById(id);
	}

	@GetMapping("/emplornot/{id}") // Request URL to check whether an employee exists with the id mentioned
	public String isEmplExists(@PathVariable int id) {
		if (employeeRepo.existsById(id)) {
			return "Yes the employee with " + id + " does exists";
		}
		return "No employee exists with the " + id + " mentioned.";
	}

	@GetMapping("/emp/{salary}") // Request URL to list all the employees with salary mentioned
	public List<String> getAllEmployeeNamesBySalary(@PathVariable double salary) {

		return getAllEmployees().stream().filter(s -> s.getSalary() == salary).map(Employee::getName)
				.collect(Collectors.toList());
	}

}
