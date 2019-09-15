package com.superdeman.serviceribbon.web;

import com.superdeman.serviceribbon.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author superdeman
 * create 2019-09-12 09:41:32
 */
@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloWorldService.helloWorldService( name );
    }
}
