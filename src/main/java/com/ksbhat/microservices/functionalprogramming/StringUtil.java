package com.ksbhat.microservices.functionalprogramming;

import java.util.function.BiPredicate;

class StringUtil {
    public boolean startsWith(String prefix, String str) {
        return str.startsWith(prefix);
    }
    public static void main(String[] args){
        // Using the instance method reference of an arbitrary object of a specific type
        BiPredicate<String, String> startsWithFunction = String::startsWith;

    }
}