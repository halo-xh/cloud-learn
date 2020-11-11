package com.xh.rest;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@RestController
@RequestMapping("/api/hello")
public class HelloApi {
    
    @GetMapping("/{name}")
    public String hello(@PathVariable("name")String name){
        return "hello "+ name + new Date();
    }
    
}
