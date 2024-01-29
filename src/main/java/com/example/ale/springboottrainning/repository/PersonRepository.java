package com.example.ale.springboottrainning.repository;

import com.example.ale.springboottrainning.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {
}
