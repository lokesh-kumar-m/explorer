package com.example.exploresecurity.starter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    
    private static final List<Lists> USER_LIST = List.of(new Lists("Lome","Konichiva"),new Lists("maya","Hej!"));
    private Logger logger=LoggerFactory.getLogger(getClass());

    @GetMapping(path="/hello")
    public String getMessage(){
        return "This is baic Security";
    }
    // Spring enables security for every request that is sent to the application
    // When Spring security is eabled any request to the server would request to 
    // authenticate i.e login to the system.
    // Even if the request url is not valid or does not exits, spring security requests 
    // the user to authenticate yourself then I will let you know if the resource exists.

    @GetMapping(path="/list")
    public List<Lists> getAllList(){
        return USER_LIST;
    }

    @GetMapping(path="/{name}/list")
    public Lists getUserList(@PathVariable String name){
        return USER_LIST.get(0);
    }
    @PostMapping(path="/{name}/set")
    public void createList(@PathVariable String name,@RequestBody Lists lst){
        logger.debug(""+lst);
        return;
    }
}


record Lists(String name, String message) {
}