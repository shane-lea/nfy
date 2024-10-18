package com.nfy.module.system.service;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.nfy.framework.mybatis.query.QueryWrapperX;
import com.nfy.module.system.mapper.UserMapper;
import com.nfy.module.system.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Override
    public String toUpperCase(String var) {
        return var.toUpperCase();
    }

    @Override
    public List testMybatis() {
        List list = jdbcTemplate.queryForList("select * from user");
        return list;
    }

    @Override
    public List<User> testUserMapper(String username) {

        QueryWrapper<User> queryWrapper =
                new QueryWrapper<User>()
                        .eq(true, "user_name", username)
                        .eq(true, "is_delete", 0);
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public void testJacocoCover() {
        userMapper.deleteById(1L);
    }


}
