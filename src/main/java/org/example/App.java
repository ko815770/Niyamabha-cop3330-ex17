package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int gender = 0, weight = 0, ounces = 0, hours = 0;
        boolean pass = true;
        double bac = 0;
        try {
            System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
            Scanner input = new Scanner(System.in);
            gender = input.nextInt();
            System.out.println("How many ounces of alcohol did you have?");
            ounces = input.nextInt();
            System.out.println("What is your weight in pounds?");
            weight = input.nextInt();
            System.out.println("How many hours has it been since your last drink?");
            hours = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value");
            pass = false;
        }
        if (pass == true)
        {
            bac = ounces * 5.14 / weight * (gender == 1 ? 0.73 : 0.66) - 0.015 * hours;
            System.out.println("Your BAC is " + String.format("%.6f", bac));
            System.out.println(bac > 0.08 ? "It is not legal for you to drive." : "it is legal for you to drive.");
        }
    }
}