package com.example.internaladmin;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RequestAdminService {
    
    private final RequestAdminRepository requestAdminRepository;

    public RequestAdminService(RequestAdminRepository requestAdminRepository) {
        this.requestAdminRepository = requestAdminRepository;
    }

    public List<Request> findAll() {
        return requestAdminRepository.findAll();
    }
}