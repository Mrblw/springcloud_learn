package com.cloud.feign.service.fallbackimpl;

import com.cloud.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }

    @Override
    public String getID(String name) {
        return "sorry "+ name;
    }
}
