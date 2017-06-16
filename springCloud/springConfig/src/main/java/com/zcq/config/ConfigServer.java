package com.zcq.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by zcq on 2017/6/12.
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServer.class).web(true).run(args);
    }
}