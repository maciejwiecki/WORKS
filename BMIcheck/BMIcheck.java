package com.mycompany.example;

import java.util.Scanner;

public class BMIcheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! In this application you can check your BMI status.");
        System.out.println("Please type your weight:");
        double weight = scanner.nextDouble();
        System.out.println("Your weight is: " + weight + " kgs.");
        System.out.println("How tall are you? In centimeters?"); 
        double height = scanner.nextDouble();
        System.out.println("Your height is :" + height + " centimeters.");
        double tall = height / 100;
        double BMI = weight / (tall * tall);   
        System.out.println("Your BMI is: " + BMI);
        if(BMI < 18.5) System.out.println("Your BMI is under normal level. Go eat!");
        if(BMI > 24.9) System.out.println("Your BMI is over normal level. You are fat!");
        if(BMI < 24.9 & BMI > 18.5) System.out.println("Your BMI is on right level.");        
    }
}
