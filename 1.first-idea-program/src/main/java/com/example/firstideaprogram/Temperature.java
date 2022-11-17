package com.example.firstideaprogram;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in C:");
        float tempC = scanner.nextFloat();
        float tempF = (tempC *9/5)+32;
        System.out.println(tempF);
    }
}
