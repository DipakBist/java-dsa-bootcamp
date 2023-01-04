package com.example.oopintro.staticExample;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("Dipak");
        Test b = new Test("Rosan");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
//static class A{
//
//}
