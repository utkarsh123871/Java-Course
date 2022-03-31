package com.company;

import java.util.Scanner;

public class CWH_07_Practice_Set {
    public static void main(String[] args) {
        // float subject1 = 45;
        // float subject2 = 48;
        // float subject3 = 49;
        // float average = (subject1 + subject2+ subject3)/3;
        // System.out.println(average);

        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello " + name + " have a good day!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you want to");
        boolean b = sc.hasNextInt();
        if (b == true) {
            System.out.println("Entered thing is number");
        } else {
            System.out.println("Entered thing is not a number");
        }


    }
    
}
