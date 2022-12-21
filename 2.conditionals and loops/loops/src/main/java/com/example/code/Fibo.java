package com.example.code;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position of number in fibonacii series:");
        int n = in.nextInt();
        int prev = 0;
        int next = 1;
        int count = 2;
        while (count<= n){
            int temp = next;
            next = next + prev;
            prev = temp;
            count++;
        }
        System.out.println("The "+n+"th fibonacii number is "+next);
    }
}
