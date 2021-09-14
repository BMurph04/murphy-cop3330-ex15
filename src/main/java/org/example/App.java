/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your username?");
        String username = input.next();

        System.out.println("What is the password?");
        String password = input.next();

        //known password
        String passwordKnown = "987a!@#";

        //checks to see if the password the user inputted matches the known password
        if(password.equals(passwordKnown)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
