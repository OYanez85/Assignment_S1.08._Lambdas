package com.example.lambdas.Level_1.Exercise_8;
@FunctionalInterface
interface ReverseString {
    String reverse(String str);
}
public class LambdaExercise8 {
    public static void main(String[] args) {
        ReverseString reverse = (str) -> new StringBuilder(str).reverse().toString();
        String original = "Lambdas";
        String reversed = reverse.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
