package com.example.demo;

import com.example.demo.service.GoogleService;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("v1")
public class FirstController {

    private final GoogleService googleService;

    public FirstController(GoogleService googleService) {
        this.googleService = googleService;
    }

    @GetMapping("discovery")
    public String getDiscovery() {
        MDC.put("trace_id", UUID.randomUUID().toString());
        return googleService.google();
    }
}
