package com.zcq.demo.controller;

import com.zcq.demo.idl.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unknow on 2017/6/22.
 */
@RestController
public class ConsumerController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return demoService.add(1,2);
    }
}
