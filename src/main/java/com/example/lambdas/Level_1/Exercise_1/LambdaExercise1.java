package com.example.lambdas.Level_1.Exercise_1;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class LambdaExercise1 {
    public List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.contains("o"))
                      .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        LambdaExercise1 exercise1 = new LambdaExercise1();
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Lambda", "Example");
        List<String> filteredStrings = exercise1.filterStringsWithO(strings);
        System.out.println("Filtered Strings: " + filteredStrings);
    }
}
