package com.superdeman.servicefeign.web;

import com.superdeman.servicefeign.clients.ScheduleServiceHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    ScheduleServiceHelloWorld scheduleServiceHelloWorld;

    @GetMapping(value = "/hi")
    public String sayHelloWorld(@RequestParam String name) {
        return scheduleServiceHelloWorld.sayHelloWorldFromClient( name );
    }
}