package com.sdgtt.com.feignconsumer.controller;

import com.sdgtt.com.feignconsumer.service.ServiceFeignClientInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign测试controller
 *
 * @author tao
 * @version 2020-09-18 16:00
 */
@Slf4j
@RestController
@RequestMapping("feign/test")
public class FeignTestController {

    @Autowired
    private ServiceFeignClientInterface serviceFeignClientInterface;

    @GetMapping("hello")
    public String feignTest() {
        String result = serviceFeignClientInterface.consumer();
        log.info("结果：{}", result);
        return result;
    }

}
