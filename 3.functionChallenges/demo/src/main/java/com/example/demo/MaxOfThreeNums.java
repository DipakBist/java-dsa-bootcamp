package com.example.demo;

import java.util.Scanner;

public class MaxOfThreeNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = sc.nextInt();
        System.out.println("Enter second number:");
        int second = sc.nextInt();
        System.out.println("Enter third number:");
        int third = sc.nextInt();
        System.out.println("The smallest among three entered numbers is "+smallest(first,second,third));
        System.out.println("The largest among three entered numbers is "+ largest(first,second,third));

    }
    static int smallest(int first, int second, int third){
        int min = first;
        if (second<min){
            min=second;
        }
        if (third<min){
            min = third;
        }
        return min;
    }
    static int largest(int first, int second, int third){
        int max = first;
        if (second>max){
            max = second;
        }
        if (third>max){
            max=third;
        }
        return max;
    }
}
