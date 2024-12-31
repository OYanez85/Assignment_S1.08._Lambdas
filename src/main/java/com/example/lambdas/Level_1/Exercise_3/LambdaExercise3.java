package com.example.lambdas.Level_1.Exercise_3;
import java.util.Arrays;
import java.util.List;
public class LambdaExercise3 {
    public static void printMonths() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(month -> System.out.println(month));
    }
    public static void main(String[] args) {
        System.out.println("Months of the Year:");
        printMonths();
    }
}
