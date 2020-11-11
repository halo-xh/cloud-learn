package com.xh.service;

import com.xh.service.hystriximpl.HelloFeignApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@FeignClient(value = "eureka-producer",fallback = HelloFeignApiImpl.class)
public interface HelloFeignApi {
    
    @GetMapping("/api/hello/{name}")
    String hello(@PathVariable("name") String name);
    
}
