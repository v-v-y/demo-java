package com.example.demo.service;

import com.example.demo.GoogleClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "Google",
        url = "https://docs.googleapis.com",
        configuration = GoogleClientConfiguration.class
)
public interface GoogleClient {

    @GetMapping("$discovery/rest")
    String discovery(@RequestParam("version") String version);

}
