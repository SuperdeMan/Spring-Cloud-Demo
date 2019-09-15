package com.superdeman.servicefeign.clients.fallback;

import com.superdeman.servicefeign.clients.ScheduleServiceHelloWorld;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHelloWorldHystric implements ScheduleServiceHelloWorld {

    @Override
    public String sayHelloWorldFromClient(String name) {
        return name + ", error!";
    }
}
