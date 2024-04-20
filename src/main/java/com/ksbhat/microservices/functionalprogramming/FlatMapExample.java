package com.ksbhat.microservices.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        // List of lists (nested lists)
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana", "Cherry"),
                Arrays.asList("Dog", "Elephant", "Fox"),
                Arrays.asList("Giraffe", "Horse", "Iguana")
        );

        // Using flatMap to flatten the stream of lists into a single stream of strings
        List<String> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream()) // Transform each list into a stream
                .collect(Collectors.toList()); // Collect the results into a single list

        // Print the flattened list
        System.out.println("Flattened list: " + flattenedList);
    }
}
