package com.example.arrays;

public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;

        // Q: Store a person's name
        String name = "Dipak Bist";

        // Q: Store five roll numbers
        int rno1=23;
        int rno2=55;
        int rno3=18;

        //syntax
        // datatype[] variable_name = new data_type [size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23,12,45,32,15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in memory (heap)
//        System.out.println(ros[0]);


        String[] arr = new String[4];
        System.out.println(arr[0]);


    }
}
