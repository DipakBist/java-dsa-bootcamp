package com.example.demo;

import java.util.Scanner;

public class EligibilityToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you age:");
        int age = in.nextInt();
        eligibility(age);
    }
    static void eligibility(int age){
        if (age>=18){
            System.out.println("Yes, you are eligible to vote.");
        }else  {
            System.out.println("No you are not eligible to vote.");
        }
    }
}
