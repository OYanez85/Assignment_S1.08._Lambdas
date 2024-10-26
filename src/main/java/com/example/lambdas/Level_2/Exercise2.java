package com.example.lambdas.Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 55, 44);
        
        String result = numbers.stream()
            .map(num -> (num % 2 == 0 ? "e" : "o") + num)
            .collect(Collectors.joining(", "));

        System.out.println("Formatted numbers: " + result);
    }
}
