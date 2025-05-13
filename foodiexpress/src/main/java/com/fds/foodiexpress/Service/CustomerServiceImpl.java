package com.fds.foodiexpress.Service;

import org.springframework.stereotype.Service;

import com.fds.foodiexpress.dao.CustomerDao;
import com.fds.foodiexpress.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	

	@Override
	public void register(Customer customer) {
		customerDao.addCustomer(customer);
	}

}
