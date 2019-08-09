package com.techrat.springbootelasticbeanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping(value = "/hello")
    public String findAll() {
        return "Hello Chennai";
    }

}
