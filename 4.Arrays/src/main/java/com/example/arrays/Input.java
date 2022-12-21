package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 234;
        arr[2] = 243;
        arr[3] = 253;
        arr[4] = 263;
        // [23,234,243,253,263]
//        System.out.println(arr[3]);

        // input using for loops
//        for (int i = 0;i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));



//        for (int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//        for (int num : arr){  // for every element in the array print the element
//            System.out.print(num +" "); // here num represents element of the array
//        }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i< str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

//        modify
        str[1] = "Kunal";

        System.out.println(Arrays.toString(str));


    }
}
