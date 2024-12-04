package com.nfy.module.system.controller;


import com.nfy.framework.common.pojo.CommonResult;
import com.nfy.module.system.api.enums.ErrorCodes;
import com.nfy.module.system.model.entity.User;
import com.nfy.module.system.service.TestService;
import org.apache.http.client.CookieStore;
import org.apache.http.client.protocol.HttpClientContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient; // 导入闭合可用 HTTP 客户端类
import org.apache.http.impl.client.HttpClients; // 导入 HTTP 客户端构建器
import org.apache.http.util.EntityUtils; // 导入实体工具类

@RestController
@RequestMapping("/system")
public class TestSystemController {

    @Autowired
    TestService testService;


    @GetMapping("/quickstart")
    public String quickStart() {
        return "system-quickstart";
    }

    @GetMapping("/toUpperCase")
    public String toUpperCase(@RequestParam("input") String input) {
        String test = testService.toUpperCase(input);
        return test;
    }

    @GetMapping("/test/return")
    public CommonResult<String> testReturnResult(String input) {
        if (input == null) {
            return CommonResult.error(ErrorCodes.TEST_ERROR_CODE);
        }
        return CommonResult.success(input);
    }

    @GetMapping("/mybatis")
    public CommonResult<List> testMybatis() {
        return CommonResult.success(testService.testMybatis());
    }

    @GetMapping("/mapper")
    public CommonResult<List<User>> testUserMapper(String userName) {
        return CommonResult.success(testService.testUserMapper(userName));
    }


    @GetMapping("/cookie")
    public String testCookie(@RequestParam("username") String userName, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        Cookie scaToken = new Cookie("cooke", userName);
//        scaToken.setDomain("192.168.100.111");
        scaToken.setDomain("127.0.0.1");
//        scaToken.setDomain("www.google.com.hk");
        scaToken.setPath("/");
        httpServletResponse.addCookie(scaToken);

        return "11111";
    }


}
