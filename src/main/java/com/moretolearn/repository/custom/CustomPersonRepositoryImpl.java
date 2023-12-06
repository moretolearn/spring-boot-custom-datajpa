package com.moretolearn.repository.custom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class CustomPersonRepositoryImpl implements CustomPersonRepository {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<?> getPersonList() {
		return entityManager.createQuery("SELECT p FROM Person p").getResultList();
	}
}
