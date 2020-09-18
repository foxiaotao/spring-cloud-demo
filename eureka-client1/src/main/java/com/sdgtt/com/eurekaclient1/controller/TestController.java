package com.sdgtt.com.eurekaclient1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tao
 * @version 2020-09-17 14:43
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public Object hello(){
        return "hello,I'am service provider 1";
    }
}
