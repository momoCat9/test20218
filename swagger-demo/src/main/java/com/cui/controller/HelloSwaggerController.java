package com.cui.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/swagger")
@Api(value = "hello的controller", tags = "hello的controller")
public class HelloSwaggerController {

    @GetMapping("/hello1")
    @ApiOperation(value = "Hello1接口的实现", notes = "Hello1接口的实现", httpMethod = "GET")
    public void Hello1(){
        System.out.println("hello!");
    }

    @GetMapping("/hello2")
    @ApiOperation(value = "Hello2接口的实现", notes = "Hello2接口的实现", httpMethod = "GET")
    public int Hello2(){
        System.out.println("hello!");
        int res = 1;
        return res;
    }
}
