package com.fds.foodiexpress.userService;

import org.springframework.stereotype.Service;

import com.fds.foodiexpress.customerdao.CustomerDao;
import com.fds.foodiexpress.entity.Customer;

@Service
public class UserServiceImpl implements UserService {
	
	CustomerDao customerDao;
	public UserServiceImpl(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	

	@Override
	public void register(Customer customer) {
		customerDao.addCustomer(customer);
	}

}
