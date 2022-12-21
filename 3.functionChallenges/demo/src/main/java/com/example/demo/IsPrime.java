package com.example.demo;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = in.nextInt();
        boolean isprime=isPrime(number);
        if (isprime==true){
            System.out.println("The entered number is prime number");
        }else System.out.println("The entered number is not a prime number");
    }
    static boolean isPrime(int num){
        if (num<1){
            return false;
        }if (num==2){
            return true;
        }for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;

    }
}
