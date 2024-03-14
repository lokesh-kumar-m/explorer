package com.dev.explorer.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
    
    @GetMapping(path = "/hello")
    public String helloWeb(){
        return "Hello!";
    }

    @GetMapping(path="/items")
    public Store getItems(){
        return new Store("playstation");
    }
//path variable capturing variable "name" from the url
//path parameters are variables in the path url
    @GetMapping(path="/items/pathvar/{name}")
    public Store getPathVar(@PathVariable String name){
        return new Store(String.format("%s, playstations55", name));
    }
}
