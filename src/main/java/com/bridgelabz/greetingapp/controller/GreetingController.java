package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.service.GreetingServiceIMPL;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgelabz.greetingapp.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstname(name);
        return greetingService.addGreeting(user);
    }
}
