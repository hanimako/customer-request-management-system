package com.example.internaladmin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    
        List<Request> requests = requestAdminService.findAll();
        model.addAttribute("requests", requests);
        return "requests";
    }

    @PostMapping("/{id}/approve")
    public String approveRequest(@PathVariable int id) {
        requestAdminService.approveRequest(id);
        return "redirect:/requests";
    }
}
