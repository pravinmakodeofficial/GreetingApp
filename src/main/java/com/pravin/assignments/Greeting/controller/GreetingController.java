package com.pravin.assignments.Greeting.controller;

import com.pravin.assignments.Greeting.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello , %s";
    private AtomicLong counter = new AtomicLong();

    @GetMapping("/greetings/{name}")
    public Greeting greeting(@PathVariable (value = "name") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }



}
