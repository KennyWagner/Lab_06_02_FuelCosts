package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	    double numGallons;
        double milesPerGallon;
        double gasPrice;

        System.out.println("How many Gallons of gas are in your tank?");
        if (in.hasNextDouble())
        {
            numGallons = in.nextDouble();
            System.out.println("How many miles per gallon does your car get?");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                System.out.println("What is the price of gas?");
                if (in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    System.out.println("It will cost you " + 100/milesPerGallon * gasPrice + "$ to drive 100 miles.");
                    System.out.println("On your current tank you can drive " + numGallons * milesPerGallon + " miles without stopping.");
                }
                else
                {
                    System.out.println("Error, bad input, please enter a number.");
                }
            }
            else
            {
                System.out.println("Error, bad input, please enter a number.");
            }
        }
        else
        {
            System.out.println("Error, bad input, please enter a number.");
        }
    }
}
