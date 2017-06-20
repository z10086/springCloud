package com.zcq.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by unknow on 2017/6/20.
 */


@EnableDiscoveryClient
@SpringBootApplication
public class ProviderDemo {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderDemo.class)
                .run(args);
    }
}

