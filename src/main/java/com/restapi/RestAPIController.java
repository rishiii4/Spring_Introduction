package com.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
