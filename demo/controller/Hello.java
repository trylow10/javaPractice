package com.example.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class Hello {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, World!";
    }
}
