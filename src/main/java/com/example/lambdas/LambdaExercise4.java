package com.example.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaExercise4 {
    public static void printMonthsUsingMethodReference() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Months of the Year using Method Reference:");
        printMonthsUsingMethodReference();
    }
}
