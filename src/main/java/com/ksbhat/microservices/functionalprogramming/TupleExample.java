package com.ksbhat.microservices.functionalprogramming;


import java.util.*;
import java.util.stream.*;

public class TupleExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cat", "dog", "egg", "fig", "grape");

        // Grouping by length and converting to tuples (list of lists)
        Map<Integer, List<List<String>>> tuples = strings.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> Arrays.asList(entry.getValue())
                ));

        // Printing the tuples map
        System.out.println(tuples);
    }
}
