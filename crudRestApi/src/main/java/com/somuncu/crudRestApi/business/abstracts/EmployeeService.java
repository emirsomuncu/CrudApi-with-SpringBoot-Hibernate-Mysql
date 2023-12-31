package com.somuncu.crudRestApi.business.abstracts;

import java.util.List;

import com.somuncu.crudRestApi.entities.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	public Employee getById(int id);
	
	public void add(Employee employee);
	public void update(Employee employee);
	public void delete(int id);
}
