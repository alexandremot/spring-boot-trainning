package com.example.ale.springboottrainning.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {

    private String uuid;
    private String name;
    private int age;
}
