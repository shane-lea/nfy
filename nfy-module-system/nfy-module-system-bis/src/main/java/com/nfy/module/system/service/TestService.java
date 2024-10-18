package com.nfy.module.system.service;

import com.nfy.module.system.model.entity.User;

import java.util.List;

public interface TestService {

    String toUpperCase(String var);

    List testMybatis();

    List<User> testUserMapper(String username);

    void testJacocoCover();
}
