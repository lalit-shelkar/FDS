package com.fds.foodiexpress.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fds.foodiexpress.Service.CustomerService;
import com.fds.foodiexpress.entity.Customer;

@Controller
public class CustomerController {
	
	CustomerService userService;
	public CustomerController(CustomerService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/showRegister")
	public String showRegister(Model model) {
		Customer customer=new Customer();
		model.addAttribute("ctm",customer);
		return "multiSignUp";
	}

	@PostMapping("/userRegister")
	public String userRegister(@ModelAttribute("ctm") Customer customer) {
		System.out.println(customer);
		userService.register(customer);
		System.out.println("Done!");
		return "login";
	}
}
