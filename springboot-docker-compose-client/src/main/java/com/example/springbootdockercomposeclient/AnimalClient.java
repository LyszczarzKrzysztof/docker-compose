package com.example.springbootdockercomposeclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AnimalClient {

    @GetMapping("/showForGui")
    public Animal[] get(){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Animal[]> exchange = restTemplate.exchange("http://api:9090/animals",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Animal[].class);

        Animal[] body = exchange.getBody();

        return body;

    }
}
