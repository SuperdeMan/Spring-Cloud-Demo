package com.superdeman.servicefeign.clients;

import com.superdeman.servicefeign.clients.fallback.ScheduleServiceHelloWorldHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-helloworld", fallback = ScheduleServiceHelloWorldHystric.class)
public interface ScheduleServiceHelloWorld {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHelloWorldFromClient(@RequestParam(value = "name") String name);
}
