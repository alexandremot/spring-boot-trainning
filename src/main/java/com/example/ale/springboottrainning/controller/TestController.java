package com.example.ale.springboottrainning.controller;

import com.example.ale.springboottrainning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    Person person;


    @GetMapping("/hello")
    @ResponseBody
    public Person hello(){

        person.setName("Ale");
        person.setAge(10);

        return person;
    }
}
