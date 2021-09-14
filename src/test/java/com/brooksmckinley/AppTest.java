/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testInterestReport() {
        String expected = "After 4 years at 4.300000%, the investment will be worth $1758.00.";
        String actual = App.generateInterestReport(1500, 0.043, 4);
        Assertions.assertEquals(expected, actual);
    }
}