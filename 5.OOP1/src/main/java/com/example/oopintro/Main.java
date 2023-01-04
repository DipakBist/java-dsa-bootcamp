package com.example.oopintro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] nums = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students:{roll,name,marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Students[] students = new Students[5];

        // just declaring
//        Students students1;
//        students1 = new Students();

        Students students1 = new Students(14,"Dipak Bist",85.5f);
        Students students2 = new Students();


//        students1.changeName("Shoe lover");
//        students1.greeting();

//        students1.rno=13;
//        students1.name="Dipak";
//        students1.marks = 90.5f;

        System.out.println(students1.rno);
        System.out.println(students1.name);
        System.out.println(students1.marks);

        Students random = new Students(students2);
        System.out.println(random.name);

        Students random2 = new Students();
        System.out.println(random2.name);

        Students one = new Students();
        Students two = one;
        one.name="something something";
        System.out.println(two.name);
    }
    // Create a class
    // for every single student

    static class Students{
        int rno;
        String name;
        float marks = 82;

//        We need a way to add the values of the above properties object by object
//        We need one word to access every object
        void greeting(){
            System.out.println("Hello! My name is "+ this.name);
        }

        void changeName(String name){
            this.name = name;
        }
        Students(Students other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
        Students(){
            // this is how you call a constructor from another constructor
            // internally: new Students(13,"Default person",100.0f)
            this(13,"Default person",100.0f);
        }

        // Students arpit = new Students(17,"Arpit",89.7f);
        // here, this will be replaced with arpit
        Students(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks = marks;
        }
    }
}