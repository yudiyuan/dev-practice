package com.example.supplier_demo.controller;

import com.example.supplier_demo.dao.Supplier;
import com.example.supplier_demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController 是 Spring Boot 中用来创建 Web 接口的注解，它的作用是：
//
//告诉 Spring：这是一个 控制器类，并且这个类里所有方法返回的结果，都会自动以 JSON 格式 写入 HTTP 响应体。
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/supplier/{id}")
    public Supplier getSupplierById(@PathVariable long id){
        return supplierService.getSupplierById(id);
    }



}
