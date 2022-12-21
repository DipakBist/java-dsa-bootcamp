package com.example.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(61);
//        list.add(60);
//        list.add(69);
//        list.add(62);
//        list.add(66);
//        list.add(23);
//        list.add(6752);
//        list.add(623);
//        System.out.println(list);
//        list.add(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);


//        input

        for (int i = 0;i<5;i++){
            list.add(in.nextInt());
        }

//        get item at any index
        for (int i = 0;i<5;i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);




    }
}
