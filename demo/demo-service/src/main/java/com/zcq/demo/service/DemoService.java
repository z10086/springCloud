package com.zcq.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by unknow on 2017/6/22.
 */
@FeignClient("demo-service")
public interface DemoService {

    Integer demo();

}
