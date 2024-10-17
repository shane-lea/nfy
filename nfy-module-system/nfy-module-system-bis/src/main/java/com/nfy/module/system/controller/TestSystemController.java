package com.nfy.module.system.controller;


import com.nfy.framework.common.pojo.CommonResult;
import com.nfy.module.system.api.enums.ErrorCodes;
import com.nfy.module.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public CommonResult<List> testMybaits() {

        return CommonResult.success(testService.testMybatis());
    }




}
