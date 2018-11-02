package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "Tom") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/getID")
    public String home1(@RequestParam(value = "name", defaultValue = "Tom") String name) {
        return "you are" + name + ", your id is "+ 3 +" !result from port:" + port;
    }
}
