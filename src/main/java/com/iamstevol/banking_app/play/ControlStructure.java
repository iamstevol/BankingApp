package com.iamstevol.banking_app.play;

import java.util.Scanner;

public class ControlStructure {

    /**
     * A class of 10 students took a quiz. The grades (0 - 100) of this quiz is available to you
     * Determine the class average
     */
    public void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int gradeCounter = 0;
        int grade;
        while (gradeCounter < 2) {
            System.out.print("Enter a grade: ");
            grade = scanner.nextInt();
            totalScore = totalScore + grade;
            gradeCounter = gradeCounter + 1;
        }
        double average = totalScore / gradeCounter;
        System.out.printf("The average is %.2f", average );
        System.out.println("\ngrade counter: " + gradeCounter);
    }

    public static void main(String[] args) {
        ControlStructure controlStructure = new ControlStructure();
        controlStructure.calculateAverage();
    }
}
