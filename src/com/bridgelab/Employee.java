package com.bridgelab;

import java.util.Scanner;

public class Employee {
    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name  : ");
        String name = scan.next();
        System.out.println("Enter EmailId : ");
        String emailId = scan.next();
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Enter your mobile number : ");
        String mobileNumber = scan.next();
        System.out.println("Your Name is  : " + name);
        System.out.println("Your Email ID is  : " + emailId);
        System.out.println("Your age is  : " + age);
        System.out.println("Your Mobile Number is  : " + mobileNumber);
    }
}
