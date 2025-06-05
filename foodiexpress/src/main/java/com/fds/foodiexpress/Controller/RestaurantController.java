//package com.fds.foodiexpress.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class RestaurantController {
//
//	 @GetMapping("/restro-dashboard")
//	    public String showDashboard() {
//	        return "Restaurant/index"; // Must match index.html inside /templates/Delivery/
//	        
//	    }
//}
//


package com.fds.foodiexpress.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestaurantController {

    @GetMapping("/restro-dashboard")
    public String showDashboard() {
        return "Restaurant/index"; 
    }

    @GetMapping("/restro-profile")
    public String showProfile() {
        return "Restaurant/profile"; 
    }

    @GetMapping("/restro-orders")
    public String showOrders() {
        return "Restaurant/orders"; 
    }

    @GetMapping("/restro-menu")
    public String showMenu() {
        return "Restaurant/menu"; 
    }

    @GetMapping("/restro-performance")
    public String showPerformance() {
        return "Restaurant/performance"; 
    }

    @GetMapping("/restro-edit-profile")
    public String showEditProfile() {
        return "Restaurant/edit-profile"; 
    }
}

