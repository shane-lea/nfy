package com.nfy.module.system.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String toUpperCase(String var) {

        if (StringUtils.isEmpty(var)) {
            throw new RuntimeException("var is empty");
        }
        return var.toUpperCase();
    }


}
