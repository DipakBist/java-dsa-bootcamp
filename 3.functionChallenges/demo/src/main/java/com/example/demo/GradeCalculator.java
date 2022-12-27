package com.example.demo;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks obtained:");
        int marks = in.nextInt();
        String grade = gradeCalculator(marks);
        System.out.println("Grade obtained for the entered number is "+grade);
    }
    static String gradeCalculator(int marks){
        if ((marks>=91)&&(marks<=100)){
            return "AA";
        } else if ((marks>=81)&&(marks<=90)) {
            return "AB";
        } else if ((marks<=80)&&(marks>=71)) {
            return "BB";
        } else if ((marks<=70)&&(marks>=61)) {
            return "BC";
        } else if ((marks<=60)&&(marks>=51)) {
            return "CD";
        } else if ((marks<=50)&&(marks>=41)) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
