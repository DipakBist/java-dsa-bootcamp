package com.example.demo;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Dipak Bist");
                break;
            case 2:
                System.out.println("Rosan Bist");
                break;
            case 3:
                System.out.println("Employee number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");

                }break;
            default:
                System.out.println("Enter correct employee ID");
        }
    }
}
