package com.iamstevol.banking_app.play;

import java.util.Scanner;

public class Scanning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = input.nextInt();

        System.out.print("Input first number: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.print("The result of the two numbers is: " + sum);
    }
}
