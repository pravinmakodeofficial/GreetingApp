package com.pravin.assignments.Greeting.model;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private Long counter;
    private String template;

    public Greeting(long counter, String template) {
        this.counter=counter;
        this.template=template;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
