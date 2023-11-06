package com.buddypast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    

    @RequestMapping(value = "/hello, method = RequestMethod.GET")
    public String getHello() {
        return "Hello I'am";
    }
}
