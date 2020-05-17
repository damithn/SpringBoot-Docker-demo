package com.damithtech.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DAMITH SAMARAKOON on 5/17/2020
 */
@RestController
public class HelloController {
    @RequestMapping
    public String helloDocker(){
        return "hello , I'm Running On Docker !!";
    }
}
