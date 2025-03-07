package org.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @RequestMapping("/hello")
    public String helloWorld(@RequestBody Map<String,Object> map){
        logger.debug("this is logback log debug");
        logger.info("map",map);
        logger.info("interface helloWorld running");
        return "get it";
    }

    @RequestMapping("/hello2")
    public String helloWorld2(){
        logger.debug("this is logback log debug");
        logger.info("interface helloWorld running");
        return "hello";
    }
}
