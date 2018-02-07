package com.myproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "NAME",  length = 16, nullable = false)
	@NotNull(message = "The name is compulsory")
	@NotEmpty(message = "The name should not be empty")
	@Size(max = 16, message = "The name should be less than 17 characters")
	private String name;
	
	@Column(name = "SALARY",  length = 5, nullable = false)
	@NotNull(message = "The salary is compulsory")
	@NotEmpty(message = "The salary should not be empty")
	@Size(max = 16, message = "The salary should be less than 5 characters")
	private Long salary;
	
	public Employee() {}
	
	public Employee(Long id) { 
		this.id = id; 
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
}
