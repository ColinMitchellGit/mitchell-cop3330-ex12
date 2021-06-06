/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principal_string = input.nextLine();

        System.out.print("Enter the rate of interest: ");
        String rate_string = input.nextLine();

        System.out.print("Enter the years: ");
        String years_string = input.nextLine();

        int principal = parseInt(principal_string);
        double rate = parseDouble(rate_string) / 100;
        int years = parseInt(years_string);

        double calculation = principal * (1 + (rate * years));
        int final_amount = (int)calculation;

        System.out.println("After " + years_string + " years at " + rate_string + "%, the investment will be worth $" + final_amount + ".");
    }
}
