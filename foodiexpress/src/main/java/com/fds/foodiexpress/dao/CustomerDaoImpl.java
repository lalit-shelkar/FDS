package com.fds.foodiexpress.dao;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.fds.foodiexpress.entity.Authorities;
import com.fds.foodiexpress.entity.Customer;
import com.fds.foodiexpress.entity.Delivery;
import com.fds.foodiexpress.entity.Restaurant;
import com.fds.foodiexpress.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private EntityManager entityManager;
	private PasswordEncoder passwordEncoder;
	 
	public CustomerDaoImpl(EntityManager em,PasswordEncoder passwordEncoder ) {
		entityManager=em;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		Users user = new Users();
		Authorities authorities = new Authorities();
		
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		user.setUsername(customer.getEmail());
		user.setPassword(customer.getPassword());
		user.setEnabled("1");
		
		authorities.setAuthority("ROLE_CUSTOMER");
		authorities.setUsername(customer.getEmail());
		
		entityManager.persist(user);
		entityManager.persist(authorities);
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
