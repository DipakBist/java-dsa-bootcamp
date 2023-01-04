package com.example.oopintro.staticExample;

public class Main {
    public static void main(String[] args) {
//    Human dipak = new Human(22,"Dipak Bist",60000,false);
//    Human Rosan = new Human(18,"Rosan Bist",6000,false);
//    Human Arpit = new Human(18,"Rosan Bist",6000,false);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);


    }
    static void fun(){
//        greeting();  // you can not use this because it requires an instance
        // but the function you are using it does not depend on instances

        // you can not access non static stuff without referencing their instances in a static context

        // hence here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }


    // we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello world");
    }

}
