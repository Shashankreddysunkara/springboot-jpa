package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by barath on 08/06/18.
 */
@Service
public class UserService {

    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserFromRepository(String userName){
        this.hello();
        return this.userRepository.findByUserName(userName);
    }

    public String hello(){
        return "hello home";
    }

    @PostConstruct
    public void init(){

        this.userRepository.save(new User("1","barath"));
    }

}
