package com.spring.explorer.exploringspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//defining this class a controller
@RestController
public class CurrencyConfigController {
    
    @Autowired
    private CurrencyConfiguration configuration;
    //This annotation is used to map web request to a specific handler
    @RequestMapping("/Currency")
    public CurrencyConfiguration getAll(){
        return configuration;
    }

}
