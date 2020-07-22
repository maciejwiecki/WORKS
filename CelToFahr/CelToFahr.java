package com.mycompany.example;

import java.util.Scanner;

public class CelToFahr {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! This application is converting Celsius degrees to Fahrenheit degrees. Please type temperature in Celsius to convert:");
        double celsius = scanner.nextDouble();
        System.out.println("Typed value is: " + celsius + " Celcius degrees.");
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " Celcius degrees is: " + fahrenheit + " Fahrenheit degrees.");
    }
}
