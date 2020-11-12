package com.xh.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Webhook 来监测你在 Github.com
 *
 * Created by Xiao Hong on 2020-11-12
 */
@RestController
@RefreshScope //@RefreshScope，在客户端执行/actuator/refresh的时候就会更新此类下面的变量值。
public class HelloController {
    
    @Value("${xh.hello:error}")
    private String profile;
    
    @GetMapping("/info")
    public Mono<String> hello() {
        return Mono.justOrEmpty(profile);
    }
    
    /**
     * 启动项目后访问 http://localhost:13000/info 返回dev说明已经正确的从 Server 端获取到了参数。
     * 到此一个完整的服务端提供配置服务，客户端获取配置参数的例子就完成了。
     *
     * 我们再做一个小实验，手动修改 config-client-dev.yml 中配置信息为：dev update 提交到 Github,
     * 再次在浏览器访问 http://localhost:13000/info 返回：dev，说明获取的信息还是旧的参数，这是为什么呢？
     *
     * 因为 Spring Cloud Config 分服务端和客户端，服务端负责将 Git 中存储的配置文件发布成 REST 接口
     * ，客户端可以从服务端 REST 接口获取配置。但客户端并不能主动感知到配置的变化，从而主动去获取新的配置。
     * 客户端如何去主动获取新的配置信息呢，Spring Cloud 已经给我们提供了解决方案，
     * 每个客户端通过 POST 方法触发各自的 /actuator/refresh。
     */
}
