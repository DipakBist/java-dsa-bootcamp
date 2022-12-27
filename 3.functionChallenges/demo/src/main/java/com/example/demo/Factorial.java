package com.example.demo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial:");
        int number = in.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of "+number+" is "+result);
    }
    static int factorial(int num){
        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
