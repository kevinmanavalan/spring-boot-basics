package com.example.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public Greeting listGreeting(
            @RequestParam(name = "name", defaultValue = "Kevin") String name,
            @RequestParam(name = "age", defaultValue = "24") int age
    ) {
        return new Greeting(age, name);
    }

    @PostMapping("/greeting")
    public String addGreeting(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age", defaultValue = "0") int age) {
        if (name == null || age == 0) {
            return "Faulty Data";
        } else {
            return "Data received successfully";
        }
    }

    @PutMapping("/greeting")
    public String updateGreeting(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "new_name") String new_name
    ) {
        if (name != null && new_name != null) {
            return "name found and updated";
        } else {
            return "name not found";
        }
    }
}

