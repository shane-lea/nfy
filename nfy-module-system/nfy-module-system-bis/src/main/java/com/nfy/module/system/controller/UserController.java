//package com.nfy.module.system.controller;
//
//import cn.dev33.satoken.stp.StpUtil;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/user/")
//public class UserController {
//
//    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
//    @GetMapping("doLogin")
//    public String doLogin(String username, String password) {
//        // 模拟示例，实际需要从数据库中查询数据进行比对
//        if("zhang".equals(username) && "123456".equals(password)) {
//            StpUtil.login(10001);
//            return "登录成功";
//        }
//        return "登录失败";
//    }
//
//    @GetMapping("isLogin")
//    public String isLogin() {
//        return "当前会话是否登录：" + StpUtil.isLogin();
//    }
//
//
//
//}
//
