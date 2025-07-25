package com.example.supplier_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//这是 Spring Boot 中用于定义 RESTful 风格控制器 的注解，作用是：
//
//把类标记为一个控制器，并且所有方法的返回值自动变成 JSON 或 XML 数据，不再跳转到页面。
public class TestController {

    @GetMapping("/hello")
    //这是一个 Spring Web 框架提供的注解，用来将 HTTP GET 请求映射到某个方法。
    public String hello(){
        return "hello world";
    }
}
