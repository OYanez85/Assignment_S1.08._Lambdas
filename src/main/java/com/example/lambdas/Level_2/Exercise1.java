package com.example.lambdas.Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Ava", "Adam", "Eve", "Ana", "Max");
        
        List<String> result = names.stream()
            .filter(name -> name.startsWith("A") && name.length() == 3)
            .collect(Collectors.toList());

        System.out.println("Names starting with 'A' and of length 3: " + result);
    }
}
