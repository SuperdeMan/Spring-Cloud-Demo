package com.superdeman.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author superdeman
 * create 2019-09-12 09:41:32
 */
@Service
public class HelloWorldService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloWorldError")
    public String helloWorldService(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/hi?name="+name,String.class);
    }

    public String helloWorldError(String name) {
        return name + ", error!";
    }
}
