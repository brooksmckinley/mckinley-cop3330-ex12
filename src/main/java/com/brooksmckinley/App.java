/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        // Divide by 100 to convert percentage into decimal
        double interest = scan.nextDouble() / 100.0;
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        System.out.println(generateInterestReport(principal, interest, years));
    }

    public static String generateInterestReport(double principal, double interest, int years) {
        double investmentWorthCents = (principal * 100) * (1 + (interest * years));
        // Round up to next cent
        investmentWorthCents = Math.ceil(investmentWorthCents);

        return String.format("After %d years at %f%%, the investment will be worth $%.2f.",
                years, interest * 100, investmentWorthCents / 100.0);
    }
}