package com.example.code;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);
        System.out.println(a +" "+b);

        String name = "Dipak Bist";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name = "Rosan Bist";
    }


    static void swap(int num1, int num2){
        int temp =  num1;
        num1 = num2;
        num2 = temp;
    }
}
