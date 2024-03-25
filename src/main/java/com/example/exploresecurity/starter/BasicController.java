package com.example.exploresecurity.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    
    @GetMapping(path="/hello")
    public String getMessage(){
        return "This is baic Security";
    }
    // Spring enables security for every request that is sent to the application
    // When Spring security is eabled any request to the server would request to 
    // authenticate i.e login to the system.
    // Even if the request url is not valid or does not exits, spring security requests 
    // the user to authenticate yourself then I will let you know if the resource exists.

}
