package com.example.internaladmin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requests")
public class RequestAdminController {

    private final RequestAdminService requestAdminService;

    public RequestAdminController(RequestAdminService requestAdminService) {
        this.requestAdminService = requestAdminService;
    }
    
    @GetMapping
    public String getAllRequests(Model model) {

        // List<Request> requests = new ArrayList<>();
        // requests.add(new Request(1, LocalDateTime.now(), false, "John Doe", "123 Main St", "Request details 1"));
        
        List<Request> requests = requestAdminService.findAll();
        model.addAttribute("requests", requests);
        return "requests";
    }
}
