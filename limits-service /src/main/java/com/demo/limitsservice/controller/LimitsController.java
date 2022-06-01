package com.demo.limitsservice.controller;

import com.demo.limitsservice.bean.Limits;
import com.demo.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    private Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
