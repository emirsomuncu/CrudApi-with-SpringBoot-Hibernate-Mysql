package com.somuncu.crudRestApi.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.somuncu.crudRestApi.business.abstracts.EmployeeService;
import com.somuncu.crudRestApi.dao.abstracts.EmployeeDAO;
import com.somuncu.crudRestApi.entities.Employee;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO ;
	
	
	@Override
	@Transactional
	public List<Employee> getAll() {
		List<Employee> employees = this.employeeDAO.getAll();
		return employees;
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		Employee employee =this.employeeDAO.getById(id);
		return employee;
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		this.employeeDAO.add(employee);
		}

	@Override
	@Transactional
	public void update(Employee employee) {
		this.employeeDAO.update(employee);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		this.employeeDAO.delete(id);
	}

}
