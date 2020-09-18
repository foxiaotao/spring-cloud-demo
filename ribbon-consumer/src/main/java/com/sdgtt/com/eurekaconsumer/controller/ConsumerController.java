package com.sdgtt.com.eurekaconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @author tao
 * @version 2020-09-17 15:04
 */
@Slf4j
@RestController
@RequestMapping("springboot/ribbon")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public Object hello() {
        String result = restTemplate.getForObject("http://sdgttSpringClient/hello", String.class);
        log.info("sdgttSpringClient服务返回结果为：{}", result);
        return result;
    }

}
