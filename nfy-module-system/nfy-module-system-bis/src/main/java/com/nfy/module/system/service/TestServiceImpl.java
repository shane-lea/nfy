package com.nfy.module.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String toUpperCase(String var) {
        return var.toUpperCase();
    }

    @Override
    public List testMybatis() {
        List list = jdbcTemplate.queryForList("select * from user");
        return list;
    }


}
