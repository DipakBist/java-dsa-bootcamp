package com.example.oopintro;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b =20;

//        Integer num = 45;
//        swap(a,b);

        Integer a =10;
        Integer b = 20;
        System.out.println(a+" "+b);

//        final int bonus = 2;
//        bonus = 3;
        final A dipak = new A("Dipak");
        dipak.name = "other name";

        // when a primitive is final, you can not reassign it
//        dipak = new A("new object");

        A obj = new A("abcdefgh");
        System.out.println(obj);
//        for (int i = 0;i<100000000;i++){
//            obj = new A("random name");
//        }






    }
    static void swap(Integer a,Integer b){
        int temp = a;
        a=b;
        b=temp;
    }

}
class A{
    final int num = 10;
    String name;

    public A(String name){
//        System.out.println("Object created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");;
    }
}
