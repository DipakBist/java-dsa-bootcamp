package com.example.demo;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        int radius = in.nextInt();
        areaAndCircumference(radius);
    }
    static void areaAndCircumference(int radius){
        double area;
        double circumference;
        area = Math.PI*radius*radius;
        circumference = 2*Math.PI*radius;
        System.out.println("Area of circle is: "+area);
        System.out.println("Circumference of circle is: "+circumference);

    }
}
