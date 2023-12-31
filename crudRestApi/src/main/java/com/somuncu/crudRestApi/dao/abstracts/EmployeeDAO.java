package com.somuncu.crudRestApi.dao.abstracts;

import java.util.List;

import com.somuncu.crudRestApi.entities.Employee;

public interface EmployeeDAO {

	public List<Employee> getAll();
	public Employee getById(int id);
	
	public void add(Employee employee);
	public void update(Employee employee);
	public void delete(int id);
}
