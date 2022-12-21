package com.example.code;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Rosan";
        {
//            int a = 78; // already initialised outside the block in the same method, hence you can not intialize again
            a = 100;
            System.out.println(a);
            name = "Dipak";
            System.out.println(name);
            int c = 90; // values initialised in this block, will remain in this block
        }
        System.out.println(name);
//        System.out.println(c); //can not use outside the block

//        scoping in for loops

        for (int i = 0; i < 4;i++){
            System.out.println(i);
            int num = 90;
//            int a = 10;

        }

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
