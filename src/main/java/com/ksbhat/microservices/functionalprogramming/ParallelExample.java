package com.ksbhat.microservices.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class ParallelExample {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        // Calculate the sum of the list using a parallel stream
        int sum = numbers.stream()
                .parallel() // Convert the stream to a parallel stream
                .mapToInt(Integer::intValue) // Convert Integer to int
                .sum(); // Calculate the sum

        // Print the sum
        System.out.println("Sum of numbers: " + sum);
    }
}
