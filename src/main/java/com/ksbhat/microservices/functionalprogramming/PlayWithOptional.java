package com.ksbhat.microservices.functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PlayWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");

        List<String> courseList = List.of("Java", "Python", "C++");
        courseList.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
        
    }
}
