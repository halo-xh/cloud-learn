package com.xh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@RestController("/api/hello")
public class HelloApi {
    
    @GetMapping("/{name}")
    public String hello(String name){
        return "hello "+ name + new Date();
    }
    
}
