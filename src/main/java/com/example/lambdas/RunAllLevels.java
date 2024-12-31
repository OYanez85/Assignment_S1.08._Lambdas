package com.example.lambdas.Level_1;

import com.example.lambdas.Level_1.RunAllExercises;
import com.example.lambdas.Level_2.Exercise1;
import com.example.lambdas.Level_2.Exercise2;
import com.example.lambdas.Level_2.Exercise3;
import com.example.lambdas.Level_2.Exercise4;
import com.example.lambdas.Level_3.Exercise1;

public class RunAllLevels {
    public static void main(String[] args) {
        System.out.println("Running all levels...");

        // Level 1
        try {
            System.out.println("\nRunning Level 1 exercises:");
            RunAllExercises.main(args);
        } catch (Exception e) {
            System.out.println("Error running Level 1: " + e.getMessage());
        }

        // Level 2
        try {
            System.out.println("\nRunning Level 2 exercises:");
            Exercise1.main(args);
            Exercise2.main(args);
            Exercise3.main(args);
            Exercise4.main(args);
        } catch (Exception e) {
            System.out.println("Error running Level 2: " + e.getMessage());
        }

        // Level 3
        try {
            System.out.println("\nRunning Level 3 exercises:");
            Exercise1.main(args);
        } catch (Exception e) {
            System.out.println("Error running Level 3: " + e.getMessage());
        }

        System.out.println("All levels completed.");
    }
}
