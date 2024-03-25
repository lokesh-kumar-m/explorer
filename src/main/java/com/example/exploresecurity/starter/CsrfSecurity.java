package com.example.exploresecurity.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class CsrfSecurity {
    Logger logger=LoggerFactory.getLogger(getClass());

    @GetMapping(path="/csrf-token")
    public CsrfToken getToken(HttpServletRequest httpRequest){
        return (CsrfToken) httpRequest.getAttribute("_csrf");
    }
    
}
