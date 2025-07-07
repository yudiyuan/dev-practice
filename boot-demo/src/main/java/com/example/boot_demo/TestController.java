package com.example.boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//告诉 Spring Boot：这个类是一个控制器，里面的方法返回的是纯文本、JSON，而不是 HTML 页面。

public class TestController {

   //然后来配置API路径 默认用hello
   @GetMapping("/hello")
//    是 Spring Boot 中非常常见的注解，用来声明一个 Web API 接口的路径和请求方式。
//    当浏览器或客户端访问 GET /hello 路径时，就执行你下面那个方法。

   //先写方法
    public List<String> hello(){
        return List.of("hello","world");
    }

//    public String hello(){
//        return "hello world";
//    }

//    如果你在 Controller 中返回的是一个普通的 Java 对象，Spring Boot 会自动把它转成 JSON 字符串返回给前端。
//不过，为了让它能正确提取属性，你的对象类要有 getXXX() 方法，这样才能正常序列化成 JSON。











}
