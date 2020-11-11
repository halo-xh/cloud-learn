package com.xh.service.hystriximpl;

import com.xh.service.HelloFeignApi;
import org.springframework.stereotype.Component;

/**
 * Created by Xiao Hong on 2020-11-11
 */
@Component // don't forget Inject
public class HelloFeignApiImpl implements HelloFeignApi {
    
    @Override
    public String hello(String name) {
        return "hello function cannot access temporally";
    }
}
