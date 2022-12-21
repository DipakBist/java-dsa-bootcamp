package com.example.demo;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();
        oddEven(num);
    }
    static void oddEven(int num){
        if (num%2 == 0){
            System.out.println("The number is even.");
        }
        else System.out.println("The number is odd");
    }
}
