package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by barath on 08/06/18.
 */
@RestController
public class AppController {

    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;



    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public User user(){
        return  this.userService.getUserFromRepository("barath");
    }
}
