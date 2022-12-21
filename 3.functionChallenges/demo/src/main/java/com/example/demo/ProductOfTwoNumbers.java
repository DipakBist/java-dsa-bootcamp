package com.example.demo;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int first = in.nextInt();
        System.out.print("Enter second number:");
        int second = in.nextInt();
        int product = product(first,second);
        System.out.println("The product of two numbers is: "+product);
    }
    static int product(int a,int b){
        int product = a*b;
        return product;
    }
}
