package com.ksbhat.microservices.functionalprogramming;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Using a constructor reference
        Function<String, Person> personConstructor = Person::new;
        Stream.of(1,2,3,4).reduce(0, Integer::sum);
        
    }
}