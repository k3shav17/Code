package com.tejas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpFunctions {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "keshava");
		Employee emp2 = new Employee(2, "Rao");
		Employee emp3 = new Employee(3, "Kommaraju");

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		EmpFunctions em = new EmpFunctions();

		em.sortByName(employees);
		System.out.println(em.sortById(employees));

	}

	public void sortByName(List<Employee> employees) {
		employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		employees.forEach(emp -> System.out.println(emp));
	}

	public List<Employee> sortById(List<Employee> employees) {
		return employees.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
	}
}
