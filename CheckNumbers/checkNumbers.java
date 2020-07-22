/*
This Java application is comparing four numbers and is typing smallest one and biggest one.
*/
package com.mycompany.example;

import java.util.Scanner;

public class checkNumbers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put first number: ");
        int a = scanner.nextInt();
        System.out.println("Put second number: ");
        int b = scanner.nextInt();
        System.out.println("Put third number: ");
        int c = scanner.nextInt();
        System.out.println("Put forth number: ");
        int d = scanner.nextInt();
        System.out.println("Typed numbers are: A - " + a + " , B - " + b + " , C - " + c + " ,D - " + d);
        
        if(a > b & a > c & a > d) System.out.println("A is the biggest and it is: " + a);
        if(b > a & b > c & b > d) System.out.println("B is the biggest and it is: " + b);
        if(c > a & c > b & c > d) System.out.println("C is the biggest and it is: " + c);
        if(d > a & d > b & d > c) System.out.println("D is the biggest and it is: " + d);        
        
        if(a < b & a < c & a < d) System.out.println("A is the smallest and it is: " + a);
        if(b < a & b < c & b < d) System.out.println("B is the smallest and it is: " + b);
        if(c < a & c < b & c < d) System.out.println("C is the smallest and it is: " + c);
        if(d < a & d < b & d < c) System.out.println("D is the smallest and it is: " + d);        
    }  
}
