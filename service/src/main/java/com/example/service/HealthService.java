package com.example.service;


import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String healthCheck() {
        return "I am healthy";
    }
}
