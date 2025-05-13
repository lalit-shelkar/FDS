package com.fds.foodiexpress.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryController {
    @GetMapping("/")
    public String showDashboard() {
        return "Delivery/index"; // Must match index.html inside /templates/Delivery/
    }
    
    @GetMapping("/index")
    public String showIndex() {
        return "Delivery/index"; // Must match index.html inside /templates/Delivery/
    }

    @GetMapping("/details")
    public String showActiveOrders() {
        return "Delivery/details"; // Must match details.html inside /templates/Delivery/
    }

    @GetMapping("/orders")
    public String showAvailableOrders() {
        return "Delivery/orders"; // Must match orders.html inside /templates/Delivery/
    }

    @GetMapping("/performance")
    public String showPerformance() {
        return "Delivery/performance"; // Must match performance.html inside /templates/Delivery/
    }

    @GetMapping("/profile")
    public String showProfile() {
        return "Delivery/profile"; // Must match profile.html inside /templates/Delivery/
    }
}
