package com.example.lambdas.Level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "JAVA", 4.0f));
        students.add(new Student("Bob", 22, "PHP", 3.5f));
        students.add(new Student("Ava", 19, "JAVA", 5.0f));
        students.add(new Student("Adam", 21, "C++", 3.0f));
        students.add(new Student("Eve", 18, "JAVA", 5.5f));
        students.add(new Student("Anya", 20, "PHP", 4.5f));
        students.add(new Student("Charlie", 23, "JAVA", 2.5f));
        students.add(new Student("Daniel", 24, "JAVA", 6.0f));
        students.add(new Student("Erica", 25, "PHP", 5.0f));
        students.add(new Student("Ally", 17, "JAVA", 5.5f));

        students.forEach(student -> System.out.println("Name: " + student.getName() + ", Age: " + student.getAge()));

        List<Student> studentsWithA = students.stream()
            .filter(s -> s.getName().startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Students whose names start with 'A': " + studentsWithA.stream().map(Student::getName).collect(Collectors.toList()));

        List<Student> highGradeStudents = students.stream()
            .filter(s -> s.getGrade() >= 5)
            .collect(Collectors.toList());
        System.out.println("Students with grade >= 5: " + highGradeStudents.stream().map(Student::getName).collect(Collectors.toList()));

        List<Student> highGradeNonPHP = students.stream()
            .filter(s -> s.getGrade() >= 5 && !s.getCourse().equals("PHP"))
            .collect(Collectors.toList());
        System.out.println("Students with grade >= 5 and not in PHP: " + highGradeNonPHP.stream().map(Student::getName).collect(Collectors.toList()));

        List<Student> adultJavaStudents = students.stream()
            .filter(s -> s.getCourse().equals("JAVA") && s.getAge() >= 18)
            .collect(Collectors.toList());
        System.out.println("JAVA students who are adults: " + adultJavaStudents.stream().map(Student::getName).collect(Collectors.toList()));
    }
}
