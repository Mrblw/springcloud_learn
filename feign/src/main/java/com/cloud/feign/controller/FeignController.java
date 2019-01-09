package com.cloud.feign.controller;

import com.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;//启动时注入，编译器不识别属于正常

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name ) + "feign";
    }

    @GetMapping(value = "/query")
    public String sayID(@RequestParam String name) {
        return feignService.getID( name );
    }

}
