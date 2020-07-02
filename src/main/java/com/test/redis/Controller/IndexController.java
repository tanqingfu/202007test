package com.test.redis.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    protected static Logger logger= LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String helloworld(){
        logger.debug("访问hello");
        return "Hello world!";

    }
    @RequestMapping("/hello/{name}")

    public String helloName(@PathVariable String name){
        logger.debug("访问helloName,Name={}",name);
        return "Hello "+name;
    }
}
