package com.myproject.employee.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.myproject.model.Employee;

public class EmployeeServiceTest {
	
	
	 @Test
	  public void createEmployeeTest() {
		 EmployeeService service = new EmployeeService();
		 Employee employee = service.createEmployee("Nikos", 1500L);
		 assertNotNull(employee.getId());
	 }
	 
	 @Test
	  public void findEmployeeTest() {
		 EmployeeService service = new EmployeeService();
		 service.createEmployee("Georgia", 1500L);
		 
		 Employee employee = service.findEmployee(1L);
		 assertEquals("Georgia", employee.getName());
	 }
	 
	 @Test
	 public void removeEmployeeTest() {
		 EmployeeService service = new EmployeeService();
		 Employee employee = service.createEmployee("Vasilis", 1500L);
		 
		 service.removeEmployee(employee.getId());
		 
		 Employee result = service.findEmployee(1L);
		 assertNull(result);
	 }
	 
}
