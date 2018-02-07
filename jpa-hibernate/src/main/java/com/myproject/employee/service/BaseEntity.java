package com.myproject.employee.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseEntity {
	
	protected EntityManagerFactory emf;
	
	protected BaseEntity() {
		// Check in the persistence.xml the persistence-unit name="xxx"
		String persistenceUnitName = "persistenceUnitExample";
		emf =  Persistence.createEntityManagerFactory(persistenceUnitName);
	}
}

