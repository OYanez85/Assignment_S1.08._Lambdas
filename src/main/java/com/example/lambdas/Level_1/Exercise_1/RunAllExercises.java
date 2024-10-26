package com.example.lambdas;

import com.example.lambdas.Level_1.RunAllExercises;
import com.example.lambdas.Level_2.Exercise1; // Fully qualified
import com.example.lambdas.Level_2.Exercise2;
import com.example.lambdas.Level_2.Exercise3;
import com.example.lambdas.Level_2.Exercise4;
import com.example.lambdas.Level_3.Exercise1; // Fully qualified

public class RunAllLevels {
    public static void main(String[] args) {
        System.out.println("Running all exercises...");

        try {
            System.out.println("\nRunning Level 1 exercises:");
            RunAllExercises.main(args);
        } catch (Exception e) {
            System.out.println("Error running Level 1: " + e.getMessage());
        }

        try {
            System.out.println("\nRunning Level 2 exercises:");
            com.example.lambdas.Level_2.Exercise1.main(args); // Fully qualified
            com.example.lambdas.Level_2.Exercise2.main(args);
            com.example.lambdas.Level_2.Exercise3.main(args);
            com.example.lambdas.Level_2.Exercise4.main(args);
        } catch (Exception e) {
            System.out.println("Error running Level 2: " + e.getMessage());
        }

        try {
            System.out.println("\nRunning Level 3 exercises:");
            com.example.lambdas.Level_3.Exercise1.main(args); // Fully qualified
        } catch (Exception e) {
            System.out.println("Error running Level 3: " + e.getMessage());
        }
    }
}
