package com.nfy.framework.token.config;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

//        registry.addInterceptor(new SaInterceptor(
//                        handle -> SaRouter.match("/**")
//                                .notMatch("/*.html")
//                                .notMatch("/swagger-resources")
//                                .notMatch("/webjars/**")
//                                .notMatch("/**/api-docs")
//                                .check(r -> StpUtil.checkLogin())
//                )).addPathPatterns("/**")
//                .excludePathPatterns("/user/doLogin", "/user/isLogin", "/user/logout" , "/system/*");


    }
}

