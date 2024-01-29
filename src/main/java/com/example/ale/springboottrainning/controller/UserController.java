package com.example.ale.springboottrainning.controller;

import com.example.ale.springboottrainning.model.Person;
import com.example.ale.springboottrainning.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;
import java.util.stream.StreamSupport;

@org.springframework.stereotype.Controller
@RequestMapping("/users")
public class UserController {

    private final PersonRepository personRepository;


    @Autowired
    public UserController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/all")
    public ResponseEntity<Iterable<Person>> getAllUsers() {
        Iterable<Person> persons = personRepository.findAll();
        long count = StreamSupport.stream(persons.spliterator(), false).count();
        logger.info("Count of users: {}", count);
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Person> getUserById(@PathVariable("userId") String userId) {
        Person person = personRepository.findById(UUID.fromString(userId)).orElse(null);
        return ResponseEntity.ok(person);
    }
}
