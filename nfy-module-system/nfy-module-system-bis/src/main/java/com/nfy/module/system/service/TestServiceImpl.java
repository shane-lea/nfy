package com.nfy.module.system.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String toUpperCase(String var) {
        System.out.println(var);
        return var.toUpperCase();
    }


}
