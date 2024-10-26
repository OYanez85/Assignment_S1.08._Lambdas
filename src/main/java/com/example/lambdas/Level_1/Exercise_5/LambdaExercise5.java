package com.example.lambdas.Level_1.Exercise_5;
@FunctionalInterface
interface PiValue {
    double getPiValue();
}
public class LambdaExercise5 {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());
    }
}
