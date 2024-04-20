package com.ksbhat.microservices.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample{
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // replaceAll() example:
        // Replace each element in the list by multiplying it by 2
        numbers.replaceAll(number -> number * 2);
        System.out.println("After replaceAll: " + numbers);

        // removeIf() example:
        // Define a Predicate to remove elements greater than 30
        Predicate<Integer> removePredicate = number -> number > 30;

        // Remove elements from the list using the predicate
        numbers.removeIf(removePredicate);
        System.out.println("After removeIf: " + numbers);
    }
}
