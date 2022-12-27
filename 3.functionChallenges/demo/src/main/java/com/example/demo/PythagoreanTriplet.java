package com.example.demo;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        int arr_size = arr.length;
        boolean result=isTriplet(arr,arr_size);
        if (result==true){
            System.out.println("There is a pythagorean triplet in the given array");
        }else System.out.println("There is not any pythagorean triplet in the given array");
    }
    static boolean isTriplet(int[] arr, int n){
        for (int j = 0;j<n;j++){
            for (int k = j+1;k<n;k++){
                for (int l = k+1;l<n;l++){
                    int x = arr[j]*arr[j];
                    int y = arr[k]*arr[k];
                    int z = arr[l]*arr[l];
                    if (x==y+z||y==x+z||z==x+y){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
