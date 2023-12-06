package com.moretolearn.repository.custom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.EntityManager;

public class CustomEmployeeRepositoryImpl implements CustomEmployeeRepository {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<?> getList() {
		return entityManager.createQuery("SELECT e FROM Employee e").getResultList();
	}

}
