package com.example.lambdas.Level_1.Exercise_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class LambdaExercise7 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Orange", "Pear", "Kiwi");
        items.sort(Comparator.comparingInt(String::length).reversed());
        items.forEach(System.out::println);
    }
}
