package com.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    // Printing hello from BridgeLabz to the user
    @GetMapping("/hello")
    public String hello(){
        return "Hello From BridgeLabz!";
    }

}
