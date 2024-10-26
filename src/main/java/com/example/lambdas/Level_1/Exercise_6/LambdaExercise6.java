package com.example.lambdas.Level_1.Exercise_6;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class LambdaExercise6 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Orange", "Pear", "Kiwi");
        items.sort(Comparator.comparingInt(String::length));
        items.forEach(System.out::println);
    }
}
