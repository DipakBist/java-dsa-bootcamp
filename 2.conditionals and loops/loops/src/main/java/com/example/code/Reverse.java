package com.example.code;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();
        int temp = number;
        int rev = 0;
        while (number>0){
            int rem = number%10;
            rev=rev*10+rem;
            number = number/10;
        }
        System.out.println("The reverse number of "+temp+" is: "+rev);
    }
}
