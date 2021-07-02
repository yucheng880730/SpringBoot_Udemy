package com.leo.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {

        return "Hello World Time on server is: " + LocalDateTime.now();

    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {

        return "Run a hard 5k!";

    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {

        return "Today is your lucky day.";

    }

    @GetMapping("/Amy")
    public String getDailyAmy() {

        return "She is my sister";

    }

}
