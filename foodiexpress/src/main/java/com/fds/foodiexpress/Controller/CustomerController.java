package com.fds.foodiexpress.Controller;


import org.springframework.security.core.Authentication;
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
	
	@GetMapping("/dashboard")
	public String afterLogin() {
		return "customer/userNavBar";
	}
	
	@GetMapping("/showLogin")
	public String showLogin(Authentication authentication) {
		if(authentication != null && authentication.isAuthenticated()) {
			return "redirect:/dashboard";
		}
		return "login";
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

	@PostMapping("/customerRegister")
	public String userRegister(@ModelAttribute("ctm") Customer customer) {
		System.out.println(customer);
		userService.register(customer);
		System.out.println("Done!");
		return "redirect:/showLogin";
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
