package com.company;
import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
        // string is a class but can be used as a datatype in java
        // String str  = new String("harry");
        // String str = "harry";
        // System.out.println(str);
        // System.out.print("The name is: ");
        // System.out.println(str);

        // int a=6;
        // float b=5.3445f;
        // System.out.printf("The value of a is %d and value of b is %f" , a , b); 

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print("Your name is: ");
        System.out.println(st);
    }
}
