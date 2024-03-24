package com.ksbhat.microservices.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PlayWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        
    }
}
