package com.ksbhat.microservices.functionalprogramming;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Component
@Scope(value = "prototype")
class Hitachi {
    //content
}

public class PrintAllNumbersFP {

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }
    public static void printAllNumbersFP() {
        List<Integer> numbersList = List.of(12, 9 , 1, 2, 3, 4);
        numbersList.stream().filter(number -> number%2 == 0).forEach(System.out::println);
    }

    public static void printSquareOfEvenNumbersFP() {
        List<Integer> numbersList = List.of(12, 9 , 1, 2, 3, 4);
        numbersList.stream().filter(number -> number%2 == 0).map(number -> number * number).forEach(System.out::println);
    }

    public static void printCourseAndLengthFP() {
        List<String> courseList = List.of("Java", "Python", "C++");
        courseList.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
    }

    public static void printSumOfListFP() {
        List<Integer> courseList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(courseList.stream().reduce(0, (aggregate, nextNumber) -> aggregate + nextNumber));
    }

    public static void printSumOfListFP2ndApproach() {
        List<Integer> courseList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(courseList.stream().reduce(0, Integer::sum));
    }

    public static void findMaxValue() {
        List<Integer> courseList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(courseList.stream()
                .reduce(Integer.MIN_VALUE, (previousMax, currentNumber) ->
                        currentNumber > previousMax ? currentNumber:previousMax ));
    }

    public static void printDistinct() {
        List<Integer> courseList = List.of(1, 2, 3, 4, 5, 6, 4, 1);
        courseList.stream().distinct().forEach(System.out::println);
    }

    public static void printSorted() {
        List<Integer> courseList = List.of(1, 2, 3, 4, 5, 6, 4, 1);
        courseList.stream().sorted().forEach(System.out::println);
    }

    public static void printListOfStringsInOrder() {
        List<String> courseList = List.of("Java", "Python", "C++");
        courseList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public static void printListOfStringsInDescOrder() {
        List<String> courseList = List.of("Java", "Python", "C++");
        courseList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void printListOfStringsInOrderOfLength() {
        List<String> courseList = List.of("Java", "Python", "C++");
        courseList.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }

    public static void functionalInterfacesExample() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 4, 1);
        Predicate<Integer> isEvenPredicate = number -> number %2 == 0;
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number %2 == 0;
            }
        };

        Function<Integer, Integer> returnSquare = number -> number * number;
        Function<Integer, Integer> returnSquare2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };

        Consumer<Integer> printConsumer = System.out::println;
        Consumer<Integer> printConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        BinaryOperator<Integer> sumTwoIntegers = Integer::sum;
        BinaryOperator<Integer> sumTwoIntegers2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        List<Integer> numbers = List.of(1, 2, 3, 4);
        filterAndPrint(numbers, number -> number % 2 == 0);
        filterAndPrint(numbers, number -> number % 2 != 0);

        integers.stream().filter(isEvenPredicate).forEach(System.out::println);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
