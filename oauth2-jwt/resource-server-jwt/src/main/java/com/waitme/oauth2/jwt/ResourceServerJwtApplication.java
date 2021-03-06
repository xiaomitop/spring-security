package com.waitme.oauth2.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
@EnableDiscoveryClient
public class ResourceServerJwtApplication {

    @RequestMapping("/")
    public String hi() {
        return "hi, i'm service jwt";
    }

    public static void main(String[] args) {
        SpringApplication.run(ResourceServerJwtApplication.class, args);
    }


}
