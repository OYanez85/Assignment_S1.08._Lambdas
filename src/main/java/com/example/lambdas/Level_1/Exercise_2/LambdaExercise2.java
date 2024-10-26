package com.example.lambdas.Level_1.Exercise_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class LambdaExercise2 {
    public List<String> filterStringsWithOAndLengthGreaterThanFive(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.contains("o") && s.length() > 5)
                      .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        LambdaExercise2 exercise2 = new LambdaExercise2();
        List<String> strings = Arrays.asList("HelloWorld", "Java", "LambdaExample", "Test", "LongStringWithO");
        List<String> filteredStrings = exercise2.filterStringsWithOAndLengthGreaterThanFive(strings);
        System.out.println("Filtered Strings: " + filteredStrings);
    }
}
