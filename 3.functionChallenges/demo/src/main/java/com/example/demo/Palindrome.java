package com.example.demo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = in.nextInt();
        boolean result = palindrome(number);
        if (result== true){
            System.out.println("The given number is palindrome number");
        } else System.out.println("The given number is not a palindrome number");
    }
    static boolean palindrome(int number){
        int rev=0;
        int num = number;
       while (number!=0){
           int lastdigit = number%10;
           rev = rev*10+lastdigit;
           number=number/10;
       }
       if (num==rev){
           return true;
       }else return false;
    }
}
