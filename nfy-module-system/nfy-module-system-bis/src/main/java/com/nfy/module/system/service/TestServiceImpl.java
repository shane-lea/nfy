package com.nfy.module.system.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String toUpperCase(String var) {
        return var.toUpperCase();
    }


}
