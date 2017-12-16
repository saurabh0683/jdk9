package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

    private final static Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("time")
    @ResponseBody
    public Date time() {
        return new Date();
    }

}
