package com.iamstevol.banking_app.play;

import java.util.Scanner;

/**
 * 1. Develop a class averaging program that processes grade for an arbitrary number of students each time its run.
 *
 * 2. A college offers a course that prepares student for the state licensing exam for brokers. Last year, ten of the
 * students who completed this course took the exam. The college wants to know how well the students did on the exam.
 * You've been asked to write a program to summarize the results. You've been given a list of these 10 students. Next
 * to each name is written a 1 if the student passed the exam or a 2 if the student failed the exam.
 */

public class LoopStructure {

    public void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int gradeCounter = 0;
        int flagValue = -1;
        double average;
        System.out.print("Enter a score or -1 to quit: ");
        int grade = scanner.nextInt();

        while (grade != flagValue) {
            totalScore += grade;
            gradeCounter += 1;
            System.out.print("Enter a score or -1 to quit: ");
            grade = scanner.nextInt();
        }
        if (gradeCounter != 0) {
            average = totalScore/gradeCounter;
            System.out.println("The average score the " + gradeCounter + " students is " + average);
        } else {
            System.out.println("No score was entered");
        }
    }

    public static void main(String[] args) {
        LoopStructure loopStructure = new LoopStructure();
        loopStructure.calculateAverage();
    }
}
