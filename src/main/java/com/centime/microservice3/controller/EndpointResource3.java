package com.centime.microservice3.controller;

import com.centime.microservice3.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointResource3 {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/cancatenate")
    public String concatenatedResponse(@RequestBody Person person) {
        LOG.info("Inside Microservice3..");
        return person.getName() + " " + person.getSurname();
    }
}
