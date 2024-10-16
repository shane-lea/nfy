package com.nfy.module.system.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class TestSystemController {

    @GetMapping("/quickstart")
    public String quickStart() {
        return "system-quickstart";
    }

}
