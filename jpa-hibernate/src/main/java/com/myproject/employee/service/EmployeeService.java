package com.myproject.employee.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.myproject.model.Employee;

@Service
public class EmployeeService extends BaseEntity {
	
	protected EntityManager em;
	
	public EmployeeService() {
		em = emf.createEntityManager();
	}
	
	public Employee createEmployee(String name, long salary) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		em.persist(employee);
		return employee;
	}
	
	public Employee findEmployee(long id) {
		return em.find(Employee.class, id);
	}
	
	public void removeEmployee(long id) {
		Employee emp = em.find(Employee.class, id);
		if (emp != null) {
			em.remove(emp);
		}
	}
	
	public Employee raiseEmployeeSalary(int id, long raise) {
		Employee emp = em.find(Employee.class, id);
		if (emp != null) {
			emp.setSalary(emp.getSalary() + raise);
		}
		return emp;
	}
	
}

