package com.example.code;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(12,13,"Dipak","Rosan","asfas");
    }
    static void multiple(int a, int b, String...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
