package com.fds.foodiexpress.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fds.foodiexpress.Service.CustomerService;
import com.fds.foodiexpress.entity.Customer;
import com.fds.foodiexpress.entity.Delivery;
import com.fds.foodiexpress.entity.Restaurant;

@Controller
public class CustomerController {
	
	CustomerService userService;
	public CustomerController(CustomerService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/showRegister")
	public String showRegister(Model model) {
		Customer customer=new Customer();
		Delivery delivery=new Delivery();
		Restaurant restaurant=new Restaurant();
		model.addAttribute("ctm",customer);
		model.addAttribute("dvr",delivery);
		model.addAttribute("restro", restaurant);
		return "multiSignUp";
	}

	@PostMapping("/userRegister")
	public String userRegister(@ModelAttribute("ctm") Customer customer) {
		System.out.println(customer);
		userService.register(customer);
		System.out.println("Done!");
		return "login";
	}
	
	@PostMapping("/deliveryRegister")
	public String deliveryRegister(@ModelAttribute("dvr") Delivery delivery) {
		delivery.setFlag("1");
		System.out.println(delivery);
		userService.registerDelivery(delivery);
		System.out.println("Done!");
		return "login";
	}
	
	@PostMapping("/restaurantRegister")
	public String restaurantRegister(@ModelAttribute("restro") Restaurant restaurant) {
		restaurant.setFlag("1");
		System.out.println(restaurant);
		userService.registerRestaurant(restaurant);
		System.out.println("Done!");
		return "login";
	}
	
}
