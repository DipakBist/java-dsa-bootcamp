package com.example.code;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);


//        System.out.println(isAmstrong(n));

        for (int i = 100; i < 1000; i++){
            if (isAmstrong(i)){
                System.out.print(i+" ");
            }
        }


    }
//    print all the 3 digits armstrong numbers

    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem =  n%10;
            n = n/10;
            sum += (rem*rem*rem);
        }
        if (sum == original){
            return true;
        }
        else return false;
    }



    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;
    }
}
