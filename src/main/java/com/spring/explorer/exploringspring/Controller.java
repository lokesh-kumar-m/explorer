package com.spring.explorer.exploringspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//defining this class a controller
@RestController
public class Controller {
    
    //This annotation is used to map web request to a specific handler
    @RequestMapping("/topics") 
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics(1, "Cloud"),
                new Topics(2,"Webdev"),
                new Topics(3,"Azure/Aws/GCP")
            );
    }
    @RequestMapping("/")
    public String showMessage(){
        return "<h1>Hej! Hello</h1>";
    }
}
