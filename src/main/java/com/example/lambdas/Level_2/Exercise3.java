package com.example.lambdas.Level_2;

@FunctionalInterface
interface Operation {
    float operation(float a, float b);
}

public class Exercise3 {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operation(5, 3));
        System.out.println("Subtraction: " + subtraction.operation(5, 3));
        System.out.println("Multiplication: " + multiplication.operation(5, 3));
        System.out.println("Division: " + division.operation(5, 3));
    }
}
