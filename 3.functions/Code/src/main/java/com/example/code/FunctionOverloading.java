package com.example.code;

import java.util.Arrays;

import static com.example.code.FunctionOverloading.demo;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(67);
//        fun("Dipak Bist");
        int ans = sum(3,4);
        System.out.println(ans);
        demo(12,12,21);

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
