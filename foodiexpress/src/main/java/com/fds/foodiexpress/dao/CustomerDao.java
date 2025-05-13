package com.fds.foodiexpress.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fds.foodiexpress.entity.Customer;

public interface CustomerDao{

	void addCustomer(Customer customer);
}
