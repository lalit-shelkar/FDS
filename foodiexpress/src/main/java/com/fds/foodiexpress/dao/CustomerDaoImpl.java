package com.fds.foodiexpress.dao;

import org.springframework.stereotype.Repository;

import com.fds.foodiexpress.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	EntityManager entityManager;
	 
	public CustomerDaoImpl(EntityManager em ) {
		entityManager=em;
	}
	
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
	}

}
