package com.bridgelab;

public class A {
    static int b =20;//static
    int c =30;//instance
    public static void main(String[] args) {
        int a=10;//local
        A ref=new A();
        System.out.println(a);
        System.out.println(A.b);
        System.out.println(ref.c);
    }
}
