package com.pravin.assignments.Greeting.controller;

import com.pravin.assignments.Greeting.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value ={"","/","home"})
    private String sayHello() {
    return "Hello World";
    }

    @GetMapping("/{name}")
    private String nameHello(@PathVariable ("name") String name){
        return "Hello "+name+" !!";
    }

    @RequestMapping(value = {"query"},method = RequestMethod.GET)
    private String queryHello(@RequestParam (value = "name") String name){
        return "Hello "+name+" from query !!";
    }

    @PostMapping("/post")
    private String postHello(@RequestBody User user){
    return "Hello "+user.getFirstName()+" "+user.getLastName()+" !";
    }

    @PutMapping("/put/{firstName}")
    private String putHello(@PathVariable ("firstName") String firstName,@RequestParam (value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName+" from Put !!";
    }
}
