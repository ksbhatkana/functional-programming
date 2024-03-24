package com.ksbhat.microservices.functionalprogramming;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

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

}
