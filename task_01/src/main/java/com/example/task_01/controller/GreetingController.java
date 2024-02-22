package com.example.task_01.controller;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    //  MVP Task 1:
    /*
    @GetMapping()
    public String greeting(){
        return "Good afternoon Colin!";
    }
     */

    @GetMapping
    public Greeting greeting(@RequestParam(required=false) String timeOfDay){
        return new Greeting("Colin", timeOfDay);
    }

    @GetMapping(value = "/summer")
    public Celebration celebration(){
        return new Celebration("Happy summer solstice!");
    }

}
