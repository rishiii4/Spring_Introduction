package com.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPIController {

    // Printing hello from BridgeLabz to the user
    @GetMapping("/hello")
    public String hello(){
        return "Hello From BridgeLabz!";
    }

    // Rest call to show hello Mark from BridgeLabz
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam("name") String name){
        return "Hello "+ name +" from BridgeLabz";
    }

    // Rest call to show hello Mark using param
    @GetMapping("/hello/param/{name}")
    public String sayParam(@PathVariable String name){
        return "Hello "+name+ " from BridgeLabz!";
    }

    // REST Call to show Hello Mark Taylor from BridgeLabz
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+ user.getFirstName() +" "+ user.getLastName()+"!";
    }

}
