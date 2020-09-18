package com.sdgtt.com.eurekaclient1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tao
 * @version 2020-09-17 14:43
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public Object hello(){
        log.info("service provider 2");
        return "hello,I'am service provider 2";
    }
}
