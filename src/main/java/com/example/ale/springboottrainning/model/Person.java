package com.example.ale.springboottrainning.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "projeto_person")
public class Person {

    @Id
    private UUID userId;

    private String name;

    private String age;
}
