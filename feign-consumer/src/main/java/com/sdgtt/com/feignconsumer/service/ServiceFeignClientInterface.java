package com.sdgtt.com.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 某某接口feign
 *
 * @author tao
 * @version 2020-09-18 15:38
 */
@FeignClient(value="SDGTTSPRINGCLIENT")
public interface ServiceFeignClientInterface {

    @GetMapping("/hello")
    String consumer();
}
