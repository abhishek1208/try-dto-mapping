package com.example.demo.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor

public class Person {
    private String name;
    private String hobby;

    private PersonAddress address;
}
