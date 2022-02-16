package com.pravin.assignments.Greeting.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    private static String template = "Hello , %s";
    private AtomicLong counter = new AtomicLong();

}
