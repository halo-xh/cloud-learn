package com.xh.rest;

import com.xh.service.HelloFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@RestController
@RequestMapping("/hello")
public class HelloService {
    
    @Autowired
    private HelloFeignApi helloFeignApi;
    
    @RequestMapping("/{name}")
    public String hello(String name){
        return helloFeignApi.hello(name);
    }
    
    
}
