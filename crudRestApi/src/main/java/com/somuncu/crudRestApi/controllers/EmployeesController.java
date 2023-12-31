package com.somuncu.crudRestApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.somuncu.crudRestApi.business.abstracts.EmployeeService;
import com.somuncu.crudRestApi.entities.Employee;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeesController {

	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAll() {
		return this.employeeService.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {
		return this.employeeService.getById(id);
	}
	
	@PostMapping()
	public void add(@RequestBody Employee employee) {
		this.employeeService.add(employee);
	}
	
	@PutMapping()
	public void update(@RequestBody Employee employee) {
			this.employeeService.update(employee);
		}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.employeeService.delete(id);
	}
}

