package com.example.firstideaprogram;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        float num = scanner.nextFloat();
//        int num = scanner.nextInt();
//        System.out.println(num);

//        type casting
//        int num = (int) (546.747f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b =(byte) (a);
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d);

//        byte b = 50;
//        b = b*5;

//        int number = 'A';
//        System.out.println(number);

        byte b=42;
        char c = 'a';
        short s =1024;
        int i = 50000;
        float f =5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);
    }
}