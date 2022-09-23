package com.bridgelab;

import java.util.Scanner;

public class SimpleIfStatement {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if (age>=18){
            System.out.println("Elgible For Votes");
        }

    }
}
