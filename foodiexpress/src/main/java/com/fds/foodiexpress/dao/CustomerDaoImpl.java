package com.fds.foodiexpress.dao;

import org.springframework.stereotype.Repository;

import com.fds.foodiexpress.entity.Customer;
import com.fds.foodiexpress.entity.Delivery;
import com.fds.foodiexpress.entity.Restaurant;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	EntityManager entityManager;
	 
	public CustomerDaoImpl(EntityManager em ) {
		entityManager=em;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
	}

	@Override
	public void addDelivery(Delivery delivery) {
		entityManager.persist(delivery);
			
	}

	@Override
	public void addRestaurant(Restaurant restaurant) {
		entityManager.persist(restaurant);
		
	}

}
