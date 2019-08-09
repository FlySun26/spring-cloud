package com.ddky.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;
    @ApiParam
    @ApiOperation(value = "接口参数", httpMethod = "GET", consumes = "name，param")
    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口："+port;
    }
}
