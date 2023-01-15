package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GoogleService {
    private final GoogleClient googleClient;

    public GoogleService(GoogleClient googleClient) {
        this.googleClient = googleClient;
    }

    public String google() {
        return googleClient.discovery("v1");
    }
}
