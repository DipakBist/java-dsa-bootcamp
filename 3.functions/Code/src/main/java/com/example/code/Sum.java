package com.example.code;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
//        int ans = sum2();
//        System.out.println("The sum ="+ans);

        int ans = sum3(10,20);
        System.out.println(ans);

    }
    static int sum2(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter number 1:");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2:");
        num2 = scanner.nextInt();
        sum = num1+num2;
        return sum;
    }

//    pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }



//    return the value
    static void sum(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter number 1:");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2:");
        num2 = scanner.nextInt();
        sum = num1+num2;
        System.out.println("The sum = "+sum);
    }
    /*
    return_type name(){
        //body
        return statement;
    }
     */


}
