package com.example.lambdas.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>(Arrays.asList("Apple", 3, "Banana", 4, "Cherry", 1, "elephant", "grape", 9));

        // Sort by the first character
        mixedList.sort((a, b) -> a.toString().charAt(0) - b.toString().charAt(0));

        // Sort strings containing "e" first
        List<Object> sortedList = mixedList.stream()
            .filter(o -> o.toString().contains("e"))
            .collect(Collectors.toList());
        
        sortedList.addAll(mixedList.stream()
            .filter(o -> !o.toString().contains("e"))
            .collect(Collectors.toList()));

        // Replace 'a' with '4'
        List<String> modifiedList = sortedList.stream()
            .map(o -> o.toString().replace("a", "4"))
            .collect(Collectors.toList());

        // Show only numeric elements
        List<String> numericElements = modifiedList.stream()
            .filter(o -> o.matches("\\d+"))
            .collect(Collectors.toList());

        System.out.println("Sorted and modified list: " + modifiedList);
        System.out.println("Numeric elements: " + numericElements);
    }
}
