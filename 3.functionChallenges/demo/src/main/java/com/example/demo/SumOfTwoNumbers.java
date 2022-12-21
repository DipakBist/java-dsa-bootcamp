package com.example.demo;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int first = in.nextInt();
        System.out.print("Enter second number:");
        int second = in.nextInt();
        int sum = sum(first,second);
        System.out.println("The sum of two numbers is: "+sum);

    }
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
