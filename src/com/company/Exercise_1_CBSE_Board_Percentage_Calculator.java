package com.company;

import java.util.Scanner;

public class Exercise_1_CBSE_Board_Percentage_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for maths");
        int a = s.nextInt();
        
        System.out.println("Enter marks for english");
        int b = s.nextInt();
        
        System.out.println("Enter marks for hindi");
        int c = s.nextInt();
        
        System.out.println("Enter marks for computers");
        int d = s.nextInt();
        
        System.out.println("Enter marks for science");
        int e = s.nextInt();

        float percentage = ((a+b+c+d+e)/5);
        System.out.println("Percentage of student is = " + percentage + "%");
    }
}
