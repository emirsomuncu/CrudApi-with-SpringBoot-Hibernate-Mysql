package com.somuncu.crudRestApi.dao.concretes;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.somuncu.crudRestApi.dao.abstracts.EmployeeDAO;
import com.somuncu.crudRestApi.entities.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Employee> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
		return employees;
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(employee);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(employee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employeeToDelete = session.get(Employee.class, id);
		session.remove(employeeToDelete);
		
	}

}
