package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Additional");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value");
        int a= sc.nextInt();
        System.out.println("enter the second value");
        int b= sc.nextInt();
        int sum = a + b;
        System.out.println(" Total is that  " + sum + ".");

    }
}
