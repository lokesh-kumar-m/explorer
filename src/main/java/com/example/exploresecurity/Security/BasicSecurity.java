package com.example.exploresecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurity {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        //Any http request should be authorized
        http.authorizeHttpRequests(
            auth->auth.anyRequest().authenticated()
        );
        //managing http sessions stateless->never create a session and use it| disable sessions
        http.sessionManagement(
            session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );
        
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf->csrf.disable());
        return http.build();
    }

}
