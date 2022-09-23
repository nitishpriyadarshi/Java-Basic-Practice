package com.bridgelab;

public class Random {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        int number = random.nextInt(1000) + 1;
        System.out.println("Random Number :" +number);
    }

}
