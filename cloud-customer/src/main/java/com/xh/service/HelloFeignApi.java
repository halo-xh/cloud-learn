package com.xh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@FeignClient(value = "eureka-producer")
public interface HelloFeignApi {
    
    @GetMapping("/api/hello/{name}")
    String hello(@PathVariable("name") String name);
    
}
